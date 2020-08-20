/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package long21;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class LONG21 {

    //input an valid integer number
    public static int inputAnIntNum(String mess) {
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.print("Input " + mess + ": ");
        do {
            try {
                value = Integer.parseInt(sc.nextLine());
                if (value <= 0) {
                    System.out.println(mess + " > 0, please!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Input again: ");
            }
        } while (true);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ID, Student Name,Semester, Course Name (There are only three courses: Java, .Net, C/C++)
        //temperary variables
        int choice;
        int id, semester;
        String name;
        String[] courseName;
        
        //list contains students
        StudentList list = new StudentList();
        
        //count variable for adding courses progress
        int count = 0;
        
        //time checks how many we add student for the first time
        int time = 3;
        
        do {
            //menu
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("    1. Create");
            System.out.println("    2. Find and sort");
            System.out.println("    3. Update/Delete");
            System.out.println("    4. Report");
            System.out.println("    5. Exit");

            //userChoice
            choice = inputAnIntNum("your choice");

            //run functions
            switch (choice) {
                case 1: {
                    //create student's info
                    boolean flag = true;

                    for (int i = 0; i < time; i++) {
                        courseName = new String[3];
                        System.out.println("Adding new student!");
                        
                        //input new id
                        do {
                            id = inputAnIntNum("id");
                            if (list.findById(id) != null) {
                                System.out.println("Duplicated value!");
                            }
                        } while (list.findById(id) != null);

                        //input new name
                        System.out.print("Input name: ");
                        name = sc.nextLine();
                        
                        //input new semester
                        semester = inputAnIntNum("semester");
                        
                        //choose courses
                        int userChoice;
                        do {
                            //choose courses to add it in list
                            System.out.println("1. Java");
                            System.out.println("2. .Net");
                            System.out.println("3. C/C++");
                            System.out.println("4. Back");
                            userChoice = inputAnIntNum("course name");
                            switch (userChoice) {
                                case 1: {
                                    for (int j = 0; j < count; j++) {
                                        if (courseName[j].compareToIgnoreCase("Java") == 0) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        courseName[count] = "Java";
                                        count++;
                                    }
                                    flag = true;
                                    break;
                                }
                                case 2: {
                                    for (int j = 0; j < count; j++) {
                                        if (courseName[j].compareToIgnoreCase(".Net") == 0) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        courseName[count] = ".Net";
                                        count++;
                                    }
                                    flag = true;
                                    break;
                                }
                                case 3: {
                                    for (int j = 0; j < count; j++) {
                                        if (courseName[j].compareToIgnoreCase("C/C++") == 0) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        courseName[count] = "C/C++";
                                        count++;
                                    }
                                    flag = true;
                                    break;
                                }
                            }
                            if (userChoice != 4) {
                                System.out.println("Choose more courses. \nIf you want to"
                                        + " stop, press 4 and enter button.");
                            }
                        } while (userChoice != 4);
                        count = 0;
                        list.create(new Student(id, name, semester, courseName));
                        if (i == time - 1) {
                            System.out.println("Do you want to continue (Y/N)?");
                            String c = sc.nextLine();
                            if (c.compareToIgnoreCase("y") == 0) {
                                time++;
                            } else {
                                time = 1;
                            }
                        }
                    }
                    break;
                }
                //find students by name and sort them then displaying them
                case 2: {
                    System.out.print("Input name: ");
                    name = sc.nextLine();
                    if (list.findByNameAndSort(name) == null) {
                        System.out.println("Not found!");
                    } else {
                        StudentList tmp = new StudentList(list.findByNameAndSort(name));
                        tmp.display();
                    }
                    break;
                }
                //update and delete a student 
                case 3: {
                    //choose u to update, d to delete
                    System.out.println("Select U/D:");
                    System.out.print("Input your choice: ");
                    String userChoice = sc.nextLine();
                    //start to update here
                    if (userChoice.compareToIgnoreCase("u") != 0
                            && userChoice.compareToIgnoreCase("d") != 0) {
                        System.out.println("Fail to update!");
                    } else if (userChoice.compareToIgnoreCase("u") == 0) {
                        id = inputAnIntNum("id");
                        boolean result = list.update(id);
                        if (result) {
                            System.out.println("Update sucessfully!");
                        } else {
                            System.out.println("Fail to update!");
                        }
                        //delete here
                    } else if (userChoice.compareToIgnoreCase("d") == 0) {
                        id = inputAnIntNum("id");
                        if (list.delete(id) == null) {
                            System.out.println("Fail to delete!");
                        } else {
                            System.out.println("Delete sucessfully!");
                        }

                    } else {
                        break;
                    }
                    break;
                }
                //display all students' informations by displayWithTotal function
                case 4: {
                    list.displayWithTotal();
                    break;
                }
            }
        } while (choice != 5);

    }
}