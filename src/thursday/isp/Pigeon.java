package thursday.isp;

import wednesday.others.Animal;

public class Pigeon extends Animal implements Killable, Flieable {

    public Pigeon() {
    }

    public Pigeon(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String voice() {
        return "kurlik";
    }

    @Override
    public String die() {
        System.out.println(voice());
        return "uhh";
    }

    @Override
    public String fly() {
        System.out.println(voice());
        return "I'm flying";
    }
}
