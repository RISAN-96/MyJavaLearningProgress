/*
Java Access Modifiers

   -------------------------------------------------
    Modifier    | Class | Package | Subclass| World

    Public      | Yes    | Yes     | Yes    | Yes
    Protected   | Yes    | Yes     | Yes    | No
    Default     | Yes    | Yes     | No     | No
    Private     | Yes    | No      | No     | No
  --------------------------------------------------*/

package September14;
class C1 {
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private  int z2 = 8;
    public void method() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z2);
    }
    // we can use all/different type of modifiers in same class - public protected default private
}
class C2 {
}
class C3 {
}
public class T66_Access_Modifiers_in_Java {
    public static void main(String[] args) {
    C1 c1 = new C1();
    c1.method();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.z1);  -  // we cant access private modifier
    }
}
