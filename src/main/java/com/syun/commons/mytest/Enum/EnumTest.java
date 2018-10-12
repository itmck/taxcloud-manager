package com.syun.commons.mytest.Enum;

/**
 * Create by it_mck 2018/10/9 22:28
 *
 * @Description: 枚举
 * @Version: 1.0
 */
public enum EnumTest {
    FRIT("前"),BEHIDE("后"),LEFT("左"),RIGHT("右");

    EnumTest() {
    }

    EnumTest(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
