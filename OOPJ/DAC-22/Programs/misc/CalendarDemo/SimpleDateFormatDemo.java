import java.util.*;
import java.text.*;
class SimpleDateFormatDemo
{
	public static void main(String args[]) throws ParseException
	{
		Date d = new Date();		//Date object 
		System.out.println(d);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.UK);
		String s = df.format(d);
		System.out.println("Formatted Date (Locale.UK): "+s);
		
		//Date to Formatted String
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MMM/yyyy hh:mm");
		s = sdf.format(d);
		System.out.println("SimpleDateFormat date: "+s);
		
		//String to Date conversion
		String strDate="24/11/2020";  
    		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(strDate);  
    		System.out.println(strDate+"\t"+date1);	
    		
    		//Get current day, month or year using Calendar
    		Calendar c = Calendar.getInstance();
    		int year = c.get(Calendar.YEAR);
    		System.out.println(year);

	}
}



