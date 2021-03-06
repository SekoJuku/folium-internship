package week1.friday.creational;

import friday.creational.abstractFactory.LgTVProvider;
import friday.creational.abstractFactory.SamsungTVProvider;
import friday.creational.abstractFactory.SonyTVProvider;
import friday.creational.abstractFactory.TVProvider;
import friday.creational.builder.Chair;
import friday.creational.builder.ChairBuilder;
import friday.creational.factory.IceCreamCreator;
import friday.creational.prototype.Book;
import friday.creational.singleton.DB;

public class Main  extends friday.structural.Main {
    public static void main(String[] args) {
        // Factory
        divider("Factory");
        IceCreamCreator iceCreamCreator = new IceCreamCreator();
        iceCreamCreator.createIceCream("Strawberry").taste();
        iceCreamCreator.createIceCream("Chocolate").taste();

        // Abstract Factory
        divider("Abstract Factory");
        TVProvider tvProvider = new LgTVProvider();
        tvProvider.createTV().see();
        tvProvider = new SamsungTVProvider();
        tvProvider.createTV().see();
        tvProvider = new SonyTVProvider();
        tvProvider.createTV().see();

        // Builder
        divider("Builder");
        ChairBuilder chairBuilder = new ChairBuilder();
        chairBuilder.setLegs(4);
        chairBuilder.setMaterial("Hlopok");

        Chair chair = chairBuilder.getProduct();
        System.out.println(chair);

        // Singleton
        divider("Singleton");
        DB db = DB.getInstance("hello");
        System.out.println(db.getData());
        DB db1 = DB.getInstance("hi");
        System.out.println(db1.getData()); // should show "hello"

        // Prototype
        divider("Prototype");
        Book book = new Book();
        book.setName("OOP");
        book.setPages(300);
        System.out.println(book);
        Book book1 = book.clone();
        System.out.println(book.equals(book1));
    }
}
