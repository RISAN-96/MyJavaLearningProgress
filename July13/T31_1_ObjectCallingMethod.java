package July13;
/*A method can be called by creating an object of the class
in which the method exists followed by the method call*/
public class T31_1_ObjectCallingMethod {
    int logic(int a, int b) {
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
        T31_1_ObjectCallingMethod obj = new T31_1_ObjectCallingMethod();

        c = obj.logic(a, b);
        System.out.println(c);

        int x = 100;
        int y = 20;
        int z = obj.logic(x, y);
        System.out.println(z);
    }
}