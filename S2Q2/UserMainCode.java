import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class UserMainCode {
	public static void displayAge(String d1, String d2) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		LocalDate date1 = LocalDate.parse(d1, df);
		LocalDate date2 = LocalDate.parse(d2, df);
		Period diff = Period.between(date1, date2);
		
		
		System.out.println("I am  " + diff.getYears() + " years, " + diff.getMonths() + 
				" months and " + diff.getDays() + " days old.");
		
	}
}
