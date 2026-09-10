package September09; // constructors in inheritance
class base1 {
    base1(){
        System.out.println(" I am a constructor ");
    }
    base1(int a){
        System.out.println(" I am an overloaded constructor with value of a as: " + a);
    }
}

class derived1 extends base1 {
    derived1(){
//        super(0);
        System.out.println(" I am a derive class constructor ");
    }
    derived1(int x, int y){
        super(x);
        System.out.println(" I am an overloaded constructor of derived1 with value of a as: " + x);
    }
}

class childOfDerived1 extends derived1 {
    childOfDerived1(){
        System.out.println(" I am a child class constructor ");
    }
    childOfDerived1(int x, int y, int z){
        super(x, y);
        System.out.println(" I am an overloaded constructor of derived1 with value of a as: " + z);
    }
}
public class T46 {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1(); // it will call its parents constructor + its own constructor if it do not have any
//        derived1 d = new derived1(4, 9);
//        childOfDerived1 cd = new childOfDerived1();
        childOfDerived1 cd2 = new childOfDerived1(10, 11, 12);
    }
}
