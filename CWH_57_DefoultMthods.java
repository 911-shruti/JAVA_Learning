package CWH;
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        //cannot be accessed directtly from outside the interface
        System.out.println("hi good morning");
    }
   default void record4KVideo(){
        greet();
       System.out.println("recording in 4k .");
   }
}
interface WiFi{
    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhone {

    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }
}
class MySmartPhone implements Camera, WiFi{

    @Override
    public void takeSnap(){
        System.out.println("taking snaps");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video.");
    }
       @Override
    public String[] getNetworks() {
        // Dummy implementation, replace it with actual logic
        return new String[]{"Network1", "Network2", "Network3"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to network: " + network);
    }
//    @Override
//    public void record4KVideo(){
//        System.out.println("recording in 4k in overriden method inside mySmartphone Class");
//    }
}
public class CWH_57_DefoultMthods {
    public static void main(String[] args) {
MySmartPhone m = new MySmartPhone();
String[] ar =m.getNetworks();
for(String item:ar){
    System.out.println(item);
}
m.record4KVideo();
    }
}
