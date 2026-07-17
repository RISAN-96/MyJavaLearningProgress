package July9to10;
//Java Tutorial 18: Switch Case Statements in Java

import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();

        if (age > 56) {
            System.out.println("You are experienced");
        } else if (age>46) {
            System.out.println("You are semi experienced");
        } else if (age>36) {
            System.out.println("You are experiencing");
        } else if (age>26) {
            System.out.println("You are beginning");
        } else if (age>18) {
            System.out.println("You have the pass");
        } else {
            System.out.println("You are having dreamy days");
        }

        // Switch case control instructions
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 26:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to retired!");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("You are going to drink mango juice");


                // we can use char, string, int anything instead of age
    }
}
