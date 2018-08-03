package Date时间类;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date da = sdf.parse("2018-03-04");
        System.out.println(da);
        DateFormat f2 = new SimpleDateFormat("yyyy年MM月dd日");
        String sd =f2.format(da);
        System.out.println(sd);
    }
}
