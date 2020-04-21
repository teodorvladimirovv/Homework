package Homework;

import java.util.Scanner;

public class Zadacha2 {
    public Zadacha2() {
    }

    public static void main(String[] args) {
        DaysInAMonth();
    }

    public static void DaysInAMonth() {

        System.out.println("Enter a month: ");
        Scanner scan = new Scanner(System.in);
        String Month = scan.nextLine();
        if (!Month.equals("January") && !Month.equals("March") && !Month.equals("May") && !Month.equals("July") && !Month.equals("August") && !Month.equals("October") && !Month.equals("December")) {
            if (!Month.equals("April") && !Month.equals("June") && !Month.equals("September") && !Month.equals("November")) {
                if (Month.equals("February")) {
                    System.out.println(Month + " has 28 days.");
                }
            } else {
                System.out.println(Month + " has 30 days.");
            }
        } else {
            System.out.println(Month + " has 31 days.");
        }
    }
}