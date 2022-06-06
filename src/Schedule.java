import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class Schedule {
	protected JFrame guiMenuFrame, guiAddFrame, guiShowFrame, guiEditFrame1, guiEditFrame2, guiDeleteFrame1, guiDeleteFrame2;
	protected String titleType, monthType, dayType, hourType, minuteType, secondType, textType;
	protected JButton add, edit1, edit2, del, show, exit, save, back1, back2, back3, back4, back5, editButton, delButton, OKButton, NOButton;
	protected Gui schedule;
	protected JTextField titleField, monthField, dayField, hourField, minuteField, secondField, editTitleField, deleteTitleField;
	protected JTextArea textArea;
	protected int i;

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