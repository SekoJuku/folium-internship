package A;

import B.B;

class A {
    void foo() {
        System.out.println("foo");
    }

    public static void main(String[] args) {
        A a = new A();
        a.foo();
    }
}
