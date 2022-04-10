package friday.structural.bridge;

public class Door {
    private Handle handle;

    public Door() {
    }

    public Door(Handle handle) {
        this.handle = handle;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public String open() {
        return handle.open();
    }

}
