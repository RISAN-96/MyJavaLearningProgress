package September16;
// try er vetore try - nested try like nested css
import java.util.Scanner;

public class T82_Nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int xxx = input.nextInt();
        try{
            System.out.println("Welcome to Java");
            try{
                System.out.println(marks[xxx]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
