package tuesday;

import tuesday.packageprivate.C;
import tuesday.serizalize.House;
import tuesday.serizalize.Owner;

import java.io.*;

public class Main {
    public static void divider(String name)
    {
        System.out.println("-----------" + name + "-----------");
    }
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        divider("Package Private");
        /* A a = new C(); won't work
           System.out.println(a.hello());
         */
        C c = new C();
        System.out.println(c.hello());
        divider("Serializable");
        Owner owner = new Owner("Serikzhan", "Kuanyshev", "Azamatovich",
                new House("Domik", "Gete 14"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.out"));
        objectOutputStream.writeObject(owner);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.out"));
        Owner ownerRestored = (Owner) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(ownerRestored);
    }
}
