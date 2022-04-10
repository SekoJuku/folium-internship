package friday.structural.decorator.model;

import friday.structural.decorator.Reader;
import friday.structural.decorator.WordReaderDecorator;

public class UpperCaseWordDecorator extends WordReaderDecorator {

    public UpperCaseWordDecorator(Reader reader) {
        super(reader);
    }

    @Override
    public String read() {
        return toUpperCase(super.read());
    }

    private String toUpperCase(String name) {
        return name.toUpperCase();
    }
}
