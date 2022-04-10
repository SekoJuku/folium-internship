package friday.structural.proxy;

import java.util.List;

public class StringService {
    private DB db;

    public StringService(DB db) {
        this.db = db;
    }

    public String getByName(String name) {
        return db.getByName(name);
    }

    public List<String> getAllWords() {
        return db.getAllWords();
    }
}
