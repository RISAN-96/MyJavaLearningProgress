package September13;

interface camera(){
    void takePicture();
    void recordVideo();
}
interface wifi(){
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

}
public class T57 {
}
