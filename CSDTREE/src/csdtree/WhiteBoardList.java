/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdtree;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author USER
 */
public class WhiteBoardList {

    TreeSet<WhiteBoard> list;
    Scanner sc = new Scanner(System.in);

    public WhiteBoardList() {
        list = new TreeSet<>();
    }

    public boolean add() {
        String id = null;
        int height = 0;
        int length = 0;
        int day = 0;
        double price = 0;

        boolean lamtiep = true;

        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input id:");
                id = sc.nextLine();
                if (id.isEmpty()) {
                    throw new Exception("Id not null");
                }
                lamtiep = false;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input height:");

                height = sc.nextInt();
                if (height < 0) {
                    throw new Exception("height must >= 0");

                }
                lamtiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Sai format");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input length:");
                length = sc.nextInt();
                if (length < 0) {
                    throw new Exception("length must >= 0");

                }
                lamtiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Sai format");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input day:");
                day = sc.nextInt();
                if (day < 0) {
                    throw new Exception("day must >= 0");

                }
                lamtiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Sai format");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Input price:");
                price = sc.nextDouble();
                if (price < 0) {
                    throw new Exception("price must >= 0");

                }
                lamtiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Sai format");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        WhiteBoard w = new WhiteBoard(id, height, length, day, price);
        if (w == null) {
            return false;
        }
        if (list.add(w)) {
            return true;
        }
        return false;
    }

    public WhiteBoard findWhiteBoard(String id) {
        for (WhiteBoard whiteBoard : list) {
            if (whiteBoard.getId().equals(id)) {
                return whiteBoard;
            }
        }
        return null;
    }

    public boolean deleteWhiteBoard(String id) {
        WhiteBoard pos = findWhiteBoard(id);
        if (pos == null) {
            return false;
        } else {
            list.remove(pos);
        }
        return true;
    }

    public boolean update(String id) {
        WhiteBoard pos = findWhiteBoard(id);
        if (pos == null) {
            return false;
        } else {
            String newManu;
            int newheight;
            int newLength;
            int newDay;
            double newPrice;

            sc = new Scanner(System.in);
            System.out.println("Input new height:");

            newheight = sc.nextInt();

            pos.setHeight(newheight);

            sc = new Scanner(System.in);
            System.out.println("Input new length:");
            newLength = sc.nextInt();
            pos.setLength(newLength);

            sc = new Scanner(System.in);
            System.out.println("Input new day:");
            newDay = sc.nextInt();
            pos.setDay(newDay);

            sc = new Scanner(System.in);
            System.out.println("Input new price:");
            newPrice = sc.nextDouble();
            pos.setPrice(newPrice);

        }
        return true;
    }

    public void displayAll() {
        for (WhiteBoard w : list) {
            System.out.println(w);
        }
    }

}
