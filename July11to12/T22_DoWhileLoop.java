package July11to12; //Java Tutorial: The do-while loop in Java

public class T22_DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("while loop");
        while(a<=2){
            System.out.println(a++);
        }
        System.out.println("do-while loop");
        // while loop first check the condition then execute
        // do-while loop first execute the code for 1 time then check
        do {
            System.out.println(b++);
        } while (b<=5);
    }
}
