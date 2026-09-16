package September16;

import java.util.Scanner;

class MyException1 extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class T83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try {
                throw new MyException1();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");
            }
        }
    }
}
