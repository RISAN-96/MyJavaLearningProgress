package July7;/*
 Java Tutorial 3: Variables and Data Types in Java Programming
 variable is like a container - like a bottle who can contain water,
 components -
            - documentation section     - documentation about the project       - suggested
            - package statements        - which class belongs to which package  - optional
            - import statements         - user input                            - optional
            - interface statements      -                                       - optional
            - class definition          - employee class, programmer class      - optional
            - main method               - main method definition                - essential
 Data type -
           - primitive data type - byte     - store int & takes 1 byte/8bit (-128 to 127),
                                 - short    - 2 byte 16 bit,
                                 - int      - 4 byte 32 bit ,
                                 - float    - 4 bytes 0.0f,
                                 - long     - 8 byte 64 bit,
                                 - char     - 2 bytes 16 bit, it supports Unicode
                                 - double   - 8 byte 64 bit,
                                 - bool     - true/false, size depends on jvm, def value false
           - non-primitive data type -

 Syntax    - is like vocabulary or grammar
 Reserved keyword - booked word by java, we cant use those words as class or variable name
 Variable  - means we can vary/change the value
 Rules for declaring a variable
           - must not began with a digit
           - name is case sensitive
           - should not be a keyword
           - white space not allowed
           - can contain alphabets, $ _ character & digits if the other conditions are meet
 java lang is strategically typed - means variable must be declared before use that it is a int/float

 Quick quiz: write a java programe to add three numbers
*/


public class T3 {
    public static void main (String[] args) {
        System.out.print("The sum of this numbers is: ");
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}


