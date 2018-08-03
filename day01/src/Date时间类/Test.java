package Date时间类;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日 格式为：xxxx-xx-xx xx：xx：xx");
        String putDay = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        Date shengDay = df.parse(putDay);
        Date nowDay= new Date();
        long shengri = shengDay.getTime();
        long xitong = nowDay.getTime();
        long chushengDay = xitong-shengri;
        System.out.println("您出生了"+chushengDay/1000/60/60/24+"天了");
    }
}
