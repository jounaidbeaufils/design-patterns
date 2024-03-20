package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel = new NewsChannel();

        newsAgency.registerObserver(newsChannel);

        newsAgency.setNews("Breaking News: Observer Pattern in Java!");
        // NewsChannel will be notified and will print the news
    }
}
