package friday.behavioral.observer;

public class NewsListener implements Listener {
    private String name;

    public NewsListener(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Sent news to " + this.name + " : " + news);
    }
}
