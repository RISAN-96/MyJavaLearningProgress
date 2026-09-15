package September15;
class MyThr3 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("thank you...");
            i++;
        }
    }
}
class MyThr4 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("welcome...");
            i++;
        }
    }
}
public class T75_JAVA_thread_methods {
    public static void main(String[] args) {
        MyThr3 t11 = new MyThr3();
        MyThr4 t12 = new MyThr4();
        t11.start();
        try{
        t11.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        t12.start();
    }
}
