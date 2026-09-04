package July18;
//Practice Problem
        /*Q1: Create a class Employee with following properties & methods
        Salary (property -  int)
        name (property - string)
        setName (method changing name)
        getName (method returning name)
        getSalary (method returning int)
        */

    class Employee {
        int Salary;
        String name;
        public int getSalary() {
            return Salary;
        }
        public String getName() {
            return name;
        }
        public void setName(String n) {
            name = n;
//            n = name;
        }
    }

        //Q2: Create a class cellphone with methods to print "ringing", "vibrating", etc..
    class CellPhone {
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void call(){
            System.out.println("Calling...");
        }

    }

// PP3 Create a square with a method to initialize it's side, calculating area, perimeter etc,
    class Square {
        int side;
        public int area() {
            return side * side;
        }
        public int perimeter() {
            return 4*side;
        }
    }

    // PP4: Create a class Rectangle  --- repeat 3
    class rectangle {
        int width;
        int length;
        public int area() {
            return width * length;
        }
        public int perimeter() {
            return 2 * (width + length);
        }
    }

// PP5: Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing etc...
    class Tommy{
        public void hit(){
        System.out.println("Tommy hitting the enemy");
        }
        public void running(){
        System.out.println("Tommy running from the enemy");
        }
        public void firing(){
            System.out.println("Tommy firing the enemy");
        }
    }

// PP6: Repeat 5 for a circle
    class circle {
        int radius;
        public double area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
}

public class T39 {
    public static void main(String[] args) {
        // PP1
        Employee risan = new Employee();
        risan.Salary = 100000;
        risan.setName("Ridowan Ahmed Risan");
        System.out.println(risan.getName());
        System.out.println(risan.getSalary());

        // PP2
        CellPhone Xiaomi = new CellPhone();
        Xiaomi.call();
        Xiaomi.ring();
        Xiaomi.vibrate();

        // PP3 Create a square with a method to initialize it's side, calculating area, perimeter etc,
        Square sq =  new Square();
        sq.side = 3;
        System.out.println("Area of the square is: "+sq.area());
        System.out.println("Parameter of the square is: "+sq.perimeter());

        // PP4: Create a class Rectangle  --- repeat 3
        rectangle rectangle = new rectangle();
        rectangle.width = 6;
        rectangle.length = 6;
        System.out.println("Area of the rectangle is: " + rectangle.area());
        System.out.println("Parameter of the rectangle is: " + rectangle.perimeter());

        // PP5: Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, firing etc...
        Tommy player1 = new Tommy();
        player1.hit();
        player1.running();
        player1.firing();

        // PP6: Repeat 5 for a circle
        circle circle1 = new circle();
        circle1.radius = 6;
        circle1.area();
        circle1.perimeter();


    }


}
