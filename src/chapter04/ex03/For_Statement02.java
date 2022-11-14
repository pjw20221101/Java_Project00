package chapter04.ex03;

public class For_Statement02 {

	public static void main(String[] args) {
		// FOR 문의 특수한 형태 (무한 루프) 
		//   --- for 문에서 조건이 생략될 경우 무한 루프 
		//   -- 초기식, 조건 , 증감식이 모두 빠진 경우도 무한루프 
		
		/*
		for (int i =0 ; ; i++) {			//조건이 생략되면 무한루프  <메모리가 풀 : 서버가 다운>
			System.out.println(i + " ");
		}
		 */ 
		
		/*
		for (;;) {
			System.out.println("무한루프");
		}
		*/ 
		
		System.out.println("==============");
		//무한 루프 탈출 : break; 
		for ( int i = 0 ;  ; i++) {
			System.out.println(i + " ");
			
			if ( i  > 100 ) {		
				break; 				//break; 는 if 조건과 같이 사용한다. 
			}
		}
		
		
		
		
		
		

	}

}
