package July09;
/*
Java Tutorial 10: Data Type of Expressions & Increment/Decrement Operators
Resulting data type after arithmetic operation
        byte + short = int;
        short + int = int;
        long + float = float;
        int + float = float;
        character + int = int;
        character + short = int;
        long + double = double;
        float + double = double;
*/

public class T10 {
    public static void main(String[] args) {
        byte b = 5;
        int i = 6;
        short s = 8;
        long l = b + i + s;
        float f = 6.54f + 6;
        char c = 'a';

        int a1 = b + s ;
        System.out.println(a1);
        int a2 = s + i;
        System.out.println(a2);
        float a3 = l + f;
        System.out.println(a3);
        float a4 = i + f;
        System.out.println(a3);
        int a5 = c + i;
        System.out.println(a5);

        // Increment & decrement operator
        int x = 50;
        System.out.println(x);  // same out = 50
        System.out.println(x++); // print x / 50 then add 1 with x
        System.out.println(x); // print latest x = 51
        System.out.println(++x); // add 1 with x then print x = 52
        System.out.println(x); // 52

        //same goes for minus (-)

        // QUICK QUIZ : Try increment & decrement operators on a Java variable
        int e = 10;
        int g = ++e;
        int h = --e;
        int j = h*5;
        System.out.println(e); // 10
        System.out.println(g); // 11
        System.out.println(h); // 10
        System.out.println(j); // 50
        char aa = 'a';
        System.out.println(++aa); // b

    }
}
