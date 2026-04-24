package Structural;

public class TestAdapter {
    public static void main(String[] args) {
        LegacyBrowser legacy = new LegacyBrowser();
        ModernBrowser mb = new BrowserAdapter(legacy);
        mb.openUrl("http://www.google.com");
    }
}
