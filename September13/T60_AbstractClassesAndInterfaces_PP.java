package September13;
// 1. create an abstract class Pen with methods write() and refill() as abstract methods

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
    void eat();
    void sleep();
    }

class Human extends Monkey implements basicAnimal {
    void speak(){
        System.out.println("speaking...");
    }
    @Override
    public void eat() { System.out.println("eating"); }
    @Override
    public void sleep() { System.out.println("sleeping"); }
}

public class T60_AbstractClassesAndInterfaces_PP {
    public static void main(String[] args) {
        // Q1 + Q2
        FoundInPen pen = new FoundInPen();
        pen.changingNib();

        // Q3
        Human Risan = new Human();
        Risan.sleep();
        Risan.eat();
        Risan.jump();
        Risan.bite();

       // Q5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
//        m1.speak(); == cant use this method because the reference is monkey which does not have speak method


    }

}
