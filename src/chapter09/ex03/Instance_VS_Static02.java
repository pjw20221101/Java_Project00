package chapter09.ex03;

class C {
	int a = 10; 			//인스턴스 필드 : 객체화 해서 사용 가능, 다른 객체와는 공유되지 않는값
								//메모리의 Heap 공간에 변수와 값을 저장 
	static int b = 20; 		//정적 필드 : 객체화 하지 않고 사용 가능, 
									//모든 객체에서 공유되는 변수 
								//메모리의 클래스 영역에 변수의 값을 저장 , Heap 영역에는 
								// 클래스 영역의 저장된 주소 값만 가진다. 
	
	void print1() {
		System.out.println(a + " " + b);
	}
	static void print2 () {    // 정적 메소드에는 인스턴스 필드가 올 수 없다. a : 인스턴스 필드
							   // 정적 메소드에서는 정적 필드만 올 수 있다. 
		System.out.println( b);
	}
}

public class Instance_VS_Static02 {

	public static void main(String[] args) {
		//1. 객체 생성 
		C c1 = new C (); 
		//객체 필드의 값 수정 
		c1.a = 100;				//인스턴스 필드 : 자신의 객체에만 적용. 
		c1.b = 777; 			//정적 필드 : 다른 객체와 공유 되는 공간 
		
		System.out.println(c1.a);   //100
		System.out.println(c1.b);   //777 
		
		System.out.println("=======================");
		C c2 = new C (); 
		System.out.println(c2.a);  //10
		System.out.println(c2.b);  //777
		
		System.out.println("====================");
		C c3 = new C(); 
		
		
		
		c1.a = 888; 
		c2.a = 999;     // a; 그 객체에만 적용되는 고유한 값 
		c3.a = 777; 
		c1.b = 111;
		C.b = 333;     // 모든 객체에서 공유되는 블락 
		
		System.out.println("=========");
		System.out.println(c1.a);   //인스턴스 필드 : 다른 객체와 분리된 고유공간
		System.out.println(c2.a);   //인스턴스 필드 : 
		System.out.println(c3.a);   
		System.out.println(c1.b);	//정적 필드 : 모든 인스턴스(객체)에서 공유되는 공간 
		System.out.println(c2.b);
		System.out.println(c3.b);
		
		
		
		
		

	}

}
