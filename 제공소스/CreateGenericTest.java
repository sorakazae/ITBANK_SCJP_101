package day8;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o1.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<String>();
		o3.put("abc");
		String s3 = o3.get(); 
		System.out.println(s3);
	}
}
class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// Value3<Date> o = new Value3<Date>();
class Value3<T> {
	T obj;
	void put(T obj){
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}



