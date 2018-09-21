import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserMainCode {
	
	public static void displayDateTime(String input) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sf.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy, H:mm:ss").format(date));
	}
}
