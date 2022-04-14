package tuesday.serizalize;

import java.io.Serializable;

public class Owner implements Serializable {
    private String name;
    private String surname;
    private String middlename;
    private House home; // lets say that Owner only has one house

    public Owner() {

    }

    public Owner(String name, String surname, String middlename, House home) {
        this();
        setName(name);
        setSurname(surname);
        setMiddlename(middlename);
        setHome(home);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public House getHome() {
        return home;
    }

    public void setHome(House home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", home=" + home +
                '}';
    }
}
