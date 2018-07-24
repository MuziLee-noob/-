import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo05Practise {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.print("请输入生日（年/月/日）：");
        String birthDay = sc.next();
        Date today = new Date();
        Date birthDate = sdf.parse(birthDay);
        long lastDay = (today.getTime() - birthDate.getTime()) / 1000 / 60 / 60 / 24;
        System.out.println(lastDay);
    }
}
