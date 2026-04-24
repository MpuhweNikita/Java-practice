package CreationalEnum;

public enum Browser {
    INSTANCE;

    public void display() {
        System.out.println("in singleton...");
    }
}