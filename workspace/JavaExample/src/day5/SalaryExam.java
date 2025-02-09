package day5;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		bonus = 0;
		
	}
	SalaryExpr(int b){
		bonus = b;
		
	}
	public int getSalary(int grade){
		
		int result = 0;
		switch(grade){
		case 1:
			result = bonus+100;
			break;
		case 2:
			result = bonus+90;
			break;
		case 3:
			result = bonus+80;
			break;
		case 4:
			result = bonus+70;
			break;
		}
		return result;
		
		
		
	}
}



public class SalaryExam {
	
	

	
	public static void main(String[] args) {
		int bonusmonth = Integer.parseInt(args[0]);
		int grade = Integer.parseInt(args[1]);
		
		int result = 0;
		
		switch (bonusmonth%2){
		case 0 :
			SalaryExpr bonusday = new SalaryExpr(100);
			result=bonusday.getSalary(grade);
			break;
		case 1 :
			SalaryExpr day = new SalaryExpr();
			result=day.getSalary(grade);
			break;
		}
		
		System.out.print(bonusmonth+"월"+grade+"등급의 월급은"+result+"입니다.");
	}
}

	



