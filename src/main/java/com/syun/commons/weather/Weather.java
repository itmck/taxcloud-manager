package com.syun.commons.weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Create by it_mck 2018/9/16 15:52
 *
 * @Description: 获取天气接口
 * @Version: 1.0
 */
public class Weather {


    public static void main(String[] args) {

        System.out.println(getWeather("杭州"));
    }


    /**
     *
     * 根据ip获取天气
     * @return
     */
    public static String getWeather(String address) {

        try {
            String city = java.net.URLEncoder.encode(address, "utf-8");
            String apiUrl = String.format("https://www.sojson.com/open/api/weather/json.shtml?city=%s", city);
            URL url = new URL(apiUrl);
            URLConnection open = url.openConnection();
            InputStream input = open.getInputStream();
           // return IOUtilsDemo.toString(input, "utf-8");//使用工具类转码
            return convertStreamToString(input);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }


    /**
     *
     * 转码
     * @param is
     * @return
     */
    private static String convertStreamToString(InputStream is) {
        StringBuilder sb1 = new StringBuilder();
        byte[] bytes = new byte[4096];
        int size;

        try {
            while ((size = is.read(bytes)) > 0) {
                String str = new String(bytes, 0, size, "utf-8");
                sb1.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb1.toString();
    }
}
