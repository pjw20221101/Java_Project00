package chapter14.ex07;

//1. 사용자 정의 일반 예외 (checked Exception) 
class MyException extends Exception {          //Exception 하위 클래스 : 일반예외 
	//사용자 정의 예외는 Exception 클래스를 상속 해서 만들어야 한다. 
	// 2 개의 생성자 정의 
	public MyException() {     //기본 생성자 
		super();      			//Exception 객체의 기본 생성자 호출 
	}
	public MyException(String message) {
		super(message); 
	}
}

//2. 사용자 정의 실행 예외 ( Unchecked Exception, RunTime Exception) 
	//RuntimeException 을 상속 해서 실행예외를 만듬 

class MyRTException extends RuntimeException{
	
	public MyRTException () {  //기본 생성자 
		super(); 
	}
	
	public MyRTException (String message) {
		super(message);
	}
}

//사용자 정의 예외를 테스트 하는 클래스 
class A {
	//1. 사용자 정의 예외 객체 생성 
	MyException me1 = new MyException() ;
	MyException me2 = new MyException("예외 메세지 : MyException"); 
	
	MyRTException mre1 = new MyRTException(); 
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException"); 
	
	//2. 예외 던지기 ( throw ) : 던진 시점에서 예외발생 
			// throws : 예외를 전가. 
			// throw  : 예외를 발생시킴. 
	// 예외를 내가 직접 처리 : try ~ catch 
	
	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			}else {
				//throw me1; 	 //예외를 강제로 발생시킴 <== 
				throw me2; 
			}
		} catch (MyException e) {
			System.out.println(" 사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage());  //Exception 클래스의 메소드 
		}
	}
	void bcd_1() {
		abc_1(65);    
	}
	
	//2. 예외 전가 
	void abc_2 (int num) throws MyException  {
		if ( num > 70) {
			System.out.println("정상작동");
		} else {
			//throw me1;      // 예외를 강제로 발생 시킴 
			throw me2;       
		}
	}
	void bcd_2() {
		
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("사용자 정의 예외 2 발생됨 ");
			System.out.println(e.getMessage());    
			//e.printStackTrace();
		}
		
	}
}



public class CreateUserException {

	public static void main(String[] args) {
		// 사용자 정의 Exception : 자신이 직접 생성한 예외. 예) 점수가 70이하이면 예외 발생 시켜라.
			// Exception 을 상속해서 자신의 예외를 생성할 수 있다. 

		//객체 생성후 사용자 정의 예외가 잘 처리되는지 확인 
		A a = new A(); 
		a.bcd_1();
		System.out.println("===========");
		a.bcd_2();
		
		
	}

}
