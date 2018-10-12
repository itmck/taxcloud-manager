package com.syun.commons.mytest.iteator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/10/12 16:30
 *
 * @Description:
 * @Version: 1.0
 */
public class ForeachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("mlxg");
        list.add("uzi");
        //foreach循环遍历  冒号前面第一个为集合里面数据的类型 冒号后为要遍历的集合
        for (String l:list) {
            System.out.println(l);
        }

        /**
         *
         * Map是java中的接口，Map.Entry是Map的一个内部接口。
         *
         *          Map提供了一些常用方法，如keySet()、entrySet()等方法，keySet()方法返回值是Map中key值的集合；entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry。
         *
         *          Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue方法。
         * ---------------------
         * 作者：darryrzhong
         * 来源：CSDN
         * 原文：https://blog.csdn.net/Darry_R/article/details/78915420?utm_source=copy
         * 版权声明：本文为博主原创文章，转载请附上博文链接！
         */
        Map<String,Object> map = new HashMap<>();
        map.put("name","uzi");
        map.put("age",19);

        for (Map.Entry<String, Object> m:map.entrySet()) {
           // System.out.println(m);//输出的是实体类
            System.out.println("key:"+m.getKey()+" value:"+m.getValue());
        }

        System.out.println("========================");
        for (String s:map.keySet()) {
            System.out.println(s+"====="+map.get(s));
        }
    }
}
