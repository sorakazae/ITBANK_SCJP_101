package day7;
class Car {
	String color;
	int door;
	void drive(){   // �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	void stop(){    // ���ߴ� ���
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {  // �ҹ���
	void water(){   //���� �Ѹ��� ���
		System.out.println("water!!!");
	}
	void stop(){    // ���ߴ� ���
		System.out.println("FireEngine stop!!!");
	}
}
public class CastingTest {

	public static void main(String[] args) {
		Car car = null;   // null ������ ���ͷ�  // ������ ����� ���� ����
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe;
		car.stop();     // �������̵� �Ȱ��� �켱
		car.drive();
		//car.water();
		fe2 = (FireEngine)car; // FireEngine ��������ȯ  ���־���� down casting 
		fe2.water();

	}

}
