package friday.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private Map<Integer, String> hashMap = new HashMap<Integer, String>();

    public Repository() {
        hashMap.put(1, "Serikzhan");
        hashMap.put(2, "Ulan");
        hashMap.put(3, "Rakhat");
    }

    public String get(Integer id) {
        return hashMap.get(id);
    }

    public Integer size() {
        return hashMap.size();
    }

    public String put(Integer id, String string) {
        return hashMap.put(id, string);
    }

    public String delete(Integer id) {
        return hashMap.remove(id);
    }
}
