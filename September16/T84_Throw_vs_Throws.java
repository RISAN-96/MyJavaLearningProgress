package September16;
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class T84_Throw_vs_Throws {
    public static double area(int r) throws NegativeArraySizeException{
        if(r<0){
            throw new NegativeArraySizeException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int  divide(int a, int b) throws ArithmeticException {
        // made by risan
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        // nisa using divide function made by risan
//        try{
//        int c = divide(6, 0);
//        System.out.println(c);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }

        try{
        double ar = area(6);
            System.out.println("The area is: " + ar);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
