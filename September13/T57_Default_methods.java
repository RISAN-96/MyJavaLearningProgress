package September13;

interface camera {
    void takePicture();
    void recordVideo();
    default void recordAudio() {
        System.out.println("Recording Audio...");
    }
}
interface wifi {
    String[] getNetwork();
    void connect(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling number "+phoneNumber);
    }
    void pickCall(){
        System.out.println("picking call... ");
    }


}
class MySmartPhone extends myCellPhone implements wifi,camera{
    public void takePicture(){
        System.out.println("Take a picture");
    }
    public void recordVideo(){
        System.out.println("Record video");
    }
    public void connect(String network){
        System.out.println("Connect to "+network);
    }
    public String [] getNetwork(){
        System.out.println("get network");
        String [] networkList = {"risan", "nisa", "babu"};
        return networkList;
    }
}
public class T57_Default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String [] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.recordVideo();
        ms.takePicture();
        ms.connect("risan");
        ms.recordAudio();
    }
}
