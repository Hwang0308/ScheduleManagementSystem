import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Loader {

	public void loadSchedule(ArrayList<Gui> list) {
		try {	
			BufferedReader loadFile = new BufferedReader(new FileReader("Loader.txt"));
			String title, month, day, hour, minute, second, text;
			while(true) {
				Gui schedule = new Gui();
				
				title = loadFile.readLine();
				month = loadFile.readLine();
				day = loadFile.readLine();
				hour = loadFile.readLine();
				minute = loadFile.readLine();
				second = loadFile.readLine();
				text = loadFile.readLine();

				if (title == null) {
					break;
				}
				
				schedule.setTitleType(title);
				schedule.setMonthType(month);
				schedule.setDaytype(day);
				schedule.setHourType(hour);
				schedule.setMinuteType(minute);
				schedule.setSecondType(second);
				schedule.setTextType(text);
				
				list.add(schedule);
			}
			loadFile.close();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
	
	public void saveSchedule(ArrayList<Gui> list) {
		try {
			PrintWriter writeFile = new PrintWriter("Loader.txt");
			for (int i = 0; i < list.size(); i++) {
				writeFile.println(list.get(i).getTitleType());
				writeFile.println(list.get(i).getMonthType());
				writeFile.println(list.get(i).getDayType());
				writeFile.println(list.get(i).getHourType());
				writeFile.println(list.get(i).getMinuteType());
				writeFile.println(list.get(i).getSecondType());
				writeFile.println(list.get(i).getTextType());
			}
			writeFile.close();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}

}
