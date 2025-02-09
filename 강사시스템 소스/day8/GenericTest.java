package day8;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i <= list.size(); i++) {
			String s = (String)list.get(i);		
			System.out.println(s);
		}
		
		System.out.println();		
		
		for(Object value : list) {
			String s = (String)value;		
			System.out.println(s);
		}
		
		System.out.println();
		
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
	}
}
