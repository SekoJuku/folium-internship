package friday.structural.adapter;

public abstract class Program {
    private String name;
    private String extension;

    public Program(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public Program() {

    }

    public int execute() {
        return getProgramName().hashCode();
    }

    public String getProgramName() {
        return getName()+getExtension();
    }

    public String getExtension() {
        return extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
