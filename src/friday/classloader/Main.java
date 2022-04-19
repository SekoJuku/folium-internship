package friday.classloader;

import tuesday.serizalize.Owner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> c = myClassLoader.findClass("Date");
        Object o = c.newInstance();
        System.out.println(c.getMethod("now").invoke(o));
    }
}