package com.syun.commons.IO.io;


import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Create by it_mck 2018/10/12 17:36
 *
 * @Description:
 * @Version: 1.0
 */
public class IOUtilsDemo {


    public static void main(String[] args) throws IOException {

        File file1 = new File("e:\\file\\12345.txt");
        File file2 = new File("e:\\file\\54321.txt");
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        FileInputStream fileInputStream1 = new FileInputStream(file2);
        System.out.println("复制之前:"+IOUtils.toString(fileInputStream1));

        IOUtils.copy(inputStream,outputStream);
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);

        FileInputStream fileInputStream2 = new FileInputStream(file2);
        System.out.println("复制之后:"+IOUtils.toString(fileInputStream2));


    }
}
