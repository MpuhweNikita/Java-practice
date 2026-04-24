package Creational;

public class OSFactory {
    public OS getInstance(String msg){
        if(msg.equals("open")){
            return new Android();
        }
        return new IOS();
    }
}
