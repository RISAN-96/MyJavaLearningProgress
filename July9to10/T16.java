package July9to10;
// Java Conditionals: If-else Statement in Java
// program can take decision using if else function
// decisions making statement in java 1. If else statement, 2. Switch statement

import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You are too young to drive");
        } // else block is optional, if we need it we can use
        else {
            System.out.println("You are too good to drive");
        }


        // relation operators as condtion
        if (age != 18) {
            System.out.println("You are less or over 18 years old.");
        }
        if (age == 18) {
            System.out.println("You are 18 years old.");
        }


        boolean cond = (age >=18);
        if (cond) {
            System.out.println("You are good to drive.");
        }
        else  {
            System.out.println("You are less then 18 years old.");
        }
    }
}
