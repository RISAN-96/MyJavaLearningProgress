package September11;
//Method_OverRiding - a have method x & y -- b extends a & b also have method b on its own -- this is called method overriding
//Method_OverLoading- a have two different method with same name
class A {
    public int risan(){
        return 1096;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A {
    @Override // override annotation lagano recommended - because if future code a kicu change korle compile korte gale error asbe & bujha jabe j override a problem asce
    public void meth2(){
        System.out.println("I am method 2 of class B - im a overRide method");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class T48 {
    public static void main(String[] args) {
    A a = new A ();
    a.meth2();

    B  b = new B();
    b.meth2();
    }
}
