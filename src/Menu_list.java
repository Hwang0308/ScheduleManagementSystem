import java.util.Scanner;

public class Menu_list {

	public static void main(String[] args) {	
		while (true) {
			System.out.println("1. Add schedule");
			System.out.println("2. Edit schedule");
			System.out.println("3. Delete schedule");
			System.out.println("4. Show schedule");
			System.out.println("5. Exit");
			
			Scanner menu = new Scanner(System.in);
			int menu_list = menu.nextInt();
			
			if (menu_list == 1) {
				System.out.println("Add schedule!");
				System.out.print("Month(01 ~ 12) : ");
				Scanner m = new Scanner(System.in);
				int month = m.nextInt();
				System.out.print("Day(01 ~ 31) : ");
				Scanner d = new Scanner(System.in);
				int day = d.nextInt();
			
				System.out.println("New Schedule! " + month + "/" + day);
			}
			else if (menu_list == 2) {
				System.out.println("Edit schedule!");
				System.out.print("Month(01 ~ 12) : ");
				Scanner m = new Scanner(System.in);
				int month = m.nextInt();
				System.out.print("Day(01 ~ 31) : ");
				Scanner d = new Scanner(System.in);
				int day = d.nextInt();
			}
			else if (menu_list == 3) {
				System.out.println("Delete schedule!");
				System.out.print("Month(01 ~ 12) : ");
				Scanner m = new Scanner(System.in);
				int month = m.nextInt();
				System.out.print("Day(01 ~ 31) : ");
				Scanner d = new Scanner(System.in);
				int day = d.nextInt();
			}
			else if (menu_list == 4) {
				System.out.println("Show schedule!");
			}
			else if (menu_list == 5) {
				System.out.println("Exit");
				break;
			}
			else {
				System.out.println("No Access! Try Again!");
			}
		}
	}
}