package grafanascreenshots;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static String convert(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date d = dateFormat.parse(date);
            long milliseconds = d.getTime();
            return milliseconds + "";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "0";
    }
}
