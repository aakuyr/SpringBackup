package hb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");

    public static Date parseDate(String date) throws ParseException {
        return s.parse(date);
    }

    public static String formatDate(Date date){
        return s.format(date);
    }
}
