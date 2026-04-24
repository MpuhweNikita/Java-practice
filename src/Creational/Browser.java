package Creational;

public class Browser {
    private volatile static Browser browser;

    private Browser() {}

    public Browser getInstance() {
        if (browser == null) {
            synchronized(Browser.class){
                if (browser == null) {
                    browser = new Browser();
                }
            }
            browser = new Browser();
        }
        return browser;
    }
    public void display() {
        System.out.println("in singleton...");
    }
}

