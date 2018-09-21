import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDateDetails(String d1, String d2) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d2, formatter);
		Period interval = Period.between(date1, date2);
		System.out.println("Difference between " + date1.format(formatter).toString() + " and "
				+ date2.format(formatter).toString() + ": " + interval.getYears() + " Years and " +
				interval.getMonths() + " Months");
	}
}
