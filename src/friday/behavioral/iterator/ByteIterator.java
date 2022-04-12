package friday.behavioral.iterator;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ByteIterator implements Iterable<Byte>{
    private ByteArray byteArray;

    public ByteIterator () {

    }

    public ByteIterator(ByteArray byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public Iterator<Byte> iterator() {
        return new Iterator<Byte>() {
            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < byteArray.size() && byteArray.get(currentIndex) != null;
            }

            @Override
            public Byte next() {
                return byteArray.get(currentIndex++);
            }
        };
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
