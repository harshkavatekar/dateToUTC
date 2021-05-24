import java.text.ParseException;

public class Main {
    public static void main(String args[]) throws ParseException {
    DateToUTC du=new DateToUTC();
   String s= du.utcConvertor("2019/08/03T16:20:17:717+05:30");
        System.out.println(s);


    }
}
