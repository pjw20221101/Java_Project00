package chapter12.ex01;

// 완료 시간 : 11시 40분까지 완료 , p.jangwoo@gmail.com

abstract class Calc {   //사칙 연산을 계산 하는 계산기 클래스 
	abstract int add (int a, int b);   // 더하기 연산 
	abstract int diff (int a, int b);   // 뺄샘
	abstract int mul (int a, int b);   //곱하기 
	abstract double div (int a, int b );   // 나누기 	
}

class Calc_Impl extends Calc {      //Calc 를 구현한 클래스 
	@Override
	int add(int a, int b) {
		return a + b;
	}
	@Override
		int diff(int a, int b) {
			return a - b;
		}
	@Override
		int mul(int a, int b) {
			return a * b;
		}
	@Override
		double div(int a, int b) {
			return (double)a / (double)b;
		}
}

public class Ex01 {

	public static void main(String[] args) {

		int a = 5; 
		int b = 4; 
		
		
		//1. 구현클래스의 메소드 호출후 출력 
		Calc c1 = new Calc_Impl(); 
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.mul(a, b));
		System.out.println(c1.div(a, b));
		
		
		System.out.println("===익명 클래스를 사용해서 출력==========================");
		
		//2. 익명 클래스로 메소드 호출후 출력 
		Calc c2 = new Calc () {
			@Override
			int add(int a, int b) {
				return a + b;
			}
			@Override
				int diff(int a, int b) {
					return a - b;
				}
			@Override
				int mul(int a, int b) {
					return a * b;
				}
			@Override
				double div(int a, int b) {
					return (double)a / (double)b;
				}
		};
		
		System.out.println(c2.add(a, b));
		System.out.println(c2.diff(a, b));
		System.out.println(c2.mul(a, b));
		System.out.println(c2.div(a, b));
		
		

	}

}
