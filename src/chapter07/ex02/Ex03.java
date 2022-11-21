package chapter07.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 

		// 배열 a : 7의 배수를 저장하는 배열 : 1 ~ 500 까지 
		int [] a = new int[500/7]; 
		System.out.println(a.length);   // 방의 갯수 : 71 , 방번호 : 0 ~ 70 
		//a 배열 방에 각 방에 7의 배수 저장 
		for ( int i = 0, j = 7; i < a.length; i++, j+= 7) {
			a[i] = j;		//배열 a 의 각 방에 7의 배수를 저장  
		}
		
		System.out.println(Arrays.toString(a));
		
		// 배열 b : 9의 배수를 저장하는 배열 : 1 ~ 500 까지 
		int[] b = new int[500/9]; 
		//배열 b에 9의 배수 저장 
		for ( int i = 0, j = 9 ; i < b.length; i++, j+=9) {
			b[i] = j ; 
		}
		//배열 b의 내용을 출력 
		System.out.println(b.length);       //방의 갯수 : 55, 방번호 : 0 ~ 54 
		System.out.println(Arrays.toString(b));
		
		System.out.println("====54번째 방의 값출력 =====");
		System.out.println(a[54]);
		System.out.println(b[54]);
		
		
		// 두 배열의 각 방의 값을 더해서 출력 
		
		System.out.println(" == arraySum 메소드 호출 === ");
		arraySum(a,b); 
		

	}
	
	// 두 배열을 인풋 받아서 각 방의 값을 더해서 출력 하는 메소드 
	public static void arraySum(int[] a, int[] b) {
		int[] c = new int [71];       //c : 두 배열의 각 방의 값을 더해서 저장하는 배열변수 
		for ( int i = 0 ; i < a.length; i++) {   //0 ~ 70 
			for (int j = 0 ; j < b.length; j++) {  // 0 ~ 54
				if ( i > 54) {
					c[i] = a[i] + 0 ; 
				}
				
				if ( i == j ) {
					c[i] = a[i] + b[i]; 					
				}	
			}		
		}
		
		System.out.println(Arrays.toString(c));
		
	}
	
	

}
