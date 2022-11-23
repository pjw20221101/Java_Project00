package chapter10.ex02;

//클래스의 상속 관계에서 업캐스팅 및 다운 캐스팅 
class A{} 
class B extends A{}
class C extends B{}
class D extends B{}

public class Type_Casting02 {

	public static void main(String[] args) {
		//1. 업캐스팅 (자동으로 변환 ) : 생략시 컴퍼일러가 자동으로 추가 , 자식 클래스 객체 생성 ==> 타입을 부모
		// ac : A, B, C 를 모두 내포 하고 있고 A 타입으로 정의  <<A 접근>>
		A ac = (A) new C(); 
			System.out.println( ac instanceof A);
			System.out.println( ac instanceof B);
			System.out.println( ac instanceof C);
			System.out.println( ac instanceof D); //false
		System.out.println("==============");
		//bc : A, B, C 를 모두 내포하고 있고 B 타입으로 정의, <<A, B 접근>> 
		B bc = new C(); 
		System.out.println( bc instanceof A);
		System.out.println( bc instanceof B);
		System.out.println( bc instanceof C);
		System.out.println( bc instanceof D); //false
		
		//bc는 B 타입으로 정의  A 타입으로 업캐스팅 
		A a = bc;    
		
		//2. 다운 캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생 
		//aa는 A 만 내포하고 있다. 
		A aa = new A(); 
			System.out.println(aa instanceof A );   //true
			System.out.println(aa instanceof B );
			System.out.println(aa instanceof C );
			System.out.println(aa instanceof D );
		
		if ( aa instanceof B) {
			B ba = (B) aa ;      //오류가 없다, 실행시 오류 발생 
		} else {
			System.out.println(" aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가 합니다. ");
		}
		
		if ( aa instanceof C) {
			C ca = (C) aa ;      //오류가 없다, 실행시 오류 발생 
		} else {
			System.out.println(" aa는 C를 내포하고 있지 않아서 다운캐스팅이 불가 합니다. ");
		}
		System.out.println("==========================");
		// bd : A, B, D 를 내포 하고 있고 B 타입으로 지정 <<A, B>>
		B bd = new D(); 
			System.out.println( bd instanceof A );
			System.out.println( bd instanceof B );
			System.out.println( bd instanceof C );  //false
			System.out.println( bd instanceof D );
		
	}

}
