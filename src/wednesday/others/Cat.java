package wednesday.others;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String voice() {
        return "meow";
    }
}
