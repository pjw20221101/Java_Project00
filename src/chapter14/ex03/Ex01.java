package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고, 
				//각각 예외에 대해서 catch 블락 
				//3개의 예외를 한꺼번에 처리 

	// 완료시간 : 2: 40까지 , p.jangwoo@gmail.com 	
		
		System.out.println( 3/ 0 );
		
		int[] arr = new int[] {1,2,3} ; 
		System.out.println(arr[5]);
		
		int num = Integer.parseInt("20A"); 
		
		
		

	}

}
