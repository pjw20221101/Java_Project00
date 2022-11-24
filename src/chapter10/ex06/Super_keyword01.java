package chapter10.ex06;

class A {
	int a ; 
	
	//상속 관계에서 부모클래스의 생성자가 존재 할 경우 기본 생성자를 반드시 명시
    A() {}
	//부모 클래스의 생성자가 존재함. 
	A ( int a ) {
		this.a = a; 
	}
}

class B extends A {   
	//자식 클래스의 생성자에는 기본적으로 super()가 기본적을 생략 되어 있고, 
	//자식 클래스는 생성자 첫 라인에 , super(): 생략됨 , this() , 
	
	//B () {super(); }

}


public class Super_keyword01 {

	public static void main(String[] args) {
		/*
		     this keyword  : 자신의 객체의 필드와 메소드 
		     this ()       : 생성자의 첫라인에 위치 , 자신의 객체에서 다른 생성자를 호출할때 사용
		     
		     super keyword : 부모 객체의 필드와 메소드
		     super ()    : 자식 생성자의 첫라인에서 부모 객체의 생성자를 호출 사용
		     	//모든 자식 클래스의 생성자는 반드시 첫라인에 this(), super() 가 와야 한다. 
		     	//자식 클래스의 생성자는 기본적으로 super() 가 생략 되어 있다. 
		     	//자식 클래스는 기본적으로 부모의 기본생성자를 호출 
		 
		 */

	}

}
