package September15;

class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run(){
        int i = 36;
        while(true){
//            System.out.println("I am a thread...");
            System.out.println("thank you..." + this.getName());
        }
    }
}

public class T74_java_thread_priorities {
    public static void main(String[] args) {
        // ready queue: t1 t2 t3 t4 t5
        MyThr2 t1 = new MyThr2("RISAN0");
        MyThr2 t2 = new MyThr2("RISAN1");
        MyThr2 t3 = new MyThr2("RISAN2 (most important)");
        MyThr2 t4 = new MyThr2("RISAN3");
        MyThr2 t5 = new MyThr2("RISAN4");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
