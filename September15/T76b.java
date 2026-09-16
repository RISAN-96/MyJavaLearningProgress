package September15;
class Practice5 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
class Practice6 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("WELCOME");
            i++;
        }
    }
}
public class T76b {
    public static void main(String[] args) {
        Practice5 p5 = new Practice5();
        Practice6 p6 = new Practice6();
        p5.setPriority(2);
        p6.setPriority(6);
        System.out.println(p5.getPriority());
        System.out.println(p6.getPriority());
        System.out.println(p5.getState());
        System.out.println(p6.getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
//        p5.start();
//        p6.start();

    }
}
