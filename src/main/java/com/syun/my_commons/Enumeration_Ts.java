package com.syun.my_commons;

import java.util.*;

/**
 * Create by it_mck 2018/9/4 14:22
 *
 * @Description:枚举
 * @Version: 1.0
 */
public class Enumeration_Ts {

    public static void main(String[] args) {
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        Enumeration<String> elements = dayNames.elements();
        /**
         * boolean hasMoreElements( ):测试此枚举是否包含更多的元素。
         * Object nextElement( ):如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
         *
         */
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
