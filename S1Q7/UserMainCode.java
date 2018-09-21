import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UserMainCode {
	public static void displayDay(int year) {
		LocalDate start = LocalDate.of(year, 1, 1);
		LocalDate end = LocalDate.of(year, 12, 1);
		end = end.withDayOfMonth(end.lengthOfMonth());
//		String s = day.toString().toLowerCase();
//		String titleCase = s.substring(0, 1).toUpperCase().concat(s.substring(1));
		String startDay = start.getDayOfWeek().toString();
		String endDay =  end.getDayOfWeek().toString();
		startDay = startDay.substring(0, 1).toUpperCase().concat(startDay.substring(1, 3).toLowerCase());
		endDay = endDay.substring(0, 1).toUpperCase().concat(endDay.substring(1, 3).toLowerCase());
		System.out.println("Start Day of the given year is " + startDay);
		System.out.println("End Day of the given year is " + endDay);
	}
}
