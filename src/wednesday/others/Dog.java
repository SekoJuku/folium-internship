package wednesday.others;

public class Dog extends Animal{

    public Dog() {

    }

    public Dog(String name, String breed) {
        super(name, breed);
    }



    @Override
    public String voice() {
        return "bark";
    }

}
