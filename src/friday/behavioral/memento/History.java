package friday.behavioral.memento;

public class History {
    private Snapshot snapshot;

    public History(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public Editor getBackup() {
        return snapshot.backup();
    }

    public void createSnapshot(Editor editor) {
        setSnapshot(editor.makeSnapshot());
    }


    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }
}
