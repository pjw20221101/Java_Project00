package chapter10.ex03;

class A {		//부모 클래스 ( super class ) 
	
	void print () {		//인스턴스 메소드 : 메소드 오버라이딩이 가능하다. 
		System.out.println("A 클래스의 print()");
	}
}
class B extends A {  //자식 클래스 ( child class ) 
	
	@Override     //@ : 어노테이션, @Override : 부모의 메소드를 재정의시 오류를 방지하는 어노테이션 
	void print() {
		System.out.println("B 클래스의 print()");
	}
}


public class Method_Overriding01 {

	public static void main(String[] args) {
		/*
		 	Method Overloading : 동일한 이름의 메소드를 시그니쳐에 따라서 다르게 식별 (메소드, 생성자) 
		 			시그니쳐 : 인풋 매개변수의 갯수, 타입 
		 	Method Overriding  : 부모 클래스의 매소드를 자식 클래스에서 재정의 해서 사용하는것 
		 	   <인스턴스 메소드> 
		 */
		
		//1. A 타입 / A 생성자 호출 
		A aa = new A(); 
		aa.print();					//A 클래스의 print() 
		
		//2. B 타입 / B 생성자 호출 
		B bb = new B(); 
		bb.print();					//B 클래스의 print() 
		
		//3. A 타입 / B 생성자 호출 
		A ab = new B(); 
		ab.print();					//B 클래스의 print() 
				 

	}

}
