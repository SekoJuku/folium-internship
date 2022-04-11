package friday.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsPublisher {
    private List<Listener> subscribers = new ArrayList<>();

    public void subscribe(Listener listener) {
        subscribers.add(listener);
    }

    public void unSubscribe(Listener listener) {
        subscribers.remove(listener);
    }

    public void notifySubscribers(String news) {
        for (Listener i :
                subscribers) {
            i.update(news);
        }
    }
}
