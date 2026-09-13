package September13;
interface camera2 {
    void takePicture();
    void recordVideo();
    default void recordAudio() {
        System.out.println("Recording Audio...");
    }
}
interface wifi2 {
    String[] getNetwork();
    void connect(String network);
}
class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling number "+phoneNumber);
    }
    void pickCall(){
        System.out.println("picking call... ");
    }
}
class MySmartPhone2 extends myCellPhone implements wifi,camera{
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
public class T59_Polymorphism_In_interface {
    public static void main(String[] args) {
//        camera2 cam1 = new MySmartPhone2();
//        camera2 cam1 = new camera2();
        cam1.takePicture();

    }
}
