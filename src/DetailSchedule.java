import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetailSchedule extends Schedule {
	static ArrayList<DetailSchedule> list = new ArrayList<DetailSchedule>();
	File file = new File();
	
	public void menuList() {
		System.out.println("Detail Schedule Manage");
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
	    return this.title + " " + this.month + " " + this.day + " " + this.hour + " " + this.minute + " " + this.second + " " + this.text;
	}//String 클래스의 메서드 오버라이딩
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setText(String text) {
		this.text = text;
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
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	public String getText() {
		return this.text;
	}
	
	public void addSchedule() {
		try {
			DetailSchedule schedule = new DetailSchedule();

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
			}
			schedule.setMonth(month);

			System.out.print("Day?(1 ~ 31) : ");
			input = new Scanner(System.in);
			day = input.nextInt();
			if (day < 1 || day > 31) {
				System.out.println("It's not the correct day.");
				return;
			}
			schedule.setDay(day);

			System.out.print("Hour?(1 ~ 24) : ");
			input = new Scanner(System.in);
			hour = input.nextInt();
			if (hour < 1 || hour > 24) {
				System.out.println("It's not the correct hour.");
				return;
			}
			schedule.setHour(hour);

			System.out.print("Minute?(0 ~ 59) : ");
			input = new Scanner(System.in);
			minute = input.nextInt();
			if (minute < 0 || minute > 59) {
				System.out.println("It's not the correct minute.");
				return;
			}
			schedule.setMinute(minute);

			System.out.print("Second?(0 ~ 59) : ");
			input = new Scanner(System.in);
			second = input.nextInt();
			if (second < 0 || second > 59) {
				System.out.println("It's not the correct second.");
				return;
			}
			schedule.setSecond(second);

			System.out.print("Text? : ");
			input = new Scanner(System.in);
			text = input.nextLine();
			schedule.setText(text);

			list.add(schedule);
			file.writeScheduleAdd();

			System.out.println("New Schedule is");
			System.out.println("Title : " + schedule.getTitle());
			System.out.println("Month : " + schedule.getMonth());
			System.out.println("Day : " + schedule.getDay());
			System.out.println("Hour : " + schedule.getHour());
			System.out.println("Minute : " + schedule.getMinute());
			System.out.println("Second : " + schedule.getSecond());
			System.out.println("Text : " + schedule.getText());
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
				if (list.get(i).getTitle().equals(t)) {
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
					}
					list.get(i).setMonth(input.nextInt());

					System.out.print("Day? : ");
					input = new Scanner(System.in);
					if (day < 1 || day > 31) {
						System.out.println("It's not the correct day.");
						return;
					}
					list.get(i).setDay(input.nextInt());

					System.out.print("Hour? : ");
					input = new Scanner(System.in);
					if (hour < 1 || hour > 24) {
						System.out.println("It's not the correct Hour.");
						return;
					}
					list.get(i).setHour(input.nextInt());

					System.out.print("Minute? : ");
					input = new Scanner(System.in);
					if (minute < 0 || minute > 59) {
						System.out.println("It's not the correct minute.");
						return;
					}
					list.get(i).setMinute(input.nextInt());

					System.out.print("Second? : ");
					input = new Scanner(System.in);
					if (second < 0 || second > 59) {
						System.out.println("It's not the correct second.");
						return;
					}
					list.get(i).setSecond(input.nextInt());

					System.out.print("Text? : ");
					input = new Scanner(System.in);
					list.get(i).setText(input.nextLine());
					file.writeScheduleEdit();

					System.out.println("Schedle is edit!!");
					System.out.println("Title : " + list.get(i).getTitle());
					System.out.println("Month : " + list.get(i).getMonth());
					System.out.println("Day : " + list.get(i).getDay());
					System.out.println("Hour : " + list.get(i).getHour());
					System.out.println("Minute : " + list.get(i).getMinute());
					System.out.println("Second : " + list.get(i).getSecond());
					System.out.println("Text : " + list.get(i).getText());

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

			for (int i = 0; i < list.size(); i++) {
				System.out.println("Title : " + list.get(i).getTitle());
				System.out.println("Month : " + list.get(i).getMonth());
				System.out.println("Day : " + list.get(i).getDay());
				System.out.println("Hour : " + list.get(i).getHour());
				System.out.println("Minute : " + list.get(i).getMinute());
				System.out.println("Second : " + list.get(i).getSecond());
				System.out.println("Text : " + list.get(i).getText());
				System.out.println("--------------------------------------------------------------------------------------");
			}
			file.writeScheduleShow();
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
					System.out.println("Schedle is edit!!");
					System.out.println("Title : " + list.get(i).getTitle());
					System.out.println("Month : " + list.get(i).getMonth());
					System.out.println("Day : " + list.get(i).getDay());
					System.out.println("Hour : " + list.get(i).getHour());
					System.out.println("Minute : " + list.get(i).getMinute());
					System.out.println("Second : " + list.get(i).getSecond());
					System.out.println("Text : " + list.get(i).getText());
					System.out.println("Are you sure to delete this schedule?");
					System.out.println("Yes : 1    /    No : 2");
					input = new Scanner(System.in);
					int checkNum = input.nextInt();

					if (checkNum == 1) {
						list.remove(i);
						System.out.println("Successfully deleted!!");

						return;
					}
					else if (checkNum == 2) {
						System.out.println("Do not delete.");
					}
					else {
						System.out.println("Wrong approach");

						return;
					}
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