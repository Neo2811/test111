package interestingTest;

class A {
    void f(B b) {

    }

    void f(A a) {
        System.out.println("A");
    }
}
class B extends A {
    void f(B b) {
        System.out.println("B");
    }


}

class Main{
    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        a.f(a);
        b.f(a);
    }
}
