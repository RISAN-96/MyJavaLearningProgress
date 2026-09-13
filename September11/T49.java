package September11;
//dynamic method dispatch
class phone {
    public void greeting(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on featured phone");
    }
}

class smartPhone extends phone {
    public void salam(){
        System.out.println("Assalamu Alaikum");
    }
    public void on(){
        System.out.println("Turning on smartPhone");
    }
    // name is overridden
}
public class T49 {
    public static void main(String[] args) {
//    phone obj = new phone();
//    obj.on();
//    smartPhone obj2 = new smartPhone();
//    obj2.greeting();
//    obj2.on();

        // dynamic method dispatch
        phone smartPhone = new smartPhone();
        smartPhone.greeting(); // allowed
        smartPhone.on(); // allowed
//        smartPhone.salam(); // not allowed because aita feature phone a nai

    }
}
