package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고, 
				//각각 예외에 대해서 catch 블락 
				//3개의 예외를 한꺼번에 처리 

	// 완료시간 : 2: 40까지 , p.jangwoo@gmail.com 	
		
	System.out.println("===1. 모든 예외를 하나의 try 블락에 넣고 예외를 각각 다르게 처리함.==========================");	

		try {
			System.out.println( 3 / 0 );   //실행 예외 : ArithmeticException		
			int[] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);    //실행 예외 : ArrayIndexOutOfBoundsException
			
			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException
		}catch (ArithmeticException e ) {
			System.out.println("0 으로 나누면 처리가 불가능함. ");
			
		}catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열의 방번호를 넘겼습니다. ");
		}catch (NumberFormatException e ) {
			System.out.println("숫자로 변경이 불가능 합니다. ");
		}
		
		System.out.println("====2단계 모든 exception 을 한꺼번에 처리 ==========================");
		
		try {
			System.out.println( 3 / 0 );   //실행 예외 : ArithmeticException	
			
			int[] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);    //실행 예외 : ArrayIndexOutOfBoundsException
			
			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(" 모든 예외를 하나의 블락에서 처리 ");
			
			System.out.println(e.getMessage());   //예외의 간단한 정보를 출력 
			e.printStackTrace();                  //예외의 세부적인 정보를 출력 
		}
		
		System.out.println("==3. 각각의 try 블락에서 처리==========================");
		
		try {
			System.out.println( 3 / 0 );   //실행 예외 : ArithmeticException
		}catch (ArithmeticException e) {
			System.out.println(" 3. 0으로 나눌 수 없습니다. ");
		}
		
		try {
			int[] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);    //실행 예외 : ArrayIndexOutOfBoundsException
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("3. 배열의 방을 넘겼습니다. ");
		}
		
		try {
			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException
		}catch (NumberFormatException e) {
			System.out.println("3. 숫자를 변경 할 수 없습니다. ");
		}
		
		
				
	System.out.println("프로그램 종료 ");	

	}

}
