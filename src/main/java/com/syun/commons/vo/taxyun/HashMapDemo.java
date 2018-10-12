package com.syun.commons.vo.taxyun;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Create by it_mck 2018/10/10 17:07
 *
 * @Description:
 * @Version: 1.0
 */
public class HashMapDemo {
    public static void main(String[] args) {

        String str = "{\n" +
                "\t\"index\": 1,\n" +
                "\t\"photos\": [{\n" +
                "\t\t\"id\": \"1539162223371\",\n" +
                "\t\t\"imgsrc\": \"pictures/dataLog/20181010/15391622233717410.jpg\"\n" +
                "\t}, {\n" +
                "\t\t\"id\": \"1539162227727\",\n" +
                "\t\t\"imgsrc\": \"pictures/dataLog/20181010/15391622277276417.jpg\"\n" +
                "\t}],\n" +
                "\t\"value\": \"www\"\n" +
                "}";


        GvDataLogContent gvDataLogContent = JSONObject.parseObject(str, GvDataLogContent.class);
        List<Photos> photos = gvDataLogContent.getPhotos();
        for (Photos p:photos) {
            String imgsrc = p.getImgsrc();
            System.out.println(imgsrc);
        }

    }
}
