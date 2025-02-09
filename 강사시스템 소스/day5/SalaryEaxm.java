package day5;
class SalaryExpr {
	int bonus;	
	SalaryExpr() {
		this(0);
	}
	SalaryExpr(int b) {
		bonus = b;
	}
	int getSalary(int grade) {
		int result = 0;
		switch(grade) {
		case 1 : result = bonus + 100; 
		            break;
		case 2 : result = bonus + 90; 
		            break;
		case 3 : result = bonus + 80; 
		            break;
		case 4 : result = bonus + 70; 
		}		
		return result;
	}
}
public class SalaryEaxm {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int grade = Integer.parseInt(args[1]);
		SalaryExpr obj = null;
		if(month % 2 == 0) {
			obj = new SalaryExpr(100);			
		} else {
			obj = new SalaryExpr();		
		}
		System.out.println(month+"월 "+grade+"등급의 월급은 " +
                obj.getSalary(grade) +"입니다.");
	}
}
