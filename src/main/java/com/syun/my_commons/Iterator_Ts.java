package com.syun.my_commons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by it_mck 2018/9/4 14:18
 *
 * @Description:迭代器
 * @Version: 1.0
 */
public class Iterator_Ts {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小李");
        list.add("小青");
        list.add("小花");
        /**
         *iterator() :获取集合的迭代器
         *
         */
        Iterator<String> iterator = list.iterator();
        /**
         *boolean hasNext() 如果仍有元素可以迭代，则返回 true。
         * Object next() 返回下一个元素
         *
         */
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
