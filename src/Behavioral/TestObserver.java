package Behavioral;

public class TestObserver {
    public static void main(String[] args) {
        YouTubeChannel chan1 = new YouTubeChannel();
        Subscriber sub1 = new Subscriber("Phoenix");
        Subscriber sub2 = new Subscriber("Sandra");
        chan1.addObserver(sub1);
        chan1.addObserver(sub2);
        chan1.upload("Observer design pattern");

    }
}
