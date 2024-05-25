package stud;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>(){{
            put("B",2); put("D",4); put("A",1); put("C",3);
        }};
        System.out.println(hashMap);
        hashMap.put("E",5);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.equals(hashMap));
        System.out.println(hashMap.hashCode());
        for(Map.Entry<String,Integer>entry: hashMap.entrySet()){
            System.out.println(""+entry.getKey()+":"+entry.getValue());
        }
    }
}