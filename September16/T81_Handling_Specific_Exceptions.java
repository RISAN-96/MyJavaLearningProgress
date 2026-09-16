package September16;

import java.util.Scanner;

public class T81_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of marks you want to enter: ");
        int xx = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[xx]);
            System.out.println("The value of array-value/number is: " + marks[xx]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println("Exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println("Exception: " + e);
        }catch (Exception e) {
            System.out.println("Some other exception occured");
            System.out.println("Exception: " + e);
        }

    }
}

/*Enter the number of marks you want to enter:
66
Enter the number you want to divide the value with:
66
Some exception occured
Exception: java.lang.ArrayIndexOutOfBoundsException: Index 66 out of bounds for length 5*/