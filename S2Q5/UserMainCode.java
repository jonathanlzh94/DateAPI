import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDate(int year, int daysToAdd) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date= LocalDate.of(year, 1, 1);
		date = date.plusDays(daysToAdd-1);

		System.out.println("100th day of " + year + " : " + date.format(df));

		
	}
}
