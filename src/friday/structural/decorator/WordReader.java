package friday.structural.decorator;

public class WordReader implements Reader {
    private String word;

    public WordReader(String word) {
        this.word = word;
    }

    @Override
    public String read() {
        return word;
    }

    public String getWord() {
        return word;
    }

}
