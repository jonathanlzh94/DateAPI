import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayTime(String input) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.parse(input, df);
		
		time = time.plusHours(2);
		
		System.out.println(time.format(df));
;
		
	}
}
