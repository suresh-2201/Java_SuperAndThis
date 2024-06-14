package Java_SuperAndThis;

class Parent {
    String name = "Sunday";

    Parent() {
        System.out.println("This is parent class constructor");
    }
}

//SubClass
class Child extends Parent {
    String name = "Monday";

    Child() {
        //5. Calling constructor of the parent class using super()
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
        //Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
    }
}

public class CallUsingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.myMethod();
    }
}