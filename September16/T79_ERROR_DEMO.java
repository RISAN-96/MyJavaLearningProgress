package September16;

import java.util.Scanner;

public class T79_ERROR_DEMO {
    public static void main(String[] args) {
        // SYNTAX ERROR
/*        int a = 1;
        int b = 2 // click on the bulb to get fix suggestions
        System.out.println(a+b);*/

        // LOGICAL ERROR DEMO
/*        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }
        //2
        //3
        //5
        //7
        //9 -> logical error
        // In logical error ide cant guess/track the error */

        // Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000/k is: " + 1000/k);

        //C:\Users\RISAN\.jdks\corretto-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.1\lib\idea_rt.jar=4640" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\RISAN\OneDrive\Documents\LEARNING\MyJavaLearningProgress\out\production\MyJavaLearningProgress September16.T79_ERROR_DEMO
        //0
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at September16.T79_ERROR_DEMO.main(T79_ERROR_DEMO.java:29)
        //
        //Process finished with exit code 1
    }
}
// logical error is hard to find