package ScalaBasic;

// https://www.youtube.com/watch?v=EeN3v0zAsgg&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=80

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class SuperConstruct1_java {
    public static void main(String[] args){
        System.out.println("SuperConstruct1 ...");

    }
}

class A_java {
    public A_java(){
        System.out.println("A()");
    }
    public A_java(String name){
        System.out.println("A(String name)" + name);
    }
}

class B_java extends A_java{
    public  B_java(){
        // here java will "implicitly" use super(),
        // i.e.  A_java() (without param)
        System.out.println("B()");
    }

    public B_java(String name){
        super(name);
        System.out.println("B(String name)" + name);
    }
}