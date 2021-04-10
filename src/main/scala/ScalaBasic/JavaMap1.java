package ScalaBasic;

// https://www.youtube.com/watch?v=jUlvvtlJOSI&list=PLmOn9nNkQxJEqCNXBu5ozT_26xwvUbHyE&index=128

import java.util.HashMap;

public class JavaMap1 {
    public static void main(String[] args){
        // build a hashMap
        // java map is "NOT ORDERING"
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("no_1", 100);
        hm.put("no_2", 200);
        hm.put("no_3", 300);
        hm.put("no_4", 400);

        System.out.println(hm);
        System.out.println(hm.get("no3"));
        System.out.println(hm.get("no_3"));
    }
}
