package com.syun.commons.mytest.iteator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Create by it_mck 2018/10/12 16:21
 *
 * 通过Enumeration的源码分析可得，Enumeration有两个方法：
 * （1）boolean hasMoreElements();//是否还有元素，如果有返回true，否则表示至少含有一个元素
 * （2）E nextElement();//如果Enumeration枚举对象还有元素，返回对象只能的下一个元素，否则抛出NoSuchElementException异常。
 * ---------------------
 * 作者：IAMTJW
 * 来源：CSDN
 * 原文：https://blog.csdn.net/qq924862077/article/details/48022185?utm_source=copy
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 * @Description:
 * @Version: 1.0
 */
public class EnumerationDemo {

    public static void main(String[] args) {

        Vector<String> list = new Vector<>();
        list.add("ming");
        list.add("mlxg");
        list.add("uzi");
        Enumeration<String> elements = list.elements();//返回Enumeration对象
        while (elements.hasMoreElements()){
            String s = elements.nextElement();////调用nextElement方法获得元素
            System.out.println(s);
        }

        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("name","uzi");
        hashtable.put("age",19);
        Enumeration<Object> elements1 = hashtable.elements();
        while (elements1.hasMoreElements()){
            Object element = elements1.nextElement();
            System.out.println(element);

        }


    }


}
