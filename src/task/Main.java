package task;

import java.time.*;
import java.util.Iterator;

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
        DateIterator dateIterator = new DateIterator(2001,10,23,0,0);
        for (int i = 0; i < 5; i++) {
            System.out.println(dateIterator.next());
        }
    }
}
