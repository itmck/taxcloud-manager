package com.syun.commons.vo.taxyun;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by it_mck 2018/10/10 22:10
 *
 * @Description:
 * @Version: 1.0
 */
public class TestDemo {

    public static void main(String[] args) {
        String str="[{\"index\":1,\"photos\":[{\"id\":\"1539162223371\",\"imgsrc\":\"pictures/dataLog/20181010/15391622233717410.jpg\"},{\"id\":\"1539162227727\",\"imgsrc\":\"pictures/dataLog/20181010/15391622277276417.jpg\"}],\"value\":\"www\"},{\"index\":2,\"value\":\"eeee\",\"photos\":[]}]";
        //String strs = "{\"GvDataLogContent\":\"\"}";
//        String strs = "{\"GvDataLogContent\":[{\"index\":1,\"photos\":[{\"id\":\"1539162223371\",\"imgsrc\":\"pictures/dataLog/20181010/15391622233717410.jpg\"},{\"id\":\"1539162227727\",\"imgsrc\":\"pictures/dataLog/20181010/15391622277276417.jpg\"}],\"value\":\"www\"},{\"index\":2,\"value\":\"eeee\",\"photos\":[{\"id\":\"1539162234840\",\"imgsrc\":\"pictures/dataLog/20181010/15391622348401659.jpg\"}]}]}";
//
//
//        Discrip discrip = JSONObject.parseObject(strs, Discrip.class);
//        List<GvDataLogContent> gvDataLogContent = discrip.getGvDataLogContent();
//        for (GvDataLogContent g:gvDataLogContent){
//            List<Photos> photos = g.getPhotos();
//            for (Photos p:photos) {
//                String imgsrc = p.getImgsrc();
//                System.out.println(imgsrc);
//            }
//        }


//        StringBuilder stringBuilder = new StringBuilder();
//        JSONArray objects = JSONObject.parseArray(str);
//        for (int i=0;i<objects.size();i++){
//            String s = objects.get(i).toString();//得到字符串
//            GvDataLogContent gvDataLogContent = JSONObject.parseObject(s, GvDataLogContent.class);
//            List<Photos> photos = gvDataLogContent.getPhotos();
//            for (Photos p:photos) {
//                String imgsrc = p.getImgsrc();
//               // System.out.println(imgsrc);
//                stringBuilder.append(imgsrc+",");
//            }
//        }
 //       System.out.println(stringBuilder.toString());

// JSONArray array = new JSONArray();  array.add(list);
        JSONArray objects = JSONObject.parseArray(str);
        System.out.println(objects);
        for (int i=0;i<objects.size();i++){
            List<Object> list = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            String s = objects.get(i).toString();//得到字符串
            GvDataLogContent gvDataLogContent = JSONObject.parseObject(s, GvDataLogContent.class);
            List<Photos> photos = gvDataLogContent.getPhotos();
            //描述
            String value = gvDataLogContent.getValue();
            if(photos.size()>0){
                for (Photos p:photos) {
                    String imgsrc = p.getImgsrc();
                    // System.out.println(imgsrc);
                    stringBuilder.append(imgsrc+",");
                }
                String strSub = stringBuilder.toString()+value;//得到拼接后的字符串
                //System.out.println(strSub);
                String s1 = strSub.substring(strSub.lastIndexOf(",")+1);//截取最后一个,后边的字符串
                String s2 = strSub.substring(0,strSub.lastIndexOf(","));//截取最后一个,后边的字符串
                list.add(s1+"==="+s2);
                System.out.println(list+""+i);
            }
        }

        /**
         *
         *
         * {
         * 	"organizationId":25,
         * 	"userId":3,
         * 	"orderId":"2018090615362262486525943",
         * 	"manageId":57,
         * 	"type":1,
         * 	"name":"3",
         * 	"describe":[{"index":1,"photos":[{"id":"1539162223371","imgsrc":"pictures/dataLog/20181010/15391622233717410.jpg"},{"id":"1539162227727","imgsrc":"pictures/dataLog/20181010/15391622277276417.jpg"}],"value":"www"},{"index":2,"value":"eeee","photos":[{"id":"1539162234840","imgsrc":"pictures/dataLog/20181010/15391622348401659.jpg"}]}]
         * }
         *
         * @RequestBody GVDataLogDTO gVDataLogDTO
         */
    }
}
