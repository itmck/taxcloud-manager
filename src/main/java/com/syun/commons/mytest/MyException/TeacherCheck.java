package com.syun.commons.mytest.MyException;

/**
 * Create by it_mck 2018/10/9 18:23
 *
 * @Description:
 * @Version: 1.0
 */
public class TeacherCheck {

    public int check(int score) throws MyException{

        if (score>0&&score<60){

            throw new  MyException("不及格");

        }else{

            return 0;
        }
    }
}
