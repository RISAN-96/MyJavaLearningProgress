package July11; //beak & continue using loops

public class T24_Break_and_Continue {
    public static void main(String[] args) {

        System.out.println("USING BREAK METHOD");
        System.out.println("Break in - For loop");

        for (int i=1;i<=10;i++) {
            System.out.println(i);
            System.out.println("JABAJ RISAN BABA");
            if(i==2){
                System.out.println("Ending the loop");
                break;
                // break statement is used to exit the loop, weather the condition true or false.
            }
        }

        System.out.println("Break in - While loop");

        int j = 0;
        while (j<=10) {
            System.out.println(j);
            if(j==3){
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }

        System.out.println("Break in - Do-While loop");

        int k = 0;
        do {
            System.out.println(k);
            if(k==2){
                System.out.println("Ending the loop");
                break;
            }
            k++;
        } while (k<=10);


        System.out.println("USING CONTINUE METHOD");
        System.out.println("Continue in - For loop");

        for (int l=1;l<5;l++) {
            if(l==2){
                System.out.println("Skipping & continuing the process");
                continue;
                // continue statement is used to skip the process, when the condition is true.
            }
            System.out.println(l);
        }

        System.out.println("Continue in - While loop");

        int m = 0;
        while (m<=5) {
            m++;
            if(m==3){
                System.out.println("Skipping & continuing the process");
                continue;
            }
            System.out.println(m);
        }
//
        System.out.println("Continue in - Do-While loop");

        int n = 0;
        do {
            n++;
            if(n==4){
                System.out.println("Skipping & continuing the process");
                continue;
            }
            System.out.println(n);
        } while (n<=5);
    }
}
