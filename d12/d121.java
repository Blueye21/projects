package cohding.java.d12;

interface MyInterface {
    public void method1();

    public void method2();
}

class myinterface implements MyInterface {
    public void method1() {
        System.out.println("Implementation of method");
    }

    public void method2() {
        System.out.println("Implementation of method2");
    }

    public static void main(String[] args) {
        MyInterface mi = new myinterface();
        mi.method1();
        mi.method2();
    }
}