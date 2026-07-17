package July9to10;

import java.util.Scanner;

/* Java Tutorial: Introduction to Strings
 string is a class in java
 strings are immutable & it cant be changed
 we use - %d for int
        - %f for float
        - %c for chat
        - %s for string
        */
public class T13 {
    public static void main(String[] args) {
        String name = new String("Day2");
        String name1 = "Day2";
        System.out.println(name);
        System.out.println(name1);

        // Different ways to print in java
        String name2 = "RISAN";
        System.out.print(name2); // no new line at the end
        System.out.println(name2);

        // printf & format
        int a = 10;
        float b = 5.06f;
        System.out.printf("the value of a is %d & the value for b is %f", a,b);
        System.out.format("the value of a is %d & the value for b is %f", a,b);


        // SKIP
        System.out.println("END");

        // input string form user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n = sc.next(); // next only takes the 1st word
        System.out.println(n);
        sc.nextLine(); // Consume the leftover newline / clearing the buffer / extra words
        System.out.println("Enter your full name: ");
        String n1 = sc.nextLine(); // nextLine takes the whole sentence
        System.out.println(n1);
    }

}
