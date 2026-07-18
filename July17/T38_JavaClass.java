package July17;
//Java Tutorial: Creating Our Own Java Class
// we can use only one public class in one java file
class Employee {
    int id;
    String name;
    int salary;
    public void printDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
    }
    public void getSalary() {
        System.out.println("Employee salary: " + salary); 
    }
}

public class T38_JavaClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Risan = new Employee(); // instantiating a new employee object
        // setting attributes
        Risan.name = "Risan";
        Risan.id = 23;
        Risan.salary = 100000;
        // printing the attributes
        // System.out.println(Risan.id);
        // System.out.println(Risan.name);
        Risan.printDetails();
        Risan.getSalary();

        // adding new employee
        Employee Messi = new Employee();
        Messi.name = "Messi";
        Messi.id = 10;
        Messi.salary = 10;
        Messi.printDetails();
        Messi.getSalary();

    }
}
