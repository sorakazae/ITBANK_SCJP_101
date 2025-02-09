package day7;
class Car {
	String color;
	int door;
	void drive(){   // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop(){    // 멈추는 기능
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {  // 소방차
	void water(){   //물을 뿌리는 기능
		System.out.println("water!!!");
	}
	void stop(){    // 멈추는 기능
		System.out.println("FireEngine stop!!!");
	}
}
public class CastingTest {

	public static void main(String[] args) {
		Car car = null;   // null 참조형 리터럴  // 참조할 대상이 아직 없음
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe;
		car.stop();     // 오버라이딩 된것이 우선
		car.drive();
		//car.water();
		fe2 = (FireEngine)car; // FireEngine 강제형변환  꼭있어야함 down casting 
		fe2.water();

	}

}
