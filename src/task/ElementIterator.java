package task;

import java.util.*;

public class ElementIterator implements Iterator<Element> {
    private final Stack<Iterator<Element>> iterators = new Stack<>();

    public ElementIterator(Element element) {
        this.iterators.add(element.getElements().iterator());
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return ! this.iterators.isEmpty();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Element next() {
        Iterator<Element> iterator = iterators.pop();
        Element element = iterator.next();
        if(iterator.hasNext())
            this.iterators.add(iterator);
        if(!element.getElements().isEmpty()) {
            this.iterators.add(element.getElements().iterator());
        }
        return element;
    }
}
