import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui extends Schedule implements ActionListener {
	static ArrayList<Gui> list = new ArrayList<Gui>();
	
	public String toString() {
	    return this.titleType + " " + this.monthType + " " + this.dayType + " " + this.hourType + " " + this.minuteType + " " + this.secondType + " " + this.textType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public void setMonthType(String monthType) {
		this.monthType = monthType;
	}
	public void setDaytype(String dayType) {
		this.dayType = dayType;
	}
	public void setHourType(String hourType) {
		this.hourType = hourType;
	}
	public void setMinuteType(String minuteType) {
		this.minuteType = minuteType;
	}
	public void setSecondType(String secondType) {
		this.secondType = secondType;
	}
	public void setTextType(String textType) {
		this.textType = textType;
	}
	public String getTitleType() {
		return titleType;
	}
	public String getMonthType() {
		return monthType;
	}
	public String getDayType() {
		return dayType;
	}
	public String getHourType() {
		return hourType;
	}
	public String getMinuteType() {
		return minuteType;
	}
	public String getSecondType() {
		return secondType;
	}
	public String getTextType() {
		return textType;
	}
	public void guiMenu() {
		guiMenuFrame = new JFrame("Menu");
		add = new JButton("Add Schedule");
		edit1 = new JButton("Edit Schedule");
		del = new JButton("Delete Schedule");
		show = new JButton("Show Schedule");
		exit = new JButton("Exit");
		JLabel label = new JLabel("Schedule Management Program");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(label);
		
		p2.add(add);
		p2.add(edit1);
		p2.add(del);
		p2.add(show);
		
		p3.add(exit);
		
		guiMenuFrame.add(p1, BorderLayout.NORTH);
		guiMenuFrame.add(p2, BorderLayout.CENTER);
		guiMenuFrame.add(p3, BorderLayout.SOUTH);
		
		add.addActionListener(this);
		edit1.addActionListener(this);
		del.addActionListener(this);
		show.addActionListener(this);
		exit.addActionListener(this);
		
		
		guiMenuFrame.setSize(300,200);
		guiMenuFrame.setDefaultCloseOperation(guiMenuFrame.EXIT_ON_CLOSE);
		guiMenuFrame.setVisible(true);
	}
	
	public void guiAddSchedule() {
		schedule = new Gui();
		
		guiAddFrame = new JFrame("Add Schedule");
		
		JLabel title = new JLabel("Title :    ");
		JLabel month = new JLabel("Month : ");
		JLabel day = new JLabel("Day :       ");
		JLabel hour = new JLabel("Hour :     ");
		JLabel minute = new JLabel("Minute :  ");
		JLabel second = new JLabel("Second : ");
		JLabel text = new JLabel("Text : ");
		
		titleField = new JTextField(" ", 40);
		monthField = new JTextField(" ", 40);
		dayField = new JTextField(" ", 40);
		hourField = new JTextField(" ", 40);
		minuteField = new JTextField(" ", 40);
		secondField = new JTextField(" ", 40);
		textArea = new JTextArea(" ", 10, 40);
		
		save = new JButton("Save");
		back1 = new JButton("Back");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.add(title);
		p1.add(titleField);
		p1.add(month);
		p1.add(monthField);
		p1.add(day);
		p1.add(dayField);
		p1.add(hour);
		p1.add(hourField);
		p1.add(minute);
		p1.add(minuteField);
		p1.add(second);
		p1.add(secondField);
		p1.add(text);
		p1.add(textArea);
		
		p2.add(save);
		p2.add(back1);
		
		
		guiAddFrame.add(p1, BorderLayout.CENTER);
		guiAddFrame.add(p2, BorderLayout.SOUTH);
		
		save.addActionListener(this);
		back1.addActionListener(this);
		
		guiAddFrame.setSize(500, 400);
		guiAddFrame.setVisible(true);
	}
	
	public void guiEditSchedule1() {
		guiEditFrame1 = new JFrame("Edit Schedules");
		
		JLabel text1 = new JLabel("Enter the title of the schedule you want to edit");
		editTitleField = new JTextField(" ", 20);
		editButton = new JButton("Edit");
		back3 = new JButton("Back");
		
		JPanel titlePanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel editPanel = new JPanel();
		
		textPanel.add(text1);
		editPanel.add(editTitleField);
		editPanel.add(editButton);
		editPanel.add(back3);
		
		for (int i = 0; i < list.size(); i++) {
			JLabel titleLabel = new JLabel(list.get(i).getTitleType());
			
			titlePanel.add(titleLabel);
			titlePanel.add(new JLabel("||"));
			
			guiEditFrame1.add(titlePanel, BorderLayout.SOUTH);
		}
		
		guiEditFrame1.add(textPanel, BorderLayout.NORTH);
		guiEditFrame1.add(editPanel, BorderLayout.CENTER);
		
		guiEditFrame1.setVisible(true);
		guiEditFrame1.setSize(600,150);
		
		editButton.addActionListener(this);
		back3.addActionListener(this);
	}
	
	public int guiEditSchedule2(int i) {
		guiEditFrame2 = new JFrame("Edit Schedule");

		JLabel title = new JLabel("Title :    ");
		JLabel month = new JLabel("Month : ");
		JLabel day = new JLabel("Day :       ");
		JLabel hour = new JLabel("Hour :     ");
		JLabel minute = new JLabel("Minute :  ");
		JLabel second = new JLabel("Second : ");
		JLabel text = new JLabel("Text : ");

		titleField = new JTextField(list.get(i).getTitleType(), 40);
		monthField = new JTextField(list.get(i).getMonthType(), 40);
		dayField = new JTextField(list.get(i).getDayType(), 40);
		hourField = new JTextField(list.get(i).getHourType(), 40);
		minuteField = new JTextField(list.get(i).getMinuteType(), 40);
		secondField = new JTextField(list.get(i).getSecondType(), 40);
		textArea = new JTextArea(list.get(i).getTextType(), 10, 40);

		edit2 = new JButton("Edit");
		back4 = new JButton("Back");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.add(title);
		p1.add(titleField);
		p1.add(month);
		p1.add(monthField);
		p1.add(day);
		p1.add(dayField);
		p1.add(hour);
		p1.add(hourField);
		p1.add(minute);
		p1.add(minuteField);
		p1.add(second);
		p1.add(secondField);
		p1.add(text);
		p1.add(textArea);

		p2.add(edit2);
		p2.add(back4);
		
		guiEditFrame2.add(p1, BorderLayout.CENTER);
		guiEditFrame2.add(p2, BorderLayout.SOUTH);

		edit2.addActionListener(this);
		back4.addActionListener(this);

		guiEditFrame2.setSize(500, 400);
		guiEditFrame2.setVisible(true);
		
		System.out.println(i);
		
		return this.i = i;
	}
	
	public void guiDeleteSchedule1() {
		guiDeleteFrame1 = new JFrame("Delete Schedules");
		
		JLabel text1 = new JLabel("Enter the title of the schedule you want to delete");
		deleteTitleField = new JTextField(" ", 20);
		delButton = new JButton("Delete");
		back5 = new JButton("Back");
		
		JPanel titlePanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel editPanel = new JPanel();
		
		textPanel.add(text1);
		editPanel.add(deleteTitleField);
		editPanel.add(delButton);
		editPanel.add(back5);
		
		for (int i = 0; i < list.size(); i++) {
			JLabel titleLabel = new JLabel(list.get(i).getTitleType());
			
			titlePanel.add(titleLabel);
			titlePanel.add(new JLabel("||"));
			
			guiDeleteFrame1.add(titlePanel, BorderLayout.SOUTH);
		}
		
		guiDeleteFrame1.add(textPanel, BorderLayout.NORTH);
		guiDeleteFrame1.add(editPanel, BorderLayout.CENTER);
		
		guiDeleteFrame1.setVisible(true);
		guiDeleteFrame1.setSize(600,150);
		
		delButton.addActionListener(this);
		back5.addActionListener(this);
	}
	
	public int guiDeleteSchedule2(int i) {
		guiDeleteFrame2 = new JFrame("Delete Schedule");
		
		JLabel inforLabel = new JLabel("Are you sure to remove this schedule???");
		
		JLabel titleLabel = new JLabel(list.get(i).getTitleType());
		JLabel monthLabel = new JLabel(list.get(i).getMonthType());
		JLabel dayLabel = new JLabel(list.get(i).getDayType());
		JLabel hourLabel = new JLabel(list.get(i).getHourType());
		JLabel minuteLabel = new JLabel(list.get(i).getMinuteType());
		JLabel secondLabel = new JLabel(list.get(i).getSecondType());
		JLabel textLabel = new JLabel(list.get(i).getTextType());
		
		OKButton = new JButton("OK");
		NOButton = new JButton("NO");
		
		JPanel inforPanel = new JPanel();
		JPanel schedulePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		inforPanel.add(inforLabel);
		schedulePanel.add(titleLabel);
		schedulePanel.add(monthLabel);
		schedulePanel.add(dayLabel);
		schedulePanel.add(hourLabel);
		schedulePanel.add(minuteLabel);
		schedulePanel.add(secondLabel);
		schedulePanel.add(textLabel);
		buttonPanel.add(OKButton);
		buttonPanel.add(NOButton);
		
		guiDeleteFrame2.add(inforPanel, BorderLayout.NORTH);
		guiDeleteFrame2.add(schedulePanel, BorderLayout.CENTER);
		guiDeleteFrame2.add(buttonPanel, BorderLayout.SOUTH);
		
		guiDeleteFrame2.setSize(300, 300);
		guiDeleteFrame2.setVisible(true);
		
		OKButton.addActionListener(this);
		NOButton.addActionListener(this);
		
		return this.i = i;
	}
	
	public void guiShowSchedule() {
		guiShowFrame = new JFrame("My Schedules");
		
		JPanel showPanel = new JPanel();
		JPanel titlePanel = new JPanel();
		JPanel monthPanel = new JPanel();
		JPanel dayPanel = new JPanel();
		JPanel hourPanel = new JPanel();
		JPanel minutePanel = new JPanel();
		JPanel secondPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel backPanel = new JPanel();
		
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		monthPanel.setLayout(new BoxLayout(monthPanel, BoxLayout.Y_AXIS));
		dayPanel.setLayout(new BoxLayout(dayPanel, BoxLayout.Y_AXIS));
		hourPanel.setLayout(new BoxLayout(hourPanel, BoxLayout.Y_AXIS));
		minutePanel.setLayout(new BoxLayout(minutePanel, BoxLayout.Y_AXIS));
		secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
		
		showPanel.add(titlePanel);
		showPanel.add(monthPanel);
		showPanel.add(dayPanel);
		showPanel.add(hourPanel);
		showPanel.add(minutePanel);
		showPanel.add(secondPanel);
		showPanel.add(textPanel);
		
		back2 = new JButton("back");
		backPanel.add(back2);
		guiShowFrame.add(backPanel, BorderLayout.SOUTH);
		
		titlePanel.add(new JLabel("Title"));
		monthPanel.add(new JLabel("Month"));
		dayPanel.add(new JLabel("Day"));
		hourPanel.add(new JLabel("Hour"));
		minutePanel.add(new JLabel("Minute"));
		secondPanel.add(new JLabel("Second"));
		textPanel.add(new JLabel("Text"));
		guiShowFrame.add(showPanel, BorderLayout.CENTER);
		
		for (int i = 0; i < list.size(); i++) {
			JLabel titleLabel = new JLabel(list.get(i).getTitleType());
			JLabel monthLabel = new JLabel(list.get(i).getMonthType());
			JLabel dayLabel = new JLabel(list.get(i).getDayType());
			JLabel hourLabel = new JLabel(list.get(i).getHourType());
			JLabel minuteLabel = new JLabel(list.get(i).getMinuteType());
			JLabel secondLabel = new JLabel(list.get(i).getSecondType());
			JLabel textLabel = new JLabel(list.get(i).getTextType());
			
			titlePanel.add(titleLabel);
			monthPanel.add(monthLabel);
			dayPanel.add(dayLabel);
			hourPanel.add(hourLabel);
			minutePanel.add(minuteLabel);
			secondPanel.add(secondLabel);
			textPanel.add(textLabel);
			
			guiShowFrame.add(showPanel, BorderLayout.CENTER);
		}
		
		back2.addActionListener(this);
		
		guiShowFrame.setSize(1000, 500);
		guiShowFrame.setVisible(true);
	}
	
	public void toDelete(int i) {
		list.remove(i);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			guiMenuFrame.setVisible(false);
			guiAddSchedule();
		}
		else if (e.getSource() == edit1) {
			guiMenuFrame.setVisible(false);
			guiEditSchedule1();
		}
		else if (e.getSource() == edit2) {
			schedule = new Gui();
			
			String s1 = titleField.getText();
			String s2 = monthField.getText();
			String s3 = dayField.getText();
			String s4 = hourField.getText();
			String s5 = minuteField.getText();
			String s6 = secondField.getText();
			String s7 = textArea.getText();
			
			schedule.setTitleType(s1);
			schedule.setMonthType(s2);
			schedule.setDaytype(s3);
			schedule.setHourType(s4);
			schedule.setMinuteType(s5);
			schedule.setSecondType(s6);
			schedule.setTextType(s7);
			
			list.set(i, schedule);
			
			System.out.println("수정 성공");
			System.out.println("수정한 내용 : " + schedule);
			guiEditFrame2.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == del) {
			guiMenuFrame.setVisible(false);
			guiDeleteSchedule1();
		}
		else if (e.getSource() == show) {
			guiMenuFrame.setVisible(false);
			guiShowSchedule();
		}
		else if (e.getSource() == exit) {
			System.exit(0);
		}
		else if (e.getSource() == save) {
			String s1 = titleField.getText();
			String s2 = monthField.getText();
			String s3 = dayField.getText();
			String s4 = hourField.getText();
			String s5 = minuteField.getText();
			String s6 = secondField.getText();
			String s7 = textArea.getText();
			
			schedule.setTitleType(s1);
			schedule.setMonthType(s2);
			schedule.setDaytype(s3);
			schedule.setHourType(s4);
			schedule.setMinuteType(s5);
			schedule.setSecondType(s6);
			schedule.setTextType(s7);
			
			list.add(schedule);
			System.out.println("저장 성공");
			System.out.println("저장한 내용 : " + schedule);
			guiAddFrame.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == back1) {
			guiAddFrame.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == back2) {
			guiShowFrame.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == back3) {
			guiEditFrame1.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == back4) {
			guiEditFrame2.setVisible(false);
			guiEditFrame1.setVisible(true);
		}
		else if (e.getSource() == back5) {
			guiDeleteFrame1.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == editButton) {
			for (int i = 0; i < list.size(); i++) {
				if (editTitleField.getText().equals(list.get(i).getTitleType())) {
					guiEditFrame1.setVisible(false);
					guiEditSchedule2(i);
					return;
				}
				else {
					System.out.println("Find title");
				}
			}
			System.out.println("Title unmatched!!");
		}
		else if (e.getSource() == delButton) {
			for (int i = 0; i < list.size(); i++) {
				if (deleteTitleField.getText().equals(list.get(i).getTitleType())) {
					guiDeleteSchedule2(i);
					return;
				}
				else {
					System.out.println("Find title");
				}
			}
			System.out.println("Title unmatched!!");
		}
		else if (e.getSource() == OKButton) {
			toDelete(i);
			System.out.println("제거 완료");
			guiDeleteFrame2.setVisible(false);
			guiDeleteFrame1.setVisible(false);
			guiMenuFrame.setVisible(true);
		}
		else if (e.getSource() == NOButton) {
			System.out.println("제거 하지 않음");
			guiDeleteFrame2.setVisible(false);
		}
	}
}