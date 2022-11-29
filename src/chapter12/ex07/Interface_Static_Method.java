package chapter12.ex07;

interface A {
	//static 메소드 : public 생략됨, 객체 생성없이 바로 호출해서 사용. 
		//구현 코드가 있는 메소드 
	static void abc() {
		System.out.println("인터페이스의 static 메소드 ");
	}
}

public class Interface_Static_Method {

	public static void main(String[] args) {
		// interface 블락에서 구현된 메소드 : default, static 
		//    메소드 이름앞에 static 메소드 : 인터페이스 이름으로 바로 호출 가능 
		
		// Interface : 모든 필드와 메소드에 public 이 모두 생략되어있다. 
			//1. 필드 : public static final 
			//2. 메소드 : 
				//1. 추상 메소드 : public abstract 생략됨 , 선언만 된 메소드 , 
				//2. default 메소드 : [public] default 메소드 , 구현부가 있는 메소드 
						//모든 자식 클래스에 상속되는 메소드, 1.8 버젼부터 지원
				//4. static 메소드 : [public] static 메소드 , 구현부가 있는 메소드 
						// 1.8 버젼 부터 지원, 객체체 생성없이 인터페이스 이름으로 호출 
		
		//객체 생성없이 인터페이스이름으로 바로 호출해서 사용 가능
		A.abc();
		
	}

}
