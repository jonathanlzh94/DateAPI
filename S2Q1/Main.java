import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year in Integer");
		int year = sc.nextInt();
		System.out.println("Enter Month in Integer");
		int month = sc.nextInt();
		System.out.println("Enter date in Integer");
		int day = sc.nextInt();
		UserMainCode.displayDate(year, month, day);
	}

}
