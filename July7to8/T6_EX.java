package July7to8;


/*
Exercise 1.1: Write a program to calculate percentage of a given student in SSC Board exam.
His marks from 5  subjects must be taken as input from the keyboard.
(marks are out of 100)
*/

import java.util.Scanner;

public class T6_EX {
    public static void main(String[] args) {
        System.out.println("Marks percentage calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first subject number: ");
        int first = input.nextInt();
        System.out.print("Enter second subject number: ");
        int second = input.nextInt();
        System.out.print("Enter third subject number: ");
        int third = input.nextInt();
        System.out.print("Enter fourth subject number: ");
        int fourth = input.nextInt();
        System.out.print("Enter fifth subject number: ");
        int fifth = input.nextInt();
        int sum = first + second + third + fourth + fifth;
        System.out.println("Total marks " + sum);
        int sum1 = (sum * 100)/500;
        System.out.println("You have got " + sum1 + "% marks");


    }
}
