package chapter12.ex01;

//완료 시간 : 12시 00분까지 완료 , p.jangwoo@gmail.com

abstract class Calc2 {   //사칙 연산을 계산 하는 계산기 클래스 
	abstract void add (int a, int b);   // 더하기 연산 
	abstract void diff (int a, int b);   // 뺄샘
	abstract void mul (int a, int b);   //곱하기 
	abstract void div (int a, int b );   // 나누기 	
}
class Calc_Impl2 extends Calc2 {
	@Override
	void add(int a, int b) {
		System.out.println(a + b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a - b);
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a * b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a / (double) b);
	}
}
	
public class Ex02 {

	public static void main(String[] args) {
		int a = 5; 
		int b = 4; 
		
		//1. 구현클래스의 메소드 호출후 출력 
		Calc2 c2 = new Calc_Impl2(); 
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
		

		
		System.out.println("==== 익명 클래스로 출력 ====");
		//2. 익명 클래스로 메소드 호출후 출력 
		Calc2 c3 = new Calc2() {
			@Override
			void add(int a, int b) {
				System.out.println(a + b);
			}
			@Override
			void diff(int a, int b) {
				System.out.println(a - b);
			}
			@Override
			void mul(int a, int b) {
				System.out.println(a * b);
			}
			@Override
			void div(int a, int b) {
				System.out.println((double)a / (double) b);
			}
		};
		
		c3.add(a, b);
		c3.diff(a, b);
		c3.mul(a, b);
		c3.div(a, b);

	}

}
