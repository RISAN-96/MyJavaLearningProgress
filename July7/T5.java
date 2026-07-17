//Java Tutorial: Getting User Input in Java

package July7;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println(num1 + " " + num2);
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
        m2();
    }


    public static void m2() {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = input.nextFloat();
        System.out.println("Enter second number");
        float num2 = input.nextFloat();
        System.out.println(num1 + " " + num2);
        float sum = num1 + num2;
        System.out.println("The sum is " + sum);
        m3();
    }


    public static void m3() {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner(System.in);
        boolean b1 = input.hasNextInt();  //checks the input is int literal or not
        System.out.println(b1);
        m4();
    }

    public static void m4() {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner(System.in);
        String str =  input.next(); //next only read the first word
        System.out.println(str);
        String str1 =  input.nextLine(); //nextLine read the first sentence
        System.out.println(str);
    }

}