import java.util.Scanner;

public abstract class Schedule {
	protected int hour;
	protected int minute;
	protected int second;
	protected String text;
	protected Scanner input;
	protected String title;
	protected int month, day;
	
	public abstract String toString();
	
	public abstract void menuList();
	public abstract void menuRun();
	
	public abstract void addSchedule();
	public abstract void editSchedule();
	public abstract void showSchedule();
	public abstract void deleteSchedule();
	
	public abstract void setTitle(String title);
	public abstract void setMonth(int month);
	public abstract void setDay(int day);
	
	public abstract String getTitle();
	public abstract int getMonth();
	public abstract int getDay();
}
