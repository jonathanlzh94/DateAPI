import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDay(String input) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date = LocalDate.parse(input, formatter);
		DayOfWeek day = date.getDayOfWeek();
		String s = day.toString().toLowerCase();
		String titleCase = s.substring(0, 1).toUpperCase().concat(s.substring(1));
		System.out.println(titleCase);
	}
}
