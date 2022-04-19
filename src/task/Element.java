package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Element {
    private String value;
    private List<Element> elements = new ArrayList<>();

    public Element() {
        value = "";
    }

    public Element(String value) {
        setValue(value);
    }

    public Element(Element... elements) {
        this.elements.addAll(Arrays.asList(elements));
    }

    public ElementIterator iterator() {
        return new ElementIterator(this);
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(getValue() != null ) {
            stringBuilder.append("\"").append(getValue()).append("\"");
        } else {
            stringBuilder.append("[");
            for (Element e : getElements()) {
                stringBuilder.append(e).append(",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
