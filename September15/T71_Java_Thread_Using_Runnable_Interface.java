package September15;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run()
    {
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
        System.out.println("I am a thread...");
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run()
    {
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
        System.out.println("I am a threat...");
    }
}

public class T71_Java_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {

//    MyThreadRunnable1 t1 = new MyThreadRunnable1();
//    t1.run();
//    MyThreadRunnable2 t2 = new MyThreadRunnable2();
//    t2.run();

    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    Thread gun1 =  new Thread(bullet1);
    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    Thread gun2 =   new Thread(bullet2);
    gun1.start();
    gun2.start();


    }
}