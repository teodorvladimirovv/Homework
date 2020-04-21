package Homework;

import java.util.Scanner;



public class Zadacha3 {

    public static void main(String[] args){
        cheater();

    }
    public static void cheater(){
        System.out.println(" Въведете етаж между 0-8: ");
        Scanner scan = new Scanner(System.in);
        int Floor = scan.nextInt();
        switch(Floor){
            case 0:
                System.out.println("Ауч");
                break;
            case 1:
                System.out.println("Здравей Габи");
                break;
            case 2:
                System.out.println("Опа Папи");
                break;
            case 3:
                System.out.println("Как си Тонке");
                break;
            case 4:
                System.out.println("Ехоо Гошо");
                break;
            case 5:
                System.out.println("Хей Живе");
                break;
            case 6:
                System.out.println("Опалянка Владка");
                break;
            case 7:
                System.out.println("Аууу Полиии");
                break;
            case 8:
                System.out.println("Здравей Тошка");
                break;

        }
    }
}
