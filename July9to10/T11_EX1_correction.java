package July9to10;

import java.util.Scanner;

public class T11_EX1_correction {
    public static void main(String[] args) {
            System.out.println("5 Subject Marks percentage calculator");
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
            float sum1 = (sum * 100)/500.0f;
            System.out.println("You have got " + sum1 + "% marks");
    }
}
