import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String in this format(YYYY-MM-DD HH:mm:ss)");
		String date = sc.nextLine();
		UserMainCode.displayDateTime(date);
	}

}
