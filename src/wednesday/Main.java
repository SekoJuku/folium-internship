package wednesday;

import wednesday.closure.SomeInterface;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends tuesday.Main {
    public static void main(String[] args)
            throws IOException {
        divider("Closure");
        SomeInterface someInterface = (String s) -> {
            return s.toUpperCase();
        };
        System.out.println(someInterface.toUpperCase("Hello"));

        divider("FileStream(I/O)");
        String text = "Something interesting!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
             FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(buffer);
            fileOutputStream.close();

            for (int i = -1; (i=fileInputStream.read()) != -1; )
                System.out.print((char) i);
        }
        System.out.println();

        divider("ByteArrayStream(I/O), marker");
        byte[] array = new byte[] {1,2,3,4,5};
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                FileOutputStream fileOutputStream = new FileOutputStream("file1.txt");
                FileInputStream fileInputStream = new FileInputStream("file1.txt")) {
            byte[] array1 = new byte[5];
            byteArrayInputStream.mark(1);
            System.out.println("First read");
            for (int i = -1, j = 0; (i=byteArrayInputStream.read()) != -1; j++){
                array1[j] = (byte) i;
                System.out.print(i + " ");
            }
            byteArrayInputStream.reset();
            System.out.println("\n" + "Second read");
            for (int i = -1, j = 0; (i=byteArrayInputStream.read()) != -1; j++){
                array1[j] = (byte) i;
                System.out.print(i + " ");
            }
            System.out.println();
            byteArrayOutputStream.write(array1);
            byteArrayOutputStream.writeTo(fileOutputStream);

            System.out.println("Checking if output txt is the same");
            for (int i = -1; (i=fileInputStream.read()) != -1; )
                System.out.print( i + " ");
        }
        System.out.println();
        divider("Scanner");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input);
        }
        scanner.close();
    }
}
