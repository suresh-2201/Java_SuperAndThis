package Java_SuperAndThis;

class Parent {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        //using this() to call method1
        this.method1();
    }
}
//SubClass
class Child extends Parent {
    void method3() {
        //using super() to call parent method
        super.method2();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
        Child c = new Child();
        //Calling method3
        c.method3();
    }
}