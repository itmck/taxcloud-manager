package com.syun.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/9/4 14:59
 *
 * @Description:计算日期工具类
 * @Version: 1.0
 */
public class Dateutils {
    /**
     *
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @return 返回天数
     */
    public static long  getDays(Date beginDate, Date endDate){

        return ((endDate.getTime()-beginDate.getTime())/(60*60*24*1000));
    }

    /**
     *
     * @param beginDateStr
     * @param endDateStr
     * @param pattern
     * @return 返回天数
     */
    public static long getDaySub(String beginDateStr,String endDateStr,String pattern){
        long day=0;
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date beginDate;
        Date endDate;
        try{
            beginDate = format.parse(beginDateStr);
            endDate= format.parse(endDateStr);
            day = getDays(beginDate,endDate);
        } catch (ParseException e) {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }
        return day;
    }

    /**
     *
     *
     * @param beginDate
     * @param endDate
     * @return 返回map集合.可以通过集合获取到时间差 天,时,分,秒
     */
    public static Map<String ,Long> getDayDiff(Date beginDate, Date endDate){

        Map<String ,Long> map = new HashMap<>();
        try {
            long l = endDate.getTime() - beginDate.getTime();
            long day = l / (24 * 60 * 60 * 1000);
            long hour = (l / (60 * 60 * 1000) - day * 24);
            long min = (l / (60 * 1000) - day * 24 * 60 - hour * 60);
            long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
            map.put("day",day);
            map.put("hour",hour);
            map.put("min",min);
            map.put("s",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
