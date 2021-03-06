package Adage;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class CreditCard {
	
	public static void main(String[] args){
        
        String date1="2017-07-19 13:02:58";
         
        String date2="2017-07-19 14:02:58";
        //将字符串格式的日期格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            //将日期转成Date对象作比较
            Date fomatDate1=sdf.parse(date1);
            Date fomatDate2=sdf.parse(date2);
            //比较两个日期
            int result=fomatDate2.compareTo(fomatDate1);
            //如果日期相等返回0
            if(result==0){
                System.out.println("两个时间相等");
            }else if(result<0){
                //小于0，参数date1就是在date2之后
                System.out.println("date1大于date2");
            }else{
                //大于0，参数date1就是在date2之前
                System.out.println("date1小于date2");
            }
             
        } catch (Exception e) {
             
            e.printStackTrace();
        }
    }
}
