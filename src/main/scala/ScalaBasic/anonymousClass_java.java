package ScalaBasic;

// https://www.youtube.com/watch?v=2NKDHsL1RLU&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=85

public class anonymousClass_java {
    public static void main(String [] args){

        System.out.println("anonymousClass_java ...");

        // here we Override BEFORE RUN THE METHOD (RATHER THAN DO IT IN A NEW CLASS)
        // this way gives us the flexibility on when/where Override the method with the "adhoc" sense
        // (obj is our anonymous class here)
        A2 obj = new A2() {
            @Override // optional
            public void cry() {
                System.out.println("CRY CRY CRY");
            }
        };

        // run
        obj.cry();
    }
}


// java anonymous class
abstract class A2 {
    abstract public void cry();
}