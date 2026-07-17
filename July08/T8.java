package July08;

// Java Tutorial 08 : Operators, Types of Operators & Expressions in Java

public class T8 {
    public static void main(String[] args){
        // arithmetic operators - cant works with booleans, % works with float & doubles
        int a = 4;
        int b = 6 + a; // +,-,x,/ can be done
        System.out.println(b);

        int c = 4;
        int d = 6 % c; // Modulo operator
        System.out.println(d);

        float a1 = 4.5f;
        float a2 = 3.5f;
        System.out.println(a1%a2); // return decimal remainder

        // assignment operators
        int e = 4;
        e += 6; // add 6 with e
        System.out.println(e);

        // comparison operators
        int f = 5;
        int g = 4;
        System.out.println(f==g);
        System.out.println(f>g);
        System.out.println(f<g);
        System.out.println(f!=g);

        // logical operators - && checks all the conditions - || wants any of them to be true
        int h = 5;
        int i = 4;
        System.out.println(h>i && h>8 && h<80); // if any of the condition get false the ans will be false
        System.out.println(h>i || h>8 || h<80); // if any of the condition get true the ans will be true

        // bitwise operators -- valovabe bujhinai
//             10
//             11
//           -----
//             10

    }
}
