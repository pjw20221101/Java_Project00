package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		// 
		// <문제>  : 2중 For 문을 사용해서 1단 ~ 9단 출력 print \t 
		//   1단 
		//   1 * 1 = 1     1 * 2 = 2    1 * 3 = 3 ......    1 * 9 = 9   
        //   2단 
		//   2 * 1 = 1     2 * 2 = 4    2 * 3 = 6 ......    2 * 9 = 9
		//   .... 
		//   9단 
		//   9 * 1 = 9     9 * 2 = 18    9 * 3 = 27 ......    9 * 9 = 81
		
		// print ()    /t : 탭으로 구분 
		System.out.println("==========print() ===============");
		for ( int i = 1; i < 10 ; i++) {
			//단을 출력 하는 변수 : i 
			System.out.println(i + " 단 출력");
			for ( int j = 1 ; j < 10 ; j++) {
				System.out.print( i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();	
			System.out.print("\n");
		}
		
		//printf() 를 사용해서 출력 부분을 간결하게 처리 
		System.out.println("=======printf()======================");
		
		for ( int i = 1; i < 10 ; i++) {
			//단을 출력 하는 변수 : i 
			System.out.println(i + " 단 출력");
			for ( int j = 1 ; j < 10 ; j++) {
				System.out.printf( "%d * %d = %d \t" , i, j , i*j);
			}
			System.out.println();	
			System.out.print("\n");
		}
		
	}

}
