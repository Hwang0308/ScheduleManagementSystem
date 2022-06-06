import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui implements ActionListener {
	static ArrayList<Gui> list = new ArrayList<Gui>();
	
	private JFrame guiMunuFrame, guiAddFrame, guiShowFrame;
	private String titleType, monthType, dayType, hourType, minuteType, secondType, textType;
	private JButton add, edit, del, show, exit, save, back;
	private Gui schedule;
	private JTextField titleField, monthField, dayField, hourField, minuteField, secondField;
	private JTextArea textArea;
	
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
		guiMunuFrame = new JFrame("Menu");
		add = new JButton("Add Schedule");
		edit = new JButton("Edit Schedule");
		del = new JButton("Delete Schedule");
		show = new JButton("Show Schedule");
		exit = new JButton("Exit");
		JLabel label = new JLabel("Schedule Management Program");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(label);
		
		p2.add(add);
		p2.add(edit);
		p2.add(del);
		p2.add(show);
		
		p3.add(exit);
		
		guiMunuFrame.add(p1, BorderLayout.NORTH);
		guiMunuFrame.add(p2, BorderLayout.CENTER);
		guiMunuFrame.add(p3, BorderLayout.SOUTH);
		
		add.addActionListener(this);
		edit.addActionListener(this);
		del.addActionListener(this);
		show.addActionListener(this);
		exit.addActionListener(this);
		
		
		guiMunuFrame.setSize(300,200);
		guiMunuFrame.setDefaultCloseOperation(guiMunuFrame.EXIT_ON_CLOSE);
		guiMunuFrame.setVisible(true);
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
		
		titleField = new JTextField("", 40);
		monthField = new JTextField("", 40);
		dayField = new JTextField("", 40);
		hourField = new JTextField("", 40);
		minuteField = new JTextField("", 40);
		secondField = new JTextField("", 40);
		textArea = new JTextArea("", 10, 40);
		
		save = new JButton("Save");
		back = new JButton("Back");
		
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
		p2.add(back);
		
		
		guiAddFrame.add(p1, BorderLayout.CENTER);
		guiAddFrame.add(p2, BorderLayout.SOUTH);
		
		save.addActionListener(this);
		back.addActionListener(this);
		
		guiAddFrame.setSize(500, 400);
		guiAddFrame.setVisible(true);
	}
	
	public void guiShowSchedule() {
		JFrame guiShowFrame = new JFrame("My Schedules");
		
		for (int i = 0; i < list.size(); i++) {
			JPanel showPanel = new JPanel();
			JLabel titleLabel = new JLabel(list.get(i).getTitleType());
			JLabel monthLabel = new JLabel(list.get(i).getMonthType());
			JLabel dayLabel = new JLabel(list.get(i).getDayType());
			JLabel hourLabel = new JLabel(list.get(i).getHourType());
			JLabel minuteLabel = new JLabel(list.get(i).getMinuteType());
			JLabel secondLabel = new JLabel(list.get(i).getSecondType());
			JLabel textLabel = new JLabel(list.get(i).getTextType());
			
			showPanel.add(titleLabel);
			showPanel.add(monthLabel);
			showPanel.add(dayLabel);
			showPanel.add(hourLabel);
			showPanel.add(minuteLabel);
			showPanel.add(secondLabel);
			showPanel.add(textLabel);
			
			guiShowFrame.add(showPanel);
		}
		
		
		guiShowFrame.setSize(500, 400);
		guiShowFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			guiMunuFrame.setVisible(false);
			guiAddSchedule();
		}
		else if (e.getSource() == edit) {
			guiMunuFrame.setVisible(false);
			//guiEditSchedule();
		}
		else if (e.getSource() == del) {
			
		}
		else if (e.getSource() == show) {
			guiMunuFrame.setVisible(false);
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
			System.out.println(schedule);
			guiAddFrame.setVisible(false);
			guiMunuFrame.setVisible(true);
		}
		else if (e.getSource() == back) {
			System.out.println("저장하지 않음");
			guiAddFrame.setVisible(false);
			guiMunuFrame.setVisible(true);
		}
	}
}