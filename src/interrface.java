
interface A{
    void hello1();
    void hello2();
}
interface C extends A {                // singly inherit
    void hello3();
    void hello4();
}

class B implements C{
    public void hello1() {

    }
    public void hello2() {

    }
    public void hello4() {

    }
    public void hello3() {
        System.out.println("welcome");
    }
}


public class Interface {
    public static void main(String[] args) {
        B n = new B();
        n.hello3();
    }
}
