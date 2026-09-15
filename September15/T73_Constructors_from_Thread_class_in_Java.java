package September15;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 36;
        System.out.println("thank you...");
//        while(i<1000){
//            System.out.println("I am a thread...");
//            i++;
//        }
    }
}
public class T73_Constructors_from_Thread_class_in_Java {
    public static void main(String[] args) {
    MyThr thr = new MyThr("RISAN");
    thr.start();
        System.out.println("The id of this thread t is " + thr.getId());
        System.out.println("The id of this thread t is " + thr.getName());
    }
}
