package chapter12.ex06.a;

//자식 클래스에서 인터페이스의 메소드 호출 : 
    // default, static 메소드 호출 <=== 인터페이스 내에서 기능이 구현된 메소드 

interface A {     //인터페이스 : 추상 메소드만 존재해야함 ( 예외: default, static 메소드)
	default void abc1() {
		System.out.println("A 인터페이스의 default 메소드");
	}
}
interface B {
	default void abc2() {
		System.out.println("B 인터페이스의 default 메소드");
	}
}
class C {    // 일반 클래스 : 추상메소드 + 일반메소드 + 일반 필드 
	C () {}
	void cde() {
		System.out.println("일반 클래스의 일반 메소드 ");
	}
}

//Class D는 C 클래스를 상속하고 있고 A, B 인터페이스를 구현 하고 있다. 
    //extends : 하나의 부모만 올 수 있다.  : 클래스 : 하나의 부모만 가능 (다중상속이 불가능)
    //implements : 여러 부모를 가질 수 있다. 인터페이스 : 다중 상속이 가능
class D extends C implements A, B {
	//A 인터페이스와 B 인터페이스의 메소드 이름이 동일 
	 
	//부모의 메소드 호출 
	    //super : 클래스의  부모 메소드 호출 
		//A.super: 인터페이스의 부모의 메소드호출
	void hij () {
		super.cde();    //C 클래스의 cde() 메소드 호출 
	}
	void lmn() {
		A.super.abc1();	  //인터페이스의 메소드 호출 
		B.super.abc2();
	}
	
}




public class Interface_Super_Use02 {

	public static void main(String[] args) {

		//객체 생성 후 확인 
		D d1 = new D(); 
		
		d1.hij();      //클래스의 메소드 호출
		
		d1.lmn(); 	   //인터페이스의 메소드 호출 
		
	}

}
