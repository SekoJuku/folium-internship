package friday.classloader;

import java.io.*;
import java.util.Arrays;

public class Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("text.txt"))) {
            objectOutputStream.writeObject("Hello");
        }
    }
}
