package July13;

public class T33_Variable_Arguments {
/*    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b;
    }
    static int sum(int a, int b, int c, int d) {
        return a + b;
    }
    static int sum(int a, int b, int c, int d, int e) {
        return a + b;
    }*/

//    ninja technique
//    static int sum (int ...arr){
//        int result = 0;
//        for(int a: arr){
//            result += a;
//        } return result;
//    }
    public static int sum (int x, int ...arr){
        int result = x;
        for(int a: arr){
            result += a;
        } return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varArgs tutorial");
        System.out.println("The sum of 4 & 5 is " + sum(4,5));
        System.out.println("The sum of 4 & 5 & 6 is " + sum(4,5,6));
        System.out.println("The sum of 4 & 5 & 6 & 7 is "  + sum(4,5,6,7));
        System.out.println("The sum of 4 & 5 & 6 & 7 & 8 & 9 is "  + sum(4,5,6,7,8,9));

        System.out.println("The sum of 1 & 4 & 5 is " + sum(1,4,5));
    }
}
