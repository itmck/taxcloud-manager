package com.syun.commons.mytest.paradigm;

/**
 * Create by it_mck 2018/10/9 18:44
 *
 * @Description: 泛型类
 * @Version: 1.0
 */
public class MyFX<T> {

    T t;

    /**
     *
     * 无参构造
     */
    public MyFX() {
        super();
    }

    /**
     *
     * 有参构造
     * @param t
     */
    public MyFX(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
