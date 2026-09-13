package September13;

abstract class parent{
    public parent(){
        System.out.println("Im constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello World");
    }
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("Im child1 constructor");
    }
}
abstract class child2 extends parent{
    public void th(){
        System.out.println("Im waiting for gta 6");
    }
}

public class T53_Abstract_classAndMethods {
    public static void main(String[] args) {
        child c1 = new child();
    }
}
