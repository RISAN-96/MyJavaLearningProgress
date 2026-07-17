package July10.July9to10;

import java.util.Scanner;

//Java Tutorial: Practice Questions On Conditionals & Switch Case
// PRACTICE PROBLEMS CHAPTER 4
public class T19_PP_C4 {
    public static void main(String[] args) {
        // Q1: What will be the output of this program:

        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

/*      // Q2: Write a program to fins out weather a student is pass or fail ,
        if it requires avg 40% and at least 33% in each sub to pass.
        Assume 3 subjects and take marks as an input from the user.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Control System marks:");
        byte sub1 = input.nextByte();
        System.out.println("Enter DSP marks:");
        byte sub2 = input.nextByte();
        System.out.println("Enter OFC marks:");
        byte sub3 = input.nextByte();
        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("Average Marks: "+avg+"%");

        if (sub1 >= 33) {
            System.out.println("Control system Passed");
        }
        else {
            System.out.println("Control system Failed");
        }

        if (sub2 >= 33) {
            System.out.println("Digital Signal Processing Passed");
        }
        else {
            System.out.println("Digital Signal Processing Failed");
        }

        if (sub3 >= 33) {
            System.out.println("Optical Fiber Communication Passed");
        }
        else {
            System.out.println("Optical Fiber Communication Failed");
        }

        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congratulations, You have been promoted");
        }
        else {
            System.out.println("Try Again");
        }

/*
         Q3: Calculate income tax paid by an employee to the government as per the slots mentioned below:
                Income slots     Tax
                 2.5-5.0 L       5%
                5.0-10.0 L       20%
              Above 10.0 L       30%
           [ Note that there is no tax below 2.5L, Take input amount as an input from the user ]
*/
        float tax = 0;
        System.out.print("Enter your annual income in laks : ");
        float income = input.nextFloat();
        if (income <= 2.5f) {
            System.out.println("No tax needed");
        }
        else if (income <= 5.00f) {
            tax = (income - 2.5f) * 5 / 100f;
        }
        else if (income <= 10.00f) {
            tax = (5f - 2.5f) * 5f / 100f;
            tax += (income - 5.00f) * 20 / 100f;
        }
        else {
            tax = (5f - 2.5f) * 5f / 100f;
            tax += (10f - 5f) * 20f / 100f;
            tax += (income -10f) * 30f / 100f;
        }
        System.out.println("Your tax is: " + tax * 100000 + " taka");
        System.out.println("Your tax is: " + tax  + " laks taka12");



        // Q4: Write a Java program to find out the day of the week given the number
        // [ 1 for Monday, 2 for Tuesday ... and so on!]
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between (1-7): ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Saturday");
            break;
            case 2:
                System.out.println("Sunday");
            break;
            case 3:
                System.out.println("Monday");
            break;
            case 4:
                System.out.println("Tuesday");
            break;
            case 5:
                System.out.println("Wednesday");
            break;
            case 6:
                System.out.println("Thursday");
            break;
            case 7:
                System.out.println("Friday");
            break;
        }


        // Q5: Write a java program to find weather a year entered by the user is a leap year or not.
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in2.nextInt();
        // If the year is divisible by 4, it's a leap year.
        if (year % 400 == 0) {
            System.out.println("Leap year");
        }
        else if (year % 100 == 0) {
            System.out.println("Not a Leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

        // single line code

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // Q6: Write a program to find out the type of website form the url
        // com = commarcial website
        // org = orgational website
        // bd = bangladeshi website

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website url: ");
        String url =  sc.nextLine();
/*        System.out.println(url.endsWith("com"));
        System.out.println(url.endsWith("org"));
        System.out.println(url.endsWith("bd"));

        if (System.out.url.endsWith("com")) == true ){
            System.out.println("Commercial website");
        } else if (System.out.println(url.endsWith("org")) == true){
            System.out.println("Organization Website");
        } else if (System.out.println(url.endsWith("bd")) == true){
            System.out.println("Bangladeshi website");
        } else {
            System.out.println("Unidentified Website");
        }*/

        if (url.endsWith("com")){
            System.out.println("Commercial website");
        } else if (url.endsWith("org")){
            System.out.println("Organization Website");
        }  else if (url.endsWith("bd")){
            System.out.println("Bangladeshi website");
        }























    }
}
