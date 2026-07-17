package July17;

public class T35_PP {
    //    PP1 METHOD
/*    static void multiplication(int a){
        for(int i = 1; i <= 10; i++){
            System.out.format("%d X %d = %d\n", a, i, a * i);
        }
    }*/
//    PP2 METHOD
/*    static void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
//    PP3 METHOD
/*    static int sumRec(int n){
        if (n==1) {
            return 1;
        }
        else {
            return n + sumRec(n-1);
        }
    }*/
/*      if (5 == 1) = false go to else
      return 5 + sumRec(4); 5 + ?; কিন্তু sumRec(4) এর মান এখনো জানা নেই, তাই Java এখানে থেমে sumRec(4) চালাবে।
      sumRec(4)
      if (4 == 1) = false go to else
      return 4 + sumRec(3); 5 + (4 + ?);
      sumRec(3)
      if (3 == 1) = false go to else
      return 3 + sumRec(2); 5 + (4 + (3 + ?));
      sumRec(2)
      if (2 == 1) = false go to else
      return 2 + sumRec(1); 5 + (4 + (3 + (2 + ?)));
      sumRec(1)
      if (1 == 1) = true; return 1; 5 + (4 + (3 + (2 + 1)));
      SOB RETURN GULA + HOBE = 5 + (4 + (3 + (2 + 1))); = 15;*/

    //    PP4 METHOD
/*    static void patternReverse(int n){
        for(int i = 0; i < n; i++){
            for(int j = n; j >= i+1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    //   PP4: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,.........
/*    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }*/

//    PP5: Method
/*    static int fib(int n){
        if(n==1 || n==2) {
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }*/
/*
                           fib ( 5 = 2 + 1 = 3 )
                           /                   \
                    fib(4=1+1=2)             fib(3=1+0)
                   /         \               /       \
                fib(3=1+0)  fib(2=r1)   fib(2=r1)  fib(1=r0)
                /      \
        fib(2 = r1)   fib(1 = r0)
                          wasn't easy to understand 👀
        fib(2) = 1
        fib(1) = 0
        fib(3) = 1 + 0 = 1
        fib(2) = 1
        fib(4) = 1 + 1 = 2
        fib(2) = 1
        fib(1) = 0
        fib(3) = 1 + 0 = 1
        fib(5) = 2 + 1 = 3  */

    //    PP8: Method
    static void patternRec(int n){
        if(n>0){
            patternRec(n-1);

            for(int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    PP ANSWERS
    public static void main(String[] args) {
//        PP1: Write a java method to print multiplication table of a number n.
//          multiplication(5);

        /*        PP2: Write a program using functions to print the following pattern.
         *
         **
         ***
         ****
         ******/
//          pattern(5);

//        PP3: Write a recursive function to calculate sum of first n natural numbers
/*        int c = sumRec(5);
          System.out.println(c);*/

        /*        PP4: Write a program using functions to print the following pattern.
         *****
         ****
         ***
         **
         *
         */

//            patternReverse(5);

//        PP5: Write a function to print nth turn of Fibonacci series using recursion.
/*        int result = fib(1);
        System.out.println(result);*/

//        PP6: Write a function to find average of a set of numbers passed as arguments.
        // i have to review the T33 var args and solve

/*       PP7: Repeat 4 using recursion
         PP4: Write a program using functions to print the following pattern.
         *****
         ****
         ***
         **
         *
         */
//            patternReverseRec(5);



/*      PP8: Repeat 2 using recursion
        PP2: Write a program using functions to print the following pattern.
         *
         **
         ***
         ****
         *****
*/
//         patternRec(5);

//         PP9: Write a program to convert Celsius temp into Fahrenheit;
        float c = 5f;
        float F = (c * 9f/5f) + 32f;
        System.out.println("The temp in Fahrenheit is "+F);

        float f = 100.2f;
        float C = (f - 32f) * 5f/9f;
        System.out.println("The temp in Celsius is "+C);

//            PP10: Repeat 3 using iterative approach -- ill solve it later
    }


}
