package day7;
interface Drawable {  // interface명은 관래적으로 ~able을 붙인다.
	void draw();  // public abstract 는 컴파일러가 자동으로 넣어준다. 생략가능
}
class Rect implements Drawable {
	public void draw(){
		System.out.println("사각형을 그립니다.");
	}
}
class Circle implements Drawable {
	public void draw(){
		System.out.println("원을 그립니다.");
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
		System.out.println("전달된 객체의 클래스명 : " + d.getClass().getName());
		d.draw();
	}

}


