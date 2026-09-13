package September13;
// 1. create an abastract class Pen with methods write() and refill() as abstract methods

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FoundInPen extends Pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refilling");
    }
    void changingNib(){
        System.out.println("changing nib");
    }
}

class Monkey {
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface basicAnimal{
    default void eat(){
        System.out.println("eating");
    }
    default void sleep(){
        System.out.println("sleeping");
    }
}

class Human extends Monkey implements basicAnimal {
    void speak(){
        System.out.println("speaking...");
    }
}

public class T60_AbastractClassesAndInterfaces_PP {
    public static void main(String[] args) {
    FoundInPen pen = new FoundInPen();
    pen.changingNib();
    }
}
