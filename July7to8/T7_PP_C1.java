package July7to8;

import java.util.Scanner;

/* CHAPTER 1 : PRACTICE PROBLEMS
        1. Write a program to sum three numbers in java
        2. Write a program to calculate CGPA using marks of 3 subjects (out of 100)
        3. Write a program which ask the user to enter his/her name & greets them with Hello <name>, have a good day
        4. Write a program to convert km to miles
        5. Write a program to detect weather a number entered by the user is integer or not
        */
public class T7_PP_C1 {
    // Question 1 : Write a program to sum three numbers in java
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);
        q2();
    }
    // Question 2 : Write a program to calculate CGPA using marks of 3 subjects (out of 100)
    public static void q2(){
        System.out.println("CGPA CALCULATOR");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first subject marks: ");
        float sub1 = input.nextFloat();
        System.out.println("Enter second subject marks: ");
        float sub2 = input.nextFloat();
        System.out.println("Enter third subject marks: ");
        float sub3 = input.nextFloat();
        float sum = (4*(sub1 + sub2 + sub3))/300;
        System.out.println("CGPA: " + sum);
        q3();
    }
    // Question 3 : Write a program which ask the user to enter his/her name & greets them with Hello <name>, have a good day
    public static void q3(){
        System.out.println("Greeting system");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        System.out.println("Hello " + name1 + ", have a good day");
        q4();
    }
    // Question 4 : Write a program to convert km to miles
    public static void q4(){
        System.out.println("KM to Miles converter");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter km");
        double km = input.nextDouble();
        double sum = km*0.621371;
        System.out.println(sum + " miles");
        q5();
    }
    // Question 5 : Write a program to detect weather a number entered by the user is integer or not
    public static void q5(){
        System.out.println("Integer checker");
        Scanner input = new Scanner(System.in);
        boolean b1 = input.hasNextInt();
        System.out.println(b1);
    }

}
