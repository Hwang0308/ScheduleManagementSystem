import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	public static void menu() {
		System.out.println("1. Simple Schedule");
		System.out.println("2. Detail Schedule");
		System.out.println("5. Exit");
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		SimpleSchedule simple = new SimpleSchedule();
		DetailSchedule detail = new DetailSchedule();
		System.out.println("Schedule Management Program");
		while (true) {
			try {
				Gui m = new Gui();
				m.guiMenu();
//				m.guiAddSchedule();
				
				menu();

				Scanner input = new Scanner(System.in);
				int menu = input.nextInt();

				if (menu == 1) {
					simple.menuRun();
				}
				else if (menu == 2) {
					detail.menuRun();
				}
				else if (menu == 5) {
					System.out.println("Exit");
					break;
				}
				else {System.out.println("Wrong Access!!!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error!!! Input int type.");
			}
		}
	}
}