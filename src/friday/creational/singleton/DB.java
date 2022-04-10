package friday.creational.singleton;

public final class DB {
    private static DB db;
    private String data;

    public static DB getInstance(String data) {
        if(db == null) {
            db = new DB(data);
        }
        return db;
    }

    private DB(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
