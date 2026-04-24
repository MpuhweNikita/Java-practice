package Creational;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("open");
        os.spec();
    }
}
