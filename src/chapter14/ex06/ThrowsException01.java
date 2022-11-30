package chapter14.ex06;

//예외 처리 : 
	//1. 직접 처리 (try ~ catch)
	//2. 예외 전자 (throws ): 예외를  내가 처리 하지 않고 호출하는 곳으로 미루는것 
		//호출 하는 곳에서 예외를 처리해야 한다. 

//1. 하위 메소드에서 직접 예외를 처리하는 방법 
class A {
	
	void abc() {
		bcd();       //bcd(); 메소드 호출됨 
	}
	void bcd() {     //bcd 메소드 내부에서 예외 처리가됨      
		try {     //쓰레드를 1초뒤에 잠재워라, 일반예외 - 1. 직접 처리
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  	
	}
}

//2. 예외를 호출하는 메소드로 전가 : throws 
class B {
	void abc() {
		
		try {
			bcd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	void bcd() throws InterruptedException  {  
		     //bcd() 메소드를 호출하는 곳에서 예외를 처리하도록 미룬다. 
		Thread.sleep(1000);   //일반예외 
	}
}






public class ThrowsException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
