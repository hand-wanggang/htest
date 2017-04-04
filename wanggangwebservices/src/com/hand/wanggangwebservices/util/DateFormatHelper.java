package com.hand.wanggangwebservices.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by deep on 2017/1/23.
 */
public class DateFormatHelper {

    private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

    public static String fromatDateToTargetStyle(Date date){
        return simpleDateFormat.format(date);
    }
}
