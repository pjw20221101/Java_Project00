package chapter14.ex06;

//6시 30분까지 완료, p.jangwoo@gmail.com

//1. 예외 발생할때 각 메소드 내부에서 예외를 직접 처리함. 
class Aa {
	void abc() {   //bcd() 메소드 호출 
		//bcd() 메소드 호출 
		bcd();
	}
	void bcd() {   //메소드 블락에서 직접 예외 처리
		try {
			System.out.println( 3/0 );
			int [] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);
			Thread.sleep(1000); 
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		System.out.println("A 객체의 bcd 메소드의 예외가 문제없이 잘 처리되었습니다. ");
	}
}
//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb {
	void abc() {
		//bcd() 메소드 호출 : <예외 처리>  
		
		try {
			bcd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B 클래스의 abc() 잘 호출 되었습니다. ");
		
	}
	void bcd() throws Exception {    //예외를 미루는것 : throws
		System.out.println( 3/0 );
		int [] arr = new int[] {1,2,3} ; 
		System.out.println(arr[5]);
		Thread.sleep(1000); 
		System.out.println("B 객체의 bcd() 메소드의 예외가 전가 되었습니다. ");
		
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성후 호출 
		
		Aa a = new Aa(); 
			a.abc();
			
		System.out.println("=======================================");
		
		Bb b = new Bb(); 
			b.abc();

	}

}
