package July10.July9to10;

import java.util.Scanner;

/*
                PRACTICE PROBLEM CHAPTER 2

Q1. What will be the result of the following expression - float a = 7/4*9/2
Q2. Write a Java program to encrypt a grade by adding 9 to it. Decrypt it to show the correct grade.
Q3. Use comparison operators to find out whatever a given number is greater than the user input or not.
Q4. Write the following expression in a Java programe v^2 - u^2 / 2qs
Q5. Find the value of the following expression: int a = 7*49/7+35/7  so, a=?

*/
public class T12_PP_C2 {
    public static void main(String[] args) {
        // Q1
        float a = 7/4*9/2; // integer value so result will be 4 & incorrect
        float a1 = 7/4.0f * 9/2.0f; // converted to float, now the result will be correct
        System.out.println(a);
        System.out.println(a1);

        // Q2; Grade cheat code
        float b = 3.03f;
        float b1 = b + 8;
        System.out.println(b1-8);

        // or,
        char grade = 'B';
        grade = (char)(grade+8);
        // decrypting
        grade = (char)(grade-8);
        System.out.println(grade);

        // Q3
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input = scan.nextInt();
        System.out.println(input>50);

        // Q4. Write the following expression in a Java program v^2 - u^2 / 2qs
        int v = 1;
        int u = 2;
        int q = 3;
        int s = 4;
        int ex = (v*v - u*u) / 2*q*s;
        System.out.println(ex);

        // Q5. Find the value of the following expression: int a = 7*49/7+35/7  so, a=?
        int ex2 = 7*49/7+35/7;
        int ex3 = (7*49)/7+(35/7);
        System.out.println(ex2); // 54
        System.out.println(ex3); // 54
    }
}
