import java.text.SimpleDateFormat;
import java.util.*;
public class currentDate {
    public static void main(String[] args) {
                   //    Date today = new Date();
                //System.out.println("Current date is " + today);

        SimpleDateFormat today= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(today.format(date));
            }
        }


