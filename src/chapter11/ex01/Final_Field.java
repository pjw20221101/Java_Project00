package chapter11.ex01;

class A {     //선언과 동시에 값을 할당. 
	
	int a = 3; 			//필드 : 값을 수정 할 수 있다. 
	final int b = 5;    //상수 : 값을 수정 할 수 없다. 
	
	A() {}
}

class B {	//선언, 값할당을 분리 
	int a; 
	final int b; 
	
	B() {
		a = 3; 
		b = 5; 
	}	
}

class C {
	int a = 3; 
	final int b = 5;    //상수 
	C() {
		a = 7; 
	//	b = 10;   //오류 발생 
	}
}





public class Final_Field {

	public static void main(String[] args) {
		// final modifier : 
		     // 1. 필드 : 값을 수정하지 못하도록 [상수]
			//  2. 메소드 : 자식 클래스에서 오버라이딩을 불가 
			//  3. 클래스 : 상속이 불가 한 클래스 
		
		A a1 = new A(); 
		
		//a : 필드 [변수] : 값을 수정 할 수 있다. 
		//b : 상수 : 값을 수정 할 수 없다. 
		a1.a = 5; 
//		a1.b = 6;  
		
		B b1 = new B();
		b1.a = 10; 
//		b1.b = 20;   //상수 : 값 수정 불가함
		
		
		
		
		
		
		
		

	}

}
