package chapter07;

class Method{
	
	//필드는 생략 
	//생성자 생략
	
	//1. 리턴타입 : void + 매개변수:없는 메소드 
	void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴타입 : int + 매개변수: 없는 메소드 
		// 메소드를 호출시 돌려 주는 값 
	int data() {
		int a ; 
		a = 3; 
	    return a; 
	}
	
	//3. 리턴 타입 : double + 매개변수가 2개인 메소드 
	double sum (int a, double b) {
		return a + b; 
	}
	
	//4. 리턴타입 : void + 내부에 리턴 포함 ( 함수를 종료 한다는 의미 ) 
	void printMonth ( int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력입니다. ");
			return ;      // void 로 선언된 메소드 내에서 return을 사용하면 메소드를 종료 
		}
		System.out.println(m + " 월 입니다. ");
	}
		
}

public class Method_Component {

	public static void main(String[] args) {
		
		/*
		 Method (메소드 ) : 실행블락에 프로그램 기능을 저장 
		    - 호출시 작동, 
		    - 메소드 이름 앞에 리턴타입 존재해야 한다. 
		      void : 리턴타입이 존재하지 않을때. 
		      int  : 정수 값을 리턴
		      boolean : true, false 를 리턴
		      .....double, char,
		      String : 문자열을 리턴 
		      
		*/ 
		
		//1. 객체 생성 : class ==> Object (Instance) 
		Method m = new Method();  
		
		//2. 메소드 호출 : m.메소드명 
		m.print();
		
		int k = m.data();       //data()를 호출하는 순간 정수 3값이 리턴 
		System.out.println(k);
		
		double l = m.sum(50, 60.6); 
		System.out.println(l);
		
		m.printMonth(10);
		
		m.printMonth(50);
		
		
		
	}

}
