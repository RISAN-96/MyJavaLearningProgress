package September16;
// finally block - it contains the code which is always executed
public class T85_Finally_Block {
    public static int greet(){
        try{
            int a=50;
            int b=2;
            int c=a/b;
            return c;
        } catch(Exception e){
            System.out.println(e);
        } finally{
        System.out.println("This is the end of the program");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a=7;
        int b=9;
        while(true){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break; // break use korleo finally execute hobei
            } finally {
                System.out.println("This is the end of the program");
            }
            b--;
        }
    }
}
