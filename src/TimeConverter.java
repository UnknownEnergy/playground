import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TimeConverter {
    public static void main(String[] args) throws ParseException {
        String times = "2019-03-01 08:55:28\n" +
                "2019-03-01 08:51:34\n" +
                "2018-04-11 19:48:03\n" +
                "2018-03-18 21:14:37\n" +
                "2018-03-08 11:08:38\n" +
                "2018-01-17 17:51:18\n" +
                "2017-12-22 18:34:25\n" +
                "2017-12-02 14:04:10\n" +
                "2017-09-13 21:45:14\n" +
                "2017-09-04 20:12:40\n" +
                "2017-07-13 18:24:04\n" +
                "2017-07-11 20:53:36\n" +
                "2017-07-10 18:17:50\n" +
                "2017-06-27 17:13:18\n" +
                "2017-06-26 16:32:58\n" +
                "2017-06-24 22:05:37\n" +
                "2017-06-24 18:29:54\n" +
                "2017-06-15 15:21:22\n" +
                "2017-06-15 06:28:21\n" +
                "2017-06-14 20:09:38\n" +
                "2017-05-27 10:09:19\n" +
                "2017-05-26 19:39:47\n" +
                "2017-04-27 18:57:41\n" +
                "2017-03-18 17:41:27\n" +
                "2017-03-17 19:30:12\n";
        for (String time : times.split("\n")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long ts = dateFormat.parse(time).getTime();
            Instant currentDate = Instant.ofEpochMilli(ts);
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            String date = dateFormat2.format(Date.from(currentDate));
            System.out.println(date);
        }

    }
}
