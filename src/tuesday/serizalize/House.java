package tuesday.serizalize;

import java.io.Serializable;

public class House implements Serializable {
    private String name;
    private String address;

    public House() {

    }

    public House(String name, String address) {
        this();
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
