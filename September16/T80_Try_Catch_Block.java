package September16;
// today we will learn to handle exceptions
// there are two types of exceptions
// checked exceptions -> Compile time exceptions (handled by compiler)
// unchecked exceptions -> Runtime exceptions
// illegal argument, arithmetic , null point, array index out of, number format exception


public class T80_Try_Catch_Block {
    public static void main(String[] args) {
    int a = 6000;
    int b = 0; // arithmetic exception - divide by zero
        try{
            int c = a/b;
            System.out.println("The result is: "+ c);
        }
        catch(Exception e){
            System.out.println("Exception Reason: "  + e );
        }
        System.out.println("End of the program...");
    }
}
