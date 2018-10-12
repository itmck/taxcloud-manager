package com.syun.commons.mytest.iteator;

import java.util.*;

/**
 * Create by it_mck 2018/10/12 16:28
 *
 * @Description:
 * @Version: 1.0
 */
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("mlxg");
        list.add("uzi");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("=========================");
        Map<String,Object> map = new HashMap<>();
        map.put("name","uzi");
        map.put("age",19);

        Iterator<Map.Entry<String, Object>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Object> next = iterator1.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }
}
