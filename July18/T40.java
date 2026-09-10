package July18; // Access modifiers & constructors
class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
}
public class T40 {
    public static void main(String[] args) {
        MyEmployee em1 = new MyEmployee();
        em1.setId(1);
        em1.setName("RIDOWAN AHMED RISAN");
        System.out.println(em1.getName());
        System.out.println(em1.getID());
    }
}