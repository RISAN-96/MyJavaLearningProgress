package July13;
            //Java Tutorial: Methods in Java
public class T31_0_Java_Methods {
    static int logic(int a, int b) {
        int c = 0;
        if (a < b) {
            c = a + b;
        }
        else {
            c = a - b;
        }
        return c;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;
        c = logic(a, b);
        System.out.println(c);

        int x = 100;
        int y = 20;
        int z = logic(x, y);
        System.out.println(z);
    }
}