package task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Element element = new Element(
                new Element("1"),
                new Element(
                        new Element("2"),
                        new Element("3"),
                        new Element(
                                new Element("4")
                        )
                )
        );
        System.out.println(element);
        System.out.println("Iteration");
        Iterator<Element> it = element.iterator();
        while (it.hasNext()) {
            Element i = it.next();
            if(i.getValue() != null)
                System.out.println(i.getValue());
        }
    }
}
