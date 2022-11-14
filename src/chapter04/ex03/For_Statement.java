package chapter04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// For 문 : 조건이 true 동안 실행블락을 반복 해서 처리, 조건이 false 이면 For 문을 빠져나온다. 
		/*
		   for (초기값;조건;증감식) {
		   		실행블락 ;      			//조건이 true일동안 반복, 조건이 false 이면 빠져나온다.
		   	}		   	
		 */
		
		// 1. For 문의 기본 구조 ( pritln )
		int a; 								//변수를 블락밖애서 선언 : 전역변수 
		for (a=0; a < 3 ; a ++) {
			System.out.println(a);
		}				//0 , 1, 2
		
		System.out.println("===================");
		
		for (int b = 0 ; b < 100; b+=2) {   	//변수  b : 지역변수 : for 블락내에서만 사용됨 
			System.out.print( b + " ");
		}
		
		System.out.println("====================");
		
		//int a;     전역 변수 이므로 위에서 선언 했으므로 다시 선언 불가능 
		for (  a = 0; a < 20 ; a += 3) {
			System.out.print( a + " ");
		}
		System.out.println();
		System.out.println("========================");
		for (int b =0 ; b < 20; b += 4) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println("======================");
		
		// 초기값 100 부터 1 빼면서 조건  i > 0 
		for (int i = 100 ; i > 0 ; i-- ) {
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("=====================");
		
		for (int i = 1000 ; i > 0 ; i -= 3 ) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("=======================");
		
		
		// 여러개의 변수를 초기식 및 증감식에서 처리 가능 
		// 
		for ( int i = 0 ,  j =0 ; i < 100 ; i++, j++ ) {
			System.out.println( i + " , " + j);
		}
		
		System.out.println("=========For 문을 사용해서 1단 출력==================");
		
		//<문제>  :  For 문을 사용해서 1단 출력    p.jangwoo@gmail.com
		
		//			1 * 1 = 1
		//          1 * 2 = 2
		//			....
		//		    1 * 9 = 9 
		
		
		
		
		
		
		

	}

}
