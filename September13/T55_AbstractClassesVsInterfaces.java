package September13;
// we cant use multiple abstract class to make a class
// we can use multiple interface to make a class
interface bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class bmw implements bicycle {
    int speed = 8;
    // interface er method public rakhte hobe
    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");
    }
    public void speedUp(int increment) {
        System.out.println("Speeding up");
    }
    void blowHorn){
    System.out.println("pee pee po po");
    }
}
public class T55_AbstractClassesVsInterfaces {
    public static void main(String[] args) {

    }
}
