import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu_list {
	public static void AddSchedule() {
		ArrayList<String> ScheduleList = new ArrayList<String>();
		
		System.out.print("Month(01 ~ 12) : ");
		Scanner input = new Scanner(System.in);
		String month = input.nextLine();
		ScheduleList.add(month);
		
		System.out.print("Day(01 ~ 31) : ");
		input = new Scanner(System.in);
		String day = input.nextLine();
		ScheduleList.add(day);
		
		System.out.print("Schedule Title : ");
		input = new Scanner(System.in);
		String title = input.nextLine();
		ScheduleList.add(title);
		
		System.out.println("New Schedule!");
		System.out.println("");
		System.out.println("Month / day : " + month + "/" + day);
		System.out.println("Title : " + title);
		
		System.out.println(ScheduleList);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Add schedule");
			System.out.println("2. Edit schedule");
			System.out.println("3. Delete schedule");
			System.out.println("4. Show schedule");
			System.out.println("5. Exit");
			System.out.println("-----------------------");
			
			Scanner menu = new Scanner(System.in);
			int menu_list = menu.nextInt();
			
			if (menu_list == 1) {
				System.out.println("Add schedule!");
				AddSchedule();
				
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