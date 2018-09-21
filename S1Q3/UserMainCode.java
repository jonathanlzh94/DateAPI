import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
	
	public static void displayDay(String s) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sf.parse(s);
			LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int dayOfYear = localDate.getDayOfYear();
			System.out.println("Day of year : "+ dayOfYear);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
