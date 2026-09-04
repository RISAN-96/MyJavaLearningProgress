package July28; // constructors
class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }

    public MyEmployee(){
        name = "EnterYourName";
        id = 1096;
    }

    public String getName() {return name;}
    public void setName(String n) {this.name = n;}
    public void setId(int i) {this.id = i;}
    public int getId() {return id;}
}
public class T42 {
    public static void main(String[] args) {
//    MyEmployee Risan = new MyEmployee();
//    Risan.setName("RidowanAhmedRisan");
        MyEmployee Risan2 = new MyEmployee("RidowanAhmedRisan", 1096);
        System.out.println(Risan2.getName());
        System.out.println(Risan2.getId());

    }
}
