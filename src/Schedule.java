import javax.swing.JFrame;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class Schedule {
	//Gui 클래스에서 사용할 변수 모음
	protected Gui schedule;
	protected JFrame guiMenuFrame, guiAddFrame, guiShowFrame, guiEditFrame1, guiEditFrame2, guiDeleteFrame1, guiDeleteFrame2;
	
	protected JButton add, edit1, del, show, exit; //guiMenuFrame에서 사용하는 버튼
	protected JButton save, back1; //guiAddFrame에서 사용하는 버튼
	protected JButton back2; //guiShowFrame에서 사용하는 버튼
	protected JButton editButton, back3; //guiEditFrame1에서 사용하는 버튼
	protected JButton edit2, back4; //guiEditFrame2에서 사용하는 버튼
	protected JButton delButton, back5; //guiDeleteFrame1에서 사용하는 버튼
	protected JButton OKButton, NOButton; //guiDeleteFrame2에서 사용하는 버튼
	
	protected JTextField titleField, monthField, dayField, hourField, minuteField, secondField, editTitleField, deleteTitleField; //스케줄의 정보를 타이핑할 수 있는 텍스트필드
	protected JTextArea textArea;
	
	protected String titleType, monthType, dayType, hourType, minuteType, secondType, textType; //스케줄의 정보를 담기 위한 변수
	protected int i; //ArrayList list변수의 배열 순서를 담기 위한 변수
	
	//Gui 클래스에서 사용할 메서드 모음
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