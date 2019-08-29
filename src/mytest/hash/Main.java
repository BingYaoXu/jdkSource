package mytest.hash;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Map<Key,Integer> map=new HashMap<>();
        List<Key> keyList=new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            keyList.add(new Key(i));
        }
        System.out.println("start------");
        long time=System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            map.put(keyList.get(i),i);
        }
//        for (int i = 0; i < 10000; i++) {
//            map.get(keyList.get(i));
//        }
//        for (int i = 0; i < 10000; i++) {
//            map.remove(keyList.get(i));
//        }
        System.out.println("插入时间"+(System.currentTimeMillis()-time));
        System.out.println(map.get(keyList.get(9999)));
        int i=1;
        int j=2;
        i=j=3;
        System.out.println(i);
        System.out.println(j);
    }






}
