package friday.structural.flyweight;

public class JuiceType {
    private String taste;
    private String provider;

    public JuiceType(String taste, String provider) {
        this.taste = taste;
        this.provider = provider;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "JuiceType{" +
                "taste='" + taste + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
