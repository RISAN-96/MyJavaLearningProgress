package July12;
                //ava Tutorial: Introduction to Arrays

public class T26_Aray_Intro {
    public static void main(String[] args) {
        /* classroom of five hundreds students - you have to store marks of these 500 students
            you have two options - create 500 variables or use arrays */
        /* there are three ways to create an array
        1. int[]a;  // declare!
        a = new int[1]; // memory allocation!
        2. int[]b=new int[2];
        3.int[]c={100,20,300,40,55};*/

        int[]marks = new int[5];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;
        marks[4] = 555; // override
//        marks[5] = 555; // theows an error
        System.out.println(marks[0]);

    }
}
