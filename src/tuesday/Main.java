package tuesday;

import tuesday.packageprivate.B;
import tuesday.packageprivate.C;
import tuesday.packageprivate.D;
import tuesday.packageprivate.E;
import tuesday.serizalize.House;
import tuesday.serizalize.Owner;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

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
                new FileOutputStream("owner.out"));
        objectOutputStream.writeObject(owner);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("owner.out"));
        Owner ownerRestored = (Owner) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(ownerRestored);
        List<D> list = new LinkedList<>();
        list.add(new B());
        list.add(new E());
    }
}
