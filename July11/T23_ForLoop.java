package July11;   //Java Tutorial: The for Loop in Java

public class T23_ForLoop {
    public static void main(String[] args) {
        for(int a=1;a<=10;a++){
            System.out.println(a);
        }

        // 2n = 0 2 4 6 8
        // 2n+1 = 1 3 5 7
        // code to generate nth odd numbers,

        int n = 3;
        for(int b=0;b<n;b++){
            System.out.println(2*b+1);
        }

        // decrementing for loop
        for (int c=5; c>=0; c--) {
            System.out.println(c);
        }

        //Quiz: Write a program to print first n natural numbers in reverse order.
        int x = 10;
        for (int c=x; c>0; c--) {
            System.out.println(c);
        }

    }
}
