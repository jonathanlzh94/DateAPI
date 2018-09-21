import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class UserMainCode {
	
	public static void displayDate(String date) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		try {
			Date d = new SimpleDateFormat("MMM dd, yyyy").parse(date);
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
