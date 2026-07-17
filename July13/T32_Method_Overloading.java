package July13;
/* The values from the method call (a & b) are copied to the a & b of the function
* my sum, Thus even if we modify the values a & b inside the method, the values in the
* main method will not change*/
/*  Void return type - when we dont want our method to return anything, we use void as the return type

    Static keyword - Static keyword is used to associate a method of a given class with the class return
    then the object. Static method in a class is shared by all the

    Process of method invocation in java

    Method overloading - two or more method having same name but diff parameters.
    Such methods are called overloaded method.

    */

import java.sql.SQLOutput;

public class T32_Method_Overloading {
//    static void tellJoke(){
//        System.out.println("I invented a new word!\n" + "Plagiarism!");
//    }
//
//    int sum(int a, int b) {
//        int c = a+b;
//        return c;
//    }
//static int sum(int a, int b) {
//    return a + b;
//}
//
//    static void change(int a) {
//        a = 4353;
//    }
//    static void change2(int [] arr) {
//        arr[0] = 96;
//    }

    // METHOD OVERLOADING::same name diff parameters
    static void foo(){
        System.out.println("Hello World, good morning!");
    }
    static void foo(int a){
        System.out.println("Hello, " + a + " good morning!");
    }
    static void foo(int x, int y){
        System.out.println("Hello, " + x + " good morning!");
        System.out.println("Hello, " + y + " good morning!");
    }

    public static void main(String[] args) {
//        tellJoke();
//
//        int x = 3;
//        int y = 5;
//        T32_Method_Overloading obj = new T32_Method_Overloading();
//        int z = obj.sum(x, y);
//        System.out.println(z);

//        System.out.println("The sum of 4 & 5 is " + sum(4,5));

//
//        int [] marks = {54,45,34,78,56,34,56,35};
//
//        // Case 1: changing the integer - array case
//        int r = 45;
//        change(r);
//        System.out.println(r); // 45 e thakbe change hobena
//
//        // Case 2: changing the array
//        int [] marks1 = {54,45,34,78,56,34,56,35};
//
//        change2(marks1);
//        System.out.println(marks1[0]); // change hobe

            // METHOD OVERLOADING::same name diff parameters
            foo();
            foo(10);
            foo(10,30); //Arguments are actual!

    }




}
