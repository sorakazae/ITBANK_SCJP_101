package day7;
interface Drawable {  // interface���� ���������� ~able�� ���δ�.
	void draw();  // public abstract �� �����Ϸ��� �ڵ����� �־��ش�. ��������
}
class Rect implements Drawable {
	public void draw(){
		System.out.println("�簢���� �׸��ϴ�.");
	}
}
class Circle implements Drawable {
	public void draw(){
		System.out.println("���� �׸��ϴ�.");
	}
}
public class DrawableTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*2);
		Drawable d = null;
		if(num==0)
			d=new Rect();
		else if(num==1)
			d = new Circle();
		output(d);
	}
	public static void output(Drawable d){
		System.out.println("���޵� ��ü�� Ŭ������ : " + d.getClass().getName());
		d.draw();
	}

}


