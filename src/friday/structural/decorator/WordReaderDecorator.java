package friday.structural.decorator;

public class WordReaderDecorator implements Reader {
    private Reader reader;

    public WordReaderDecorator(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String read() {
        return reader.read();
    }
}
