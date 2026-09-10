package September09;
// what is inheritance - it is like dna - it carry forward the features of its ansistors
// alt + insert to get getters & setters
class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Im in base & setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class derived extends base {
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class T45_ {
    public static void main(String[] args) {
    base b = new base();
    b.setX(10);
        System.out.println(b.getX());
      // creating an obj of derived class
    derived d = new derived();
    d.setX(5);
        System.out.println(d.getX());
    }
}
