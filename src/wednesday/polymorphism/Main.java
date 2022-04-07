package wednesday.polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
            Polymorphism is one of the core concepts of object-oriented programming (OOP) and describes situations in which something
            occurs in several different forms. In computer science, it describes the concept that you can access objects of
            different types through the same interface. Each type can provide its own independent implementation of this interface.

            To know whether an object is polymorphic, you can perform a simple test.
            If the object successfully passes multiple is-a or instanceof tests, it’s polymorphic.

            Here Football IS playable, as well as Hide and Seek
         */
        Playable game = new Football();
        game.play();

        game = new HideAndSeek();
        game.play();
    }
}
