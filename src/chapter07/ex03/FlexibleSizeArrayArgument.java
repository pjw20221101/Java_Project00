package chapter07.ex03;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// 가변길이 배열 매개변수 처리  , Argument 로 전송되는 배열의 길이가 다이믹 하게 가변적으로 변화됨 
		
		method1 (1,2); 
		method1 (3,4,5,6,7,8,9);
		method1 (11,12,13,14,15,16,17);
		method1 (); 
		
		System.out.println("====================");
		
		method2 ("안녕"); 
		method2 ("안녕", "반갑", "습니다"); 
		method2 ( "안녕", "땡큐", "베리", "감사", "합니다."); 
		

	}
	
	//가변 길이 배열 메소드 선언 : 정수를 인풋 받는 가변 길이 배열 
	public static void method1 (int...values) {
		System.out.println(Arrays.toString(values));
	}
	
	//가변 길이 배열 메소드 선언 : 정수를 인풋 받는 가변 길이 배열 
	public static void method2 (String...values) {
		for (int i = 0 ; i < values.length; i++) {
			System.out.print( values[i] + " ");
		}
		System.out.println();
	}
	
	
	

}
