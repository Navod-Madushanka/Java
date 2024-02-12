package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManager {
    private String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }
    public String getCurrentDate(){
        return formatDate(new Date());
    }
}
