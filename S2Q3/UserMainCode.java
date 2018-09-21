import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDay(String input) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date = LocalDate.parse(input, df);
		
		LocalDate prev = date.minusDays(10);
		LocalDate next = date.plusDays(10);
		
		System.out.println(prev);
		System.out.println(prev.getDayOfWeek().toString().substring(0, 1) + prev.getDayOfWeek().toString().substring(1).toLowerCase());
		System.out.println(next);
		System.out.println(next.getDayOfWeek().toString().substring(0, 1) + next.getDayOfWeek().toString().substring(1).toLowerCase());
		
	}
}
