package September14;

// void sum (int a, int b); -- here a & b are parameters
// sum (5,7); -- here 5 , 7 are arguments --  arguments are actual parameters are not

//  concurrency - managing multiple task but one task at a time - multi-threading
//  parallelism - multiple task at the same time

//  without threading - main -> func1 -> func 2 -> end
// with threading - (main + func1 + func2) - end


class MyThread1  extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<4000) {
        System.out.println("Hello World - my thread is running...");
        System.out.println("I am happy...");
        i++;
        }
    }
}

class MyThread2  extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<4000) {
        System.out.println("Hello World - my thread 2 is running...");
        System.out.println("I am sad...");
        i++;
        }
    }
}

public class T70 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    t1.start();
    MyThread2 t2 = new MyThread2();
    t2.start();
    }
}





























