package day8;
import java.util.*;
public class CalInfo {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 1 일요일 7토요일
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
	}
}
