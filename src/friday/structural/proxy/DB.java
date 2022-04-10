package friday.structural.proxy;

import java.util.List;

public interface DB {
    String getByName(String name);
    List<String> getAllWords();
}
