package friday.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class StringDBProxy implements DB{
    private StringDB stringDB;
    private List<String> cachedList = new ArrayList<>();

    public StringDBProxy() {
        this.stringDB = new StringDB();
    }

    @Override
    public String getByName(String name) {
        if(!cachedList.contains(name)) {
            stringDB.saveWord(name);
            cachedList.add(name);
        }
        return name;
    }

    @Override
    public List<String> getAllWords() {
        if(cachedList.isEmpty()) {
            cachedList = stringDB.getAllWords();
        }
        return cachedList;
    }
}
