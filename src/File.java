import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class File {
	public void writeScheduleAdd() throws IOException {
		PrintWriter file = new PrintWriter(new FileWriter("Information.txt", true));

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		file.println(format.format(date) + ", Add Schedule // ");

		file.close();
	}
	
	public void writeScheduleEdit() throws IOException {
		PrintWriter file = new PrintWriter(new FileWriter("Information.txt", true));

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		file.println(format.format(date) + ", Edit Schedule // ");

		file.close();
	}
	
	public void writeScheduleDelete() throws IOException {
		PrintWriter file = new PrintWriter(new FileWriter("Information.txt", true));

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		file.println(format.format(date) + ", Delete Schedule // ");

		file.close();
	}
	
	public void writeScheduleShow() throws IOException {
		PrintWriter file = new PrintWriter(new FileWriter("Information.txt", true));

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		file.println(format.format(date) + ", Show Schedule // ");

		file.close();
	}
}