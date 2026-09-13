package September11;

class hello{
    int a;

    public int getA() {
        return a;
    }

    hello(int v){
        this.a = v;
    }
    public int returnnone(){
        return 1;
    }
}

class hi extends hello {
    hi(int c){
        super(c);
        System.out.println("Hi im a constructor");
    }
}
public class T47 {
    public static void main(String[] args) {
//        hello e = new hello(65);
//        System.out.println(e.getA());
        hi x = new hi(65);
        System.out.println(x.getA());

    }
}
