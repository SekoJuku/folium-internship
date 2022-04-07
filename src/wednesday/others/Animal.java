package wednesday.others;

public abstract class Animal {
    private String name;
    private String breed;

    public abstract String voice();

    public Animal() { }

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void poop() {
        System.out.println("poop");
    }


    public static void main(String[] args) {
        /*
            Abstraction
            In simple terms, abstraction “displays” only the relevant attributes of objects and “hides” the unnecessary details.
            We know that there are many species of animal in the world. But we don't need to know it. We just want to know what is their voice.(in this example)

            Inheritance
            A special feature of Object-Oriented Programming in Java, Inheritance lets programmers create new classes that share some of the attributes of existing classes.
            Using Inheritance lets us build on previous work without reinventing the wheel.
         */
        Animal animal = new Cat("Rekky","Britain something");

        System.out.println(animal.voice());

        animal.poop();

        animal = new Dog("Sharik", "Rotveiler");

        System.out.println(animal.voice());

        animal.poop();
    }
}
