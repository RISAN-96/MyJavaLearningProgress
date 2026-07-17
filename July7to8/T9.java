package July7to8;
/*
 Java Tutorial 09 : Associativity of Operators in Java
 today we will learn which task is done first by java

 java don't follow BODMAS rule, java use precedence & associativity
 precedence of operators = * or / , + or -
 * & / have same precedence same goes to + & -
 * & / have left to right associativity
 ++ = right to left, a = b = 45;
*/

public class T9 {
    public static void main(String[] args) {
        int a = 30*3-10/2; //
            // = 90-10/2
            // = 90-5
            // = 85
        System.out.println(a);

        int b = 30/3-10*2;
        // = 10 - 20 = -10
        System.out.println(b);

        // QUICK QUIZ
        float a1 = 6;
        float b1 = 4;
        float c1 = 2;

        float sum1 = (a1-b1)/2;
        System.out.println("sum1 = " + sum1);

        float sum2 = (b1*b1-4*a1*c1)/(2*a1);
        System.out.println("sum2 = " + sum2);

        float sum3 = (a1*a1-b1*b1);
        System.out.println("sum3 = " + sum3);

        float sum4 = a1*b1-c1;
        System.out.println("sum4 = " + sum4);
    }
}
