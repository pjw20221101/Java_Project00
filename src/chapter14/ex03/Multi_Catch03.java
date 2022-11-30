package chapter14.ex03;

public class Multi_Catch03 {

	public static void main(String[] args) {
		// Exception : 모든 예외의 부모 클래스 , try 블락의 모든 예외를 처리 
			// 각 예외에 대한 세부적인 제어가 불가능,

		/*
		 * 
		try {
			System.out.println( 3 / 0 );   //실행 예외 : ArithmeticException	
			
			int[] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);    //실행 예외 : ArrayIndexOutOfBoundsException
			
			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException

		}catch (Exception e) {
			//모든 예외를 Exception 에서 받아서 처리
			
			
		}catch (ArithmeticException e) {
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
		}catch (NumberFormatException e) {
			
		}
		
		*/
		
		
		try {
			System.out.println( 3 / 0 );   //실행 예외 : ArithmeticException	
			
			int[] arr = new int[] {1,2,3} ; 
			System.out.println(arr[5]);    //실행 예외 : ArrayIndexOutOfBoundsException
			
			int num = Integer.parseInt("20A");  //실행 예외 : NumberFormatException

		}catch (ArithmeticException e) {
			//1. try 블락의 예외에 대한 세부 처리 
			
		}catch (ArrayIndexOutOfBoundsException e) {
			//1. try 블락의 예외에 대한 세부 처리 
			
		}catch (NumberFormatException e) {
			//1. try 블락의 예외에 대한 세부 처리 
			
		}catch (Exception e) {   //<== <<< 세부적인 예외 처리후 마지막에 위치 >>>
			// 그외의 모든 예외를 Exception 에서 받아서 처리
			
			
		}
	}

}
