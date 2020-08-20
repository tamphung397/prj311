/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author USER
 */
public class StudentManger1 {

    public static void main(String[] args) {
        StudentList list = new StudentList();

        Student st = new Student("SE009", "Nam", 4);
        list.add(st);
        
        st = new Student("SE010", "Hung", 7);
        list.add(st);
        st = new Student("SE011", "Tin", 8);
        list.add(st);
        st = new Student("SE012", "Hao", 9);
        list.add(st);
        st = new Student("SE013", "Tuan", 2);
        list.add(st);
        
        list.output();
        
        String ID ="SE003";
        st = list.search(ID);
        if(st == null || !st.getID().equals(ID) )
            System.out.println("Student " + ID + " does not exist");
        else
            System.out.println("Found " + st);
        ID = "SE009";
        st = list.search(ID);
        if(st == null || !st.getID().equals(ID)){
             System.out.println("Student " + ID + "does not exist");
        }else{
            System.out.println("Found " + st);
        }
                
    }

}
