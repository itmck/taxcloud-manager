package com.syun.commons.mytest.paradigm;

/**
 * Create by it_mck 2018/10/9 21:33
 *
 * @Description:
 * @Version: 1.0
 */
public class  FxTp<T>{
    T t;

    public FxTp() {
        super();
    }

    public FxTp(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
