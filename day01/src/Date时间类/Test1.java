package Date时间类;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s =df.format(d);
        System.out.println(s);
        DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String arr = "2018年04月25日 19时25分30秒";
        Date ddd = df1.parse(arr);
        System.out.println(ddd);
    }
}
