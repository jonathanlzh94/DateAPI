import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDay(int year, int month) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date = LocalDate.of(year, month, 1);
		LocalDate start = date.withDayOfMonth(1);
		LocalDate end = date.withDayOfMonth(date.lengthOfMonth());
//		String s = day.toString().toLowerCase();
//		String titleCase = s.substring(0, 1).toUpperCase().concat(s.substring(1));
		System.out.println(start.getDayOfWeek().toString());
		System.out.println(end.getDayOfWeek().toString());
	}
}
