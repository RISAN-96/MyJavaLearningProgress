package September13;
// we cant use multiple abstract class to make a class
// we can use multiple interface to make a class
interface bicycle {
    int speed = 80;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornbicycle {
    int speed = 80;
    void applyHornAmbulance();
    void applyHornPeep();
}
class bmw implements bicycle, hornbicycle {
    // interface er method public rakhte hobe
    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");
    }
    public void speedUp(int increment) {
        System.out.println("Speeding up");
    }
    public void applyHornAmbulance(){
    System.out.println("pee pee po po");
    }
    public void applyHornPeep(){
        System.out.println("Peeeeeeeeeeeeeeeeeeeeeeeeep");
    }

}
public class T55_AbstractClassesVsInterfaces {
    public static void main(String[] args) {
        bmw bmw1 = new bmw();
        bmw1.speedUp(1);
        bmw1.applyBrake(1);
        bmw1.applyHornAmbulance();
    }
}
