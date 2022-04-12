package friday.behavioral.memento;

public class Snapshot {
    private Editor editor;
    private String text;

    public Snapshot(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public Editor backup() {
        editor.setText(text);
        return editor;
    }
}
