package July10.July9;
//Java Tutorial 17: Relational and Logical Operators in Java
// ==, !=, >=, <=, <, > - relational op
// AND/&& op - evaluates to true if all the cond are true
// OR/|| op - evaluates to true when at least one of the cond are true
// NOT/!x - revert the value t=f; f=t;

public class T17 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        // AND/&& op - evaluates to true if all the cond are true
        System.out.println("For logical AND....");
        if (a && b && c) {
            System.out.println("You are right");
        } else {
            System.out.println("You are not right");
        }

        // OR/|| op - evaluates to true when at least one of the cond are true
        System.out.println("For logical OR....");
        if (a || b || c) {
            System.out.println("You are right");
        } else {
            System.out.println("You are not right");
        }

        // NOT/!x - revert the value t=f; f=t;
        System.out.println("For logical NOT...."); // invert the ans
        System.out.print("NOT (a) is ");
        System.out.println(!a);
        System.out.print("NOT (c) is ");
        System.out.println(!c);
    }
}
