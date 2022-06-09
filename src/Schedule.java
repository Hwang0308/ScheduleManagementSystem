import javax.swing.JFrame;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class Schedule {
	//Gui Ŭ�������� ����� ���� ����
	protected Gui schedule;
	protected JFrame guiMenuFrame, guiAddFrame, guiShowFrame, guiEditFrame1, guiEditFrame2, guiDeleteFrame1, guiDeleteFrame2;
	
	protected JButton add, edit1, del, show, exit; //guiMenuFrame���� ����ϴ� ��ư
	protected JButton save, back1; //guiAddFrame���� ����ϴ� ��ư
	protected JButton back2; //guiShowFrame���� ����ϴ� ��ư
	protected JButton editButton, back3; //guiEditFrame1���� ����ϴ� ��ư
	protected JButton edit2, back4; //guiEditFrame2���� ����ϴ� ��ư
	protected JButton delButton, back5; //guiDeleteFrame1���� ����ϴ� ��ư
	protected JButton OKButton, NOButton; //guiDeleteFrame2���� ����ϴ� ��ư
	
	protected JTextField titleField, monthField, dayField, hourField, minuteField, secondField, editTitleField, deleteTitleField; //�������� ������ Ÿ������ �� �ִ� �ؽ�Ʈ�ʵ�
	protected JTextArea textArea;
	
	protected String titleType, monthType, dayType, hourType, minuteType, secondType, textType; //�������� ������ ��� ���� ����
	protected int i; //ArrayList list������ �迭 ������ ��� ���� ����
	
	//Gui Ŭ�������� ����� �޼��� ����
	public abstract String toString();
	
	public abstract void setTitleType(String titleType);
	public abstract void setMonthType(String monthType);
	public abstract void setDaytype(String dayType);
	public abstract void setHourType(String hourType);
	public abstract void setMinuteType(String minuteType);
	public abstract void setSecondType(String secondType);
	public abstract void setTextType(String textType);
	public abstract String getTitleType();
	public abstract String getMonthType();
	public abstract String getDayType();
	public abstract String getHourType();
	public abstract String getMinuteType();
	public abstract String getSecondType();
	public abstract String getTextType();
	
	public abstract void guiMenu();
	
	public abstract void guiAddSchedule();
	public abstract void guiEditSchedule1();
	public abstract int guiEditSchedule2(int i);
	public abstract void guiDeleteSchedule1();
	public abstract int guiDeleteSchedule2(int i);
	public abstract void guiShowSchedule();
	
	public abstract void toDelete(int i);
}