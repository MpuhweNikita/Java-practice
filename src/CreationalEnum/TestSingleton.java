package CreationalEnum;


public class TestSingleton  {
    public static void main(String[] args) {
        Browser browser = Browser.INSTANCE;
        browser.display();
    }
}
