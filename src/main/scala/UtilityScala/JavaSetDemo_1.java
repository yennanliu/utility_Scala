package UtilityScala;

// https://www.youtube.com/watch?v=F30wh_8Nw1g&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=132

import java.util.HashSet;

public class JavaSetDemo_1 {
    public static void main(String[] args){
        // 1) set only keep unique elements
        // 2) set is non-ordering
        HashSet hs = new HashSet<String>();

        hs.add("jack");
        hs.add("tina");
        hs.add("tina");
        hs.add("jack2");

        System.out.println(hs); // [jack2, jack, tina]
    }
}
