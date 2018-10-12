package com.syun.commons.mytest.MyException;

/**
 * Create by it_mck 2018/10/9 18:26
 *
 * @Description:
 * @Version: 1.0
 */
public class ExceptionTest {

    public static void main(String[] args) {

        int score = 70;
        TeacherCheck check = new TeacherCheck();
        try {
            int i = check.check(score);
            System.out.println(i);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
