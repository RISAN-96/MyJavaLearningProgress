package July11to12;
                    //Practice problems - array

public class T29_PP {
    public static void main(String[] args) {
/*        PP1: Create a array of 5 flats & calculate their sum;
        int sum = 0;
        int [] flats;
        flats = new int [5];
        flats[0] = 1;
        flats[1] = 2;
        flats[2] = 3;
        flats[3] = 4;
        flats[4] = 5;
        for (int i = 0; i < 5; i++){
//            System.out.print(flats[i] + " ");
            sum = sum + flats[i];
        }
        System.out.println("");
        System.out.println(sum);

//        or
        int sum2 = 0;
        int [] flat2 = {10,11,12,12,14};
        for (int elements:flat2){
            sum2 = sum2 + elements;
        }
        System.out.println(sum2);*/

/*//        PP2: Write a program to find out weather a given integer is on an array or not;
        int [] arr1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int num1 = 400;
        boolean available = false;
        for (int elements:arr1){
            if (num1==elements) {
                available = true;
                break;
            }
        }
        if (available) {
            System.out.println("Yes, the value is available on the array");
        }  else {
            System.out.println("No, the value is not available on the array");
        }*/

/*
//        PP3: Calculate the average marks from an array containing marks of
//        all students in physics using for each loop;
        int [] physicsMarks = {10,20,30,40,50};
        int sum = 0;
        for (int elements:physicsMarks) {
            sum += elements;
        }
        System.out.println("Average physics mark of the students is " + sum/physicsMarks.length);
*/


/*//        PP4: Create a Java program to add two mattress of size 2x3
        int [][] mat1 = {{111,112,113},{121,122,123}};
        int [][] mat2 = {{211,212,213},{221,222,223}};
        int [][] newMat1 = {{0,0,0},{0,0,0}};
//        int [][] newMat1 = new int[2][3];

        for (int i = 0; i < mat1.length; i++) {  // row number of time
            for (int j = 0; j < mat1[i].length; j++) {  // column number of time
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                newMat1[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {  // row number of time
            for (int j = 0; j < mat1[i].length; j++) {  // column number of time
                System.out.print(newMat1[i][j] + " ");
                newMat1[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }*/


/*//        PP5: Write a program to reverse an array
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++) {
            //swap a[i] & a [l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }*/

/*//        PP6: Write a program to find the maximum element in a java array
        int [] arr2 = {167,200,300,345,523};
        int max =0;
        for (int element:arr2){
            if(element>max){
                max = element;
            }
        }
        System.out.println(max);*/

/*//        PP7: Write a program to find the minimum element in a java array
        int [] arr3 = {345,456,676,123,678};
        int max2 = Integer.MAX_VALUE;
        for (int element:arr3){
            if(element<max2){
                max2 = element;
            }
        }
        System.out.println(max2);*/

//        PP8: Write a program to find weather an array is sorted or not
        int [] arr5 = {1,2,3,4,5,6,7,8,9,10};
        boolean isSorted = true;
        for(int i=0;i<arr5.length-1;i++) {
            if(arr5[i]>arr5[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The given array is sorted");
        }
        else {
            System.out.println("The given array is not sorted");
        }



    }
}
