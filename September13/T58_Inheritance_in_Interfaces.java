package September13;
// we cant extend interfaces on a class
// we can implement interface in a class
// interface can extends another interface

interface sampleInterface{
    void method1();
    void method2();
}
interface childSampleInterface extends sampleInterface{
//    void method1();
//    void method2();
    void method3();
    void method4();
}

class mySampleClass implements childSampleInterface{
    public void method1(){
        System.out.println("Method 3");
    }
    public void method2(){
        System.out.println("Method 3");
    }
    public void method3(){
        System.out.println("Method 3");
    }
    public void method4(){
        System.out.println("Method 4");
    }
}
public class T58_Inheritance_in_Interfaces {
    public static void main(String[] args) {
    mySampleClass mySampleClass = new mySampleClass();
    mySampleClass.method1();
    mySampleClass.method2();
    mySampleClass.method3();
    mySampleClass.method4();
    }
}
