import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the year");
		String d1 = sc.nextLine();
		String d2 = sc.nextLine();
		UserMainCode.displayDateDetails(d1, d2);
	}

}
