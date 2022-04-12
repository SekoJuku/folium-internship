package friday.behavioral.memento;

public class Editor {
    private String text;

    public Editor() {
        text = "";
    }

    public Editor(String s) {
        text = s;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void add(String a) {
        text = text.concat(a);
    }

    public Snapshot makeSnapshot() {
        return new Snapshot(this, text);
    }
}
