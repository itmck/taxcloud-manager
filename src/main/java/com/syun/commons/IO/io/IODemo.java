package com.syun.commons.IO.io;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Create by it_mck 2018/9/5 18:09
 *
 * @Description:
 * @Version: 1.0
 */
public class IODemo {

    @Test
    public  void run() throws Exception {

        //封装路径对象
        File file = new File("e:\\file\\12345.txt");
        //创建输出流对象.即开启流对象
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("hello".getBytes());
        outputStream.write("javaIO".getBytes());

        //关闭流对象.释放资源
        outputStream.close();



    }
}
