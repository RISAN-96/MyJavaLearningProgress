package September15;
class Practice3 extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(50);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("GOOD MORNING");
        }
    }
}
class Practice4 extends Thread{
    @Override
    public void run() {
        while(true){
            try {
            Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("WELCOME");
        }
    }
}
public class T76a {
    public static void main(String[] args) {
        Practice3 p3 = new Practice3();
        p3.start();
        Practice4 p4 = new Practice4();
        p4.start();
    }
}
