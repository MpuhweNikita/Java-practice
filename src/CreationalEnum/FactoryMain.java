package CreationalEnum;


public class FactoryMain {
    public static void main(String[] args) {

        OS os1 = OSFactory.ANDROID.create();
        os1.spec();

        OS os2 = OSFactory.IOS.create();
        os2.spec();
    }
}
