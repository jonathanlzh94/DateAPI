import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int daysToAdd = sc.nextInt();
		UserMainCode.displayDate(year, daysToAdd);
	}

}
