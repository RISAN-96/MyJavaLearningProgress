package July07;/*
Java Tutorial: Literals in Java

In order to choose the data type we first need to find the type of data we want to store decimal , char or bool & how many bit it can take.
After that we need to analyze the min 7 max value we might use

Literals - A constant value which can be assigned to the variable is called literal

byte int & short are integer literal so sudhu int likhley auto detect hobe

*/

public class T4 {
    public static void main(String[] args) {
        int age = 26;
        byte age1 = 26;
        short age2 = 26;
        long age3 = 263489534573498L;
        char ch = 'R';
        float f1 = 5.6f;
        double d1 = 5.66D;
        boolean b1 = true;
        System.out.println(age + " " + age1 + " " + age2 + " " + age3 + " " + ch + " " + f1 + " " + d1  + " " + b1 );
        String str1 = "RISAN";
        System.out.println(str1);
    }
}
