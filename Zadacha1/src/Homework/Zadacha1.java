package Homework;

import java.util.Scanner;

public class Zadacha1 {
    public Zadacha1(){

    }

    public static void main(String[] args){
    perimeter();
    face();5
    }

    public static void perimeter(){
    System.out.println("Values for perimeter: ");

    System.out.println("Insert the value of a ");
    Scanner scan = new Scanner(System.in);
    int a =scan.nextInt();

    System.out.println("Insert the value of b ");
    new Scanner(System.in);
    int b=scan.nextInt();

    int Perimeter=2*a+2*b;
    System.out.println("The perimeter of this rectangle is " + Perimeter);

    }

    public static void face(){
        System.out.println("Values for face");

        System.out.println("Insert the value of a ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Insert the values of b ");
        new Scanner(System.in);
        int b = scan.nextInt();

        int S=a*b;
        System.out.println("The face of this rectangle is " + S);
    }
}
