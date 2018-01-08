import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class CalendarDemo {

    public static void main(String[] args) {
        
        
        Calendar cal=Calendar.getInstance();
        //current time and default time zone , convert the date to string
        System.out.println(cal.getTime());
        System.out.println(TimeZone.getDefault().getID());
       
        DateFormat df1=new SimpleDateFormat("MMM dd,yyyy hh:mm:ss");
        
        String date1=df1.format(cal.getTime());
        System.out.println("convert the date to string : "+date1);
        Date dt1=cal.getTime();
        //add days
        cal.add(Calendar.DATE, 2);
        String date2=df1.format(cal.getTime());
        System.out.println("Add 2 days to current date: "+date2);
        Date dt2=cal.getTime();
        
        System.out.println("GET THE DIFFERENCE : "+TimeUnit.DAYS.convert((dt2.getTime()-dt1.getTime()),TimeUnit.MILLISECONDS));
        System.out.println("GET THE DIFFERENCE in minutes : "+TimeUnit.MINUTES.convert((dt2.getTime()-dt1.getTime()),TimeUnit.MILLISECONDS));
        
        
       //converting the Date to String and a different timezone
       DateFormat df=new SimpleDateFormat("MMM dd,yyyy hh:mm:ss");
       df.setTimeZone(TimeZone.getTimeZone("IST"));
       String dateString=df.format(cal.getTime());
       System.out.println(dateString);
       
       //converting it back to date
       DateFormat df3=new SimpleDateFormat("MMM dd,yyyy hh:mm:ss");
       try {
        Date d=df3.parse(dateString);
        System.out.println(d.getDate());
       }
       catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }
       
       
       //take a date string as input and parse it to date and later convert to any format
       
       String strDate = "Thu Jun 18 20:56:02 EDT 2009";
       DateFormat parserSDF=new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
       
       try {
        Date dte=parserSDF.parse(strDate);
        parserSDF = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = parserSDF.format(dte);
        System.out.println("dd-MMM-yyyy date is ==>"+formattedDate);
    }
    catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}
