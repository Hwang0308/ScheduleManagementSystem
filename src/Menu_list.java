import java.util.ArrayList;
import java.util.Scanner;

public class Menu_list {
	public static void main(String[] args) {
		AddSchedule scheduleadd = new AddSchedule();
		while (true) {
			System.out.println("1. Add schedule");
			System.out.println("2. Edit schedule");
			System.out.println("3. Delete schedule");
			System.out.println("4. Show schedule");
			System.out.println("5. Exit");
			System.out.println("-----------------------");
			
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			
			if (menu == 1) {
				scheduleadd.AddSchedule();
				scheduleadd.scheduleIn();
				scheduleadd.getTitle();
				scheduleadd.getMonth();
				scheduleadd.getDay();
			}
			else if (menu == 2) {
				EditSchedule scheduleedit = new EditSchedule(scheduleadd.size());
			}
			else if (menu == 3) {
				System.out.println("Delete schedule!");
			}
			else if (menu == 4) {
				ShowSchedule scheduleshow = new ShowSchedule(scheduleadd.size());
			}
			else if (menu == 5) {
				System.out.println("Exit");
				break;
			}
			else {
				System.out.println("No Access! Try Again!");
			}
		}
	}
}