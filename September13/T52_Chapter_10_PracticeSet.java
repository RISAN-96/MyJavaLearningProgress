package September13;
// Q1: Create a class circle ans use inheritance to create  another class cylender from it
class circle{
    public int radius;
    circle(){
        System.out.println("I am non param of circle");
    }
    circle (int r){
        this.radius = r;
        System.out.println("I am circle parameterized constructor");
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle{
    cylinder (int r, int h){
       super(r);
        System.out.println("Im cylinder parameterized constructor");
       this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
// Q1: Create a class rectangle and use inheritance to create
public class T52_Chapter_10_PracticeSet {
    public static void main(String[] args) {
        // Problem 1
//        circle circle1 = new circle(12);
        cylinder cylinder1 = new cylinder(12,4);
    }
}
