import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Schedule s = new Schedule();
		DetailSchedule ss = new DetailSchedule();
		System.out.println("Schedule Magement Program");
		while (true) {
			s.menu();
			
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			
			if (menu == 1) {
				s.menuRun();
			}
			else if (menu == 2) {
				ss.menuRun();
			}
			else if (menu == 5) {
				System.out.println("Exit");
				break;
			}
			else {System.out.println("Wrong Access!!!");
			}
		}
	}
}