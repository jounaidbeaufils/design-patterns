package observer;

public class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("NewsChannel received news: " + news);
    }
}
