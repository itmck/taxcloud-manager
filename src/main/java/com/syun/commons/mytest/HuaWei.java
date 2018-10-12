package com.syun.commons.mytest;

/**
 * Create by it_mck 2018/10/9 17:31
 *
 * @Description: 使用抽象类去实现接口.只需要空实现.
 *               在这里之所以使用抽象类去实现接口 .就是因为抽象类就是提供给子类来实现的.否则失去了抽象的意义
 * @Version: 1.0
 */

public abstract class HuaWei implements Phone {

    @Override
    public void say() {

    }

    @Override
    public void msg() {

    }

    @Override
    public void play() {

    }
}
