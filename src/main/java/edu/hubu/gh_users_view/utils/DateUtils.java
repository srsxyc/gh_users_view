package edu.hubu.gh_users_view.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    // 自定义日期格式
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(date);
    }

    public static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.parse(dateString);
    }

    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        String formattedDate = formatDate(now);
        System.out.println("Formatted Date: " + formattedDate);

        String dateString = "2023-07-19";
        Date parsedDate = parseDate(dateString);
        System.out.println("Parsed Date: " + parsedDate);
    }

}
