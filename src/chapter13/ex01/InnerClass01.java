package chapter13.ex01;

/*
    이너클래스 (Inner class) : 클래스 내부의 클래스 
       1. 인스턴스 이너클래스 : static 키가 붙지 않는 내부 클래스
        	//외부 클래스의 객체를 먼저 생성후에 사용이 가능 
       2. 정적(static) 이너클래스 : static 키가 붙어있는 내부 클래스 
       3. 지역 이너클래스 : 메소드 내부에 선언된 이너클래스 
       
     이너클래스 특징 : 1. Outer Class의 접근제어자의 제한 없이 모두 접근이 가능 (필드, 메소드)
     	2. 다른 객체를 생성하지 않고, 내부에 객체를 만들어서 빠르게 사용 하기 위해서 . 
     	     클래스의 필드와 메소드는 객체화 해야 사용이 가능하다. 
       
 */

class A {   //Outer class : 필드, 메소드에 접근 제어가가 붙어 있고, 
				//Inner class를 생성하면 Outer class의 접근 제어자상관 없이 접근 
	
	public int a = 3; 		//다른 패키지에서 접근가능, 같은 패키지에서도 접근 가능
	protected int b = 4;    //다른 패키지에서 접근가능(상속), 같은 패키지 에서도 접근가능
	int c = 5; 				// default , 다른 패키지에서는 접근 불가능, 같은패키지에서만 접근가능
	private int d = 6;      // 다른패키지, 같은패지지에서도 접근불가능, 같은 클래스에서만 접근 
	
	void abc () {
		System.out.println("A 클래스의 메소드 abc() 입니다. ");
	}
	
	//이너 클래스 : 인스턴스 이너클래스, 1. 아웃터 클래스 의 접근제어자와 상관없이 접근, 
			//2. 기능 구현을 외부의 객체 생성 없이 내부에서 바로 처리 
	 //class B 내부에 outer class의 필드와 메소드를 활용해서 기능 구현을 함. 
	class B {
		void bcd() {
			//1. Outer Class 의 필드 접근 : 접근 제어자와 상관없이 모들 필드 접근 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//2. Outer Class의 모든 메소드 접근 가능 : 접근 제어자 상관없이 접근 
			abc(); 
		}	
	}	
}


public class InnerClass01 {

	public static void main(String[] args) {

		//1. 이너클래스를 사용하기 위해서는 Outer 클래스의 객체를 먼저 생성해야 한다.  
		A a = new A();    //Outer Class의 객체 생성 
		
		//2. 내부 클래스의 객체 생성 
		A.B b = a.new B();    //A.B : 외부클래스.내부클래스  : A.B : 내부 클래스의 타입.
							  //b : 참조 변수 
							  //a.new B();    <== 외부인스턴스명.new 내부클래스생성자호출;
		b.bcd();
		
		
	}

}
