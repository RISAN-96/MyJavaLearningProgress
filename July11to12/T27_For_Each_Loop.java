package July11to12;
            //Java Tutorial: For Each Loop in Java
            // i & element is available in for loop
            // only element is available in for each loop

import java.util.Arrays;

public class T27_For_Each_Loop {
    public static void main(String[] args) {
/*      float[]c={100.1f,20.5f,300.4f,40.6f,55.4f};
        System.out.println(c[2]);
        System.out.println(c.length);
        String[]students={"Risan","Nisa","Babu"};
        System.out.println(Arrays.toString(students));*/

        int[]marks={10,20,30,40,50};
        System.out.println(marks.length);
        // Displaying the array ( Naive way )
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array ( For loop )
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]); //array traverse method
        }

        // Quick quiz: Write a program to print the elements of an array in reverse order
        // Displaying the array ( For loop ) in reverse order
        for(int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }

        // Displaying the array ( for each loop )
        for(int element:marks) {
            System.out.println(element);
        }

    }
}
