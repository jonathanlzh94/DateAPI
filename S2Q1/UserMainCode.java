import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDate(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, day);
		int weekday = date.getDayOfWeek().getValue();
		LocalDate prev = null;
		LocalDate next = null;
		if (weekday < 5) {
			prev = date.minusDays(2 + weekday);
			next = date.plusDays(5-weekday);
		} else if (weekday > 5) {
			prev = date.minusDays(weekday - 5);
			next = date.plusDays(7 - (weekday - 5));
		}
		System.out.println("Next Friday: " + next);
		System.out.println("Previous Friday: " + prev);
		
	}
}
