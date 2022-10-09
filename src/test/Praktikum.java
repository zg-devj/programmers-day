package test;
import java.util.Scanner;

class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year))
            System.out.println("12.09." + year);
        else
            System.out.println("13.09." + year);
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            return true;
        return false;
    }
}