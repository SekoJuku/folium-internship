package friday.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class JuiceTypeFactory {
    static Map<String, JuiceType> juiceTypeMap = new HashMap<>();

    public static JuiceType getJuiceType(String taste, String provider) {
        JuiceType juiceType = juiceTypeMap.get(taste);
        if(juiceType == null) {
            juiceType = new JuiceType(taste, provider);
            juiceTypeMap.put(taste,juiceType);
        }
        return juiceType;
    }
}
