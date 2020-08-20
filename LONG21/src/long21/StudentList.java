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
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StudentList {

    ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList();
    }

    public StudentList(ArrayList<Student> list) {
        this.list = list;
    }
    
    //find student's info by id
    public Student findById(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    //add a student in list. if success return true
    public boolean create(Student s) {
        if (findById(s.getId()) != null) {
            return false;
        }

        list.add(s);
        return true;
    }

    //find students by name and sort in ascending order
    public ArrayList<Student> findByNameAndSort(String name) {
        if (list.isEmpty()) {
            return null;
        }

        ArrayList<Student> tmp = new ArrayList<>();

        for (Student s : list) {
            if (s.getName().contains(name) || name.compareToIgnoreCase(s.getName()) == 0) {
                tmp.add(s);
            }
        }
        if (tmp.isEmpty()) {
            return null;
        }
        Collections.sort(tmp);
        return tmp;
    }

    //update each property of each student
    public boolean update(int id) {
        //if list is empty, return false
        if (list.isEmpty()) {
            System.out.println("Empty list!");
            return false;
        }

        //if id does not exist return false too
        if (findById(id) == null) {
            System.out.println("Not found!");
            return false;
        }

        //if id does exist, updating starts
        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            //menu
            System.out.println("Choose what you update:");
            System.out.println("    1. Name");
            System.out.println("    2. Semester");
            System.out.println("    3. Course name");
            System.out.println("    4. Back");
            choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    System.out.print("Input new name: ");
                    String name = sc.nextLine();
                    findById(id).setName(name);
                    break;
                }
                case "2": {

                    int semester = 0;
                    boolean flag = false;

                    do {
                        try {
                            System.out.print("Input new semester: ");
                            semester = Integer.parseInt(sc.nextLine());
                            flag = false;
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            flag = true;
                        }

                        if (semester <= 0) {
                            System.out.println("Invalid input!");
                            flag = true;
                        } else {
                            flag = false;
                        }
                    } while (flag);
                    findById(id).setSemester(semester);
                    break;
                }
                case "3": {
                    String courseName[] = new String[3];
                    String userChoice;
                    int count = 0;
                    boolean flag = true;
                    //thay doi course name
                    do {
                        System.out.println("1. Java");
                        System.out.println("2. .Net");
                        System.out.println("3. C/C++");
                        System.out.println("4. Back");
                        System.out.println("Input new course name(s):");
                        userChoice = sc.nextLine();
                        switch (userChoice) {
                            //choose courses here
                            case "1": {
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
                                findById(id).setCourseName(courseName);
                                break;
                            }
                            case "2": {
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
                                findById(id).setCourseName(courseName);
                                break;
                            }
                            case "3": {
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
                                findById(id).setCourseName(courseName);
                                break;
                            }

                        }
                        if (userChoice.compareToIgnoreCase("4") != 0) {
                            System.out.println("Choose more courses name or press 4 to be back!");
                        }
                    } while (userChoice.compareToIgnoreCase("4") != 0);
                    break;
                }
            }
            if (choice.compareTo("4") != 0) {
                System.out.println("Choose more updated students or press 4 to be back!");
            }
        } while (choice.compareTo("4") != 0);

        return true;
    }

    //delete a student by id 
    public Student delete(int id) {
        if (list.isEmpty()) {
            System.out.println("Empty list!");
            return null;
        }
        if (findById(id) == null) {
            System.out.println("Not found!");
        }
        Student removedStudent = findById(id);
        list.remove(removedStudent);
        return removedStudent;
    }

    //display all students' informations
    public void display() {
        for (Student student : list) {
            System.out.print("ID: " + student.getId() + ", ");
            System.out.print("Name: " + student.getName() + ", ");
            System.out.print("Semester: " + student.getSemester() + ", ");
            System.out.println("Course name: ");

            for (int i = 0; i < student.getCourseName().length; i++) {
                if (student.getCourseName()[i] != null) {
                    System.out.println("\t\t\t\t" + (i + 1) + "." + student.getCourseName()[i]);
                }
            }
        }
    }

    //display all students' information with total courses
    public void displayWithTotal() {
        if (list.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        int total = 0;
        for (Student student : list) {
            total = 0;
            System.out.print("ID: " + student.getId() + ", ");
            System.out.print("Name: " + student.getName() + ", ");
            System.out.print("Semester: " + student.getSemester() + ", ");
            System.out.println("Course name: ");

            for (int i = 0; i < student.getCourseName().length; i++) {
                if (student.getCourseName()[i] != null) {
                    System.out.println("\t\t\t\t" + (i + 1) + "." + student.getCourseName()[i]);
                    total++;
                }
            }

            System.out.println("TOTAL: " + total);
        }
    }
}
