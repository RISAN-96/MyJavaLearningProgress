package September16;

import java.util.Scanner;

// 1. Write a java program to demonstrate syntax, logical & runtime errors.
// 2. Write a java program that prints "Haha" during arithmetic exceptions and "Hehe" during an illegal argument exceptions.
// 3. .... allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "Error"
// 4. Modify program in Q3 to throw a custom Exception if max retries are reached
// 5. Wrap the program in R# inside a method which throws your custom exception.
public class T86_PracticeSet_Error_Exceptions {
    public static void main(String[] args) {
      /*  // problem 1
        int a=5 // syntax error
        int h = 78;
        int year_born = 2000-78; // logical error
        System.out.println(6/0); // exception*/

/*        // problem 2
        try{
            int a = 666/0;
        } catch (IllegalArgumentException e){
            System.out.println("Hehe");
        } catch (ArithmeticException e){
            System.out.println("Haha");
        }*/

        // problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0]=5;
        marks[1]=5;
        marks[2]=5;
        Scanner input = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
            index=input.nextInt();
            System.out.println("The value of marks[index] is " + marks[index]);
            break;
            } catch (Exception e) {
                System.out.println("Invalid index");
            i++;
            }
        } if(i>=5){
            System.out.println("Error...");
        }


    }
}























