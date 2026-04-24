package Structural;

public class BrowserAdapter implements ModernBrowser {

    private LegacyBrowser legacyBrowser;

    public BrowserAdapter(LegacyBrowser legacyBrowser) {
        this.legacyBrowser = legacyBrowser;

    }


    @Override
    public void openUrl(String url) {
        legacyBrowser.openUrl(url);

    }
}

