/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdtree;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class WhiteBoardManager {

    public static void main(String[] args) {
        Menu mnu = new Menu();
        System.out.println("============White board manager=================");
        mnu.add("Add new white board");
        mnu.add("Find a white board");
        mnu.add("Update a white board");
        mnu.add("List all white board");
        mnu.add("Quit");
        Scanner sc = new Scanner(System.in);
        WhiteBoardList obj = new WhiteBoardList();
        int choice;
        do {
            choice = mnu.getUserChoice();
            switch (choice) {
                case 1:
                    if (obj.add()) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Added failed");
                    }

                    break;

                case 2:
                    String id3 = null;
                    System.out.println("Input id to find:");
                    sc = new Scanner(System.in);
                    id3 = sc.nextLine();
                    if(obj.findWhiteBoard(id3) == null){
                        System.out.println("Not found");
                    }else{
                        System.out.println(obj.findWhiteBoard(id3));
                    }
                    break;
//                case 3:
//                    String id = null;
//                    System.out.println("Input id to remove:");
//                    sc = new Scanner(System.in);
//                    id = sc.nextLine();
//                    if (obj.deleteWhiteBoard(id)) {
//                        System.out.println("Deleted");
//                    } else {
//                        System.out.println("Not found");
//                    }
//                    break;
                case 3:
                    String id2 = null;
                    System.out.println("Input id to update:");
                    id2 = sc.nextLine();
                    sc = new Scanner(System.in);
                    if (obj.update(id2)) {
                        System.out.println("Updated");
                    } else {
                        System.out.println("Not found");
                    }
                    ;
                    break;
                case 4:
                    obj.displayAll();
                    break;

            }
        } while (choice >= 0 && choice < 5);
    }

}
