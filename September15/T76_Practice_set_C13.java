package September15;

class Practice1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
class Practice2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("WELCOME");
            i++;
        }
    }
}

public class T76_Practice_set_C13 {
    public static void main(String[] args) {
    Practice1 p1 = new Practice1();
    p1.start();
    Practice2 p2 = new Practice2();
    p2.start();
    }
}
