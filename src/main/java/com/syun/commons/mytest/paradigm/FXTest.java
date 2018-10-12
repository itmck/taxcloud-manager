package com.syun.commons.mytest.paradigm;

/**
 * Create by it_mck 2018/10/9 18:45
 *
 * @Description: 泛型类 泛型方法测试
 * @Version: 1.0
 */
public class FXTest {

    public static void main(String[] args) {

        System.out.println("泛型类");
        MyFX<String> fx = new MyFX<>();
        fx.setT("小花");
        String t =fx.getT();
        System.out.println(t);
        MyFX<Integer> fx2 = new MyFX<>();
        fx2.setT(27);
        Integer t1 =fx2.getT();
        System.out.println(t1);

        System.out.println("======泛型方法========");
        FxMethod method = new FxMethod();
        method.show("mck");
        method.show(27);

        System.out.println("=========泛型接口========");
        FxInterFaceImpl<String> face = new FxInterFaceImpl<>();
        face.show("mck");
        FxInterFaceImpl<Integer> face1 = new FxInterFaceImpl<>();
        face1.show(27);

        System.out.println("======泛型通配符=======");

        Dog dog = new Dog();
        FxTp<? extends Animal> tp = new FxTp<Dog>();
        FxTp<? extends Dog> tp1 = new FxTp<Dog>();
        FxTp<? super Dog> tp2 = new FxTp<Animal>();

    }
}
