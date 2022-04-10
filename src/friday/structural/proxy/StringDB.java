package friday.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class StringDB implements DB {
    List<String> list = new ArrayList<>();

    public StringDB() {
        saveWord("Serik");
        saveWord("Berik");
        saveWord("Ulan");
    }

    public String saveWord(String word) {
        list.add(word);
        return word;
    }

    @Override
    public String getByName(String name) {
        return (list.contains(new String(name))?name:null);
    }

    @Override
    public List<String> getAllWords() {
        return list;
    }

    @Override
    public String toString() {
        return "StringDB{" +
                "list=" + list +
                '}';
    }
}
