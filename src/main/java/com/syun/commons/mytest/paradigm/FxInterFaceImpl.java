package com.syun.commons.mytest.paradigm;

/**
 * Create by it_mck 2018/10/9 21:25
 *
 * @Description:
 * @Version: 1.0
 */
public class FxInterFaceImpl<T> implements FxInterFace<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
