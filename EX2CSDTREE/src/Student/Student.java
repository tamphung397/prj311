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
public class Student implements Comparable{
    String ID = "";
    String name ="";
    int mark = 0;

    public Student(String ID) {
        this.ID = ID;
    }

  public  Student(String ID, String name, int mark){
      this.ID = ID;
      this.name = name;
      this.mark = mark;
  }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
  
  
  
    @Override
    public int compareTo(Object o) {
        return ID.compareTo(((Student)o).ID);
    }

    @Override
    public String toString() {
        return ID + ", " + name + ", "+mark;
    }
    
    
}
