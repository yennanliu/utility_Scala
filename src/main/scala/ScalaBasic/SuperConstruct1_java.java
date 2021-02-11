package ScalaBasic;

// https://www.youtube.com/watch?v=EeN3v0zAsgg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=80

public class SuperConstruct1_java {
    public static void main(String[] args){
        System.out.println("SuperConstruct1 ...");

        // run
        B_java b = new B_java();

        // run 2
        B_java b_2 = new B_java("tim cat");
    }
}

// parent class
class A_java {
    // constructor without param
    public A_java(){
        System.out.println("A()");
    }
    // constructor with param
    public A_java(String name){
        System.out.println("A(String name)" + name);
    }
}

// children class
class B_java extends A_java{
    // constructor without param
    public  B_java(){
        // here java will "implicitly" use super(),
        // i.e.  A_java() (without param)
        //super();
        System.out.println("B()");
    }

    // constructor with param
    public B_java(String name){
        super(name);
        System.out.println("B(String name)" + name);
    }
}