package com.hospMS.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DtatFormatUtils {
    static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public DtatFormatUtils(Date date) {
        dateFormat.format(date);
    }
}
