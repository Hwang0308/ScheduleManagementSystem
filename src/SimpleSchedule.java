import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleSchedule extends Schedule {
	static ArrayList<SimpleSchedule> list = new ArrayList<SimpleSchedule>(); //�������� ����, ��, ���� ���� �� �ִ� ����Ʈ
	File file = new File();
	
	public void menuList() {
		System.out.println("Simple Schedule Manage");
		System.out.println("");
		System.out.println("1. Add schedule");
		System.out.println("2. Edit schedule");
		System.out.println("3. Delete schedule");
		System.out.println("4. Show schedule");
		System.out.println("5. Exit");
		System.out.println("-----------------------");
	}
	public void menuRun() {
		try {
			menuList();
			input = new Scanner(System.in);
			int newMenu = input.nextInt();

			if (newMenu == 1) {
				addSchedule();
			}
			else if (newMenu == 2) {
				editSchedule();
			}
			else if (newMenu == 3) {
				deleteSchedule();
			}
			else if (newMenu == 4) {
				showSchedule();
			}
			else if (newMenu == 5) {
				System.out.println("Exit");
				return;
			}
			else {
				System.out.println("No Access! Try Again!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Error! Input int type!");
		}
	}
	
	public String toString() {
	    return this.title + " " + this.month + " " + this.day;
	} //String Ŭ������ �޼��� �������̵�
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	public void addSchedule() {
		try {
			SimpleSchedule schedule = new SimpleSchedule();

			System.out.println("Add schedule!");

			System.out.print("Write Title : ");
			input = new Scanner(System.in);
			title = input.nextLine();
			schedule.setTitle(title);

			System.out.print("Month?(1 ~ 12) : ");
			input = new Scanner(System.in);
			month = input.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("It's not the correct month.");
				return;
			} //1~12�� ���̰� �ƴϸ� �Լ��� �����ϴ� ���ǹ�
			schedule.setMonth(month);

			System.out.print("Day?(1 ~ 31) : ");
			input = new Scanner(System.in);
			day = input.nextInt();
			if (day < 1 || day > 31) {
				System.out.println("It's not the correct day.");
				return;
			} //1~31�� ���̰� �ƴϸ� �Լ��� �����ϴ� ���ǹ�
			schedule.setDay(day);

			list.add(schedule);
			file.writeScheduleAdd();

			System.out.println("New Schedule is");
			System.out.println("Title : " + schedule.getTitle());
			System.out.println("Month : " + schedule.getMonth());
			System.out.println("Day : " + schedule.getDay());
			System.out.println("");
		} catch (InputMismatchException e) {
			System.out.println("Error! Input int type!");
		} catch (IOException e) {
			System.out.println("Error! IOException!");
		}
	}
	public void editSchedule() {
		try {
			System.out.println("Edit schedule!");
			System.out.println("Enter the title of the schedule you want to edit");
			input = new Scanner(System.in);
			String t = input.nextLine();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTitle().equals(t)) { //�������� �������� �������� ã�Ƴ��� ���ǹ�
					System.out.println("the schedule you want to change is");
					System.out.println(list.get(i));

					System.out.print("Title? : ");
					input = new Scanner(System.in);
					list.get(i).setTitle(input.nextLine());

					System.out.print("Month? : ");
					input = new Scanner(System.in);
					if (month < 1 || month > 12) {
						System.out.println("It's not the correct month.");
						return;
					} //1~12�� ���̰� �ƴϸ� �Լ��� �����ϴ� ���ǹ�
					list.get(i).setMonth(input.nextInt());

					System.out.print("Day? : ");
					input = new Scanner(System.in);
					if (day < 1 || day > 31) {
						System.out.println("It's not the correct day.");
						return;
					} //1~31�� ���̰� �ƴϸ� �Լ��� �����ϴ� ���ǹ�
					list.get(i).setDay(input.nextInt());
					file.writeScheduleEdit();

					System.out.println("Schedle is edit!!");
					System.out.println("Title : " + list.get(i).getTitle());
					System.out.println("Month : " + list.get(i).getMonth());
					System.out.println("Day : " + list.get(i).getDay());

					return;
				}
				else {System.out.println("Find your title....");}
			}
			System.out.println("The title name is not exist.");
		} catch (InputMismatchException e) {
			System.out.println("Error! Input int type!");
		} catch (IOException e) {
			System.out.println("Error! IOException!");
		}
	}
	public void showSchedule() {
		try {
			System.out.println("Show schedule!");
			file.writeScheduleShow();

			for (int i = 0; i < list.size(); i++) {
				System.out.println("Title : " + list.get(i).getTitle());
				System.out.println("Month : " + list.get(i).getMonth());
				System.out.println("Day : " + list.get(i).getDay());
				System.out.println("--------------------------------------------------------------------------------------");
			}
		} catch (IOException e) {
			System.out.println("Error! IOException!");
		}
	}
	public void deleteSchedule() {
		try {
			System.out.println("Delete schedule!");
			System.out.println("Write your deleting schedule's title.");
			input = new Scanner(System.in);
			String t = input.nextLine();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTitle().equals(t)) {
					System.out.println("The schedule you want to delete is ");
					System.out.println("Title : " + list.get(i).getTitle());
					System.out.println("Month : " + list.get(i).getMonth());
					System.out.println("Day : " + list.get(i).getDay());
					System.out.println("Are you sure to delete this schedule?");
					System.out.println("Yes : 1    /    No : 2");
					input = new Scanner(System.in);
					int checkNum = input.nextInt();

					if (checkNum == 1) {
						list.remove(i);
						System.out.println("Successfully deleted!!");

						return;
					}//1�� �Է��ϸ� ����Ʈ�� �����͸� �����Ѵ�.
					else if (checkNum == 2) {
						System.out.println("Do not delete.");
					}//2�� �Է��ϸ� ����Ʈ�� �����͸� �������� ����. ���, return���� �������� ���� ������ �ٸ� ������ ã�´�.
					else {
						System.out.println("Wrong approach");

						return;
					}//�ٸ� ���ڸ� �Է��ϸ� �߸��� �������� �ƹ��͵� ���� �ʰ� �Լ��� �����Ѵ�.
				}
				else {System.out.println("Find your title....");}
			}
			file.writeScheduleDelete();
			System.out.println("The title name is not exist.");
		} catch (InputMismatchException e) {
			System.out.println("Error! Input int type!");
		} catch (IOException e) {
			System.out.println("Error! IOException!");
		}
	}
}