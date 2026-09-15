package September15;
class MyThr33 extends Thread{
    public void run(){
        while(true){
            System.out.println("thank you...");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThr44 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("welcome...");
            i++;
        }
    }
}
public class T75a_JAVA_interrupt_methods {
    public static void main(String[] args) {
        // interrupt method
        MyThr33 t11 = new MyThr33();
        MyThr44 t12 = new MyThr44();
        t11.start();
        t12.start();

    }
}
