package chapter05.ex03;

import java.util.Arrays;

public class Initial_Value {

	public static void main(String[] args) {
		// 기본 자료형과 참조 자료형의 초기값 
		//   기본 자료형 : Stack 공간에 변수와 변수의 값이 저장됨
				    // 강제 초기화가 안됨. 사용시에는 초기값을 넣고 사용
		//   참조 자료형 (배열) : Stack 공간에 [배열] 변수와 Heap 영역의 주소정보가 저장 
		//                    Heap 영역에는 값이 저장 
					//강제 초기화가 됨. boolean (false), 정수 (0) , 실수 (0.0)
							//      char (공백), String ( Null ) 
		
		// 1. Stack 메모리값 ( 강제 초기화가 되지 않음 ) 
		int value1; 
		//System.out.println(value1);   //오류 발생 : 초기값이 없다. 
		int[] value2; 
		//System.out.println(value2);     // 오류 발생 : value2에  Heap 영역의 주소값이 없다. 

		int value3 = 0 ; 
		System.out.println(value3);    //0
		int[] value4 = null;       // null : 비어있는 상태, 기본자료형에는 사용 할수 없다. 
									// 참조자료형에서만 사용가능 
		System.out.println(value4);   // value4에 Heap 영역의 주소가 비어 있는 상태 : null
		
		System.out.println("======boolean : 초기값 : false======================");
		
		// 2. Heap 영역은 강제 초기화가 된다.  boolean (false), 정수 (0) , 실수 (0.0)
		// 2-1. 기본자료형 배열 
		
		boolean[] arr1 = new boolean[3] ; // 기본값으로 false가 각 방에 할당됨 
		for ( int i = 0 ; i < arr1.length; i++) {
			System.out.print( arr1[i] + " ");
		}   // 각 방에 초기값이 들어 있다. 
		System.out.println();
		System.out.println("=======정수형 : 초기값으로 0 ===================");
		int [] arr2 = new int[5]; 
		for ( int i = 0 ; i < arr2.length; i ++) {
			System.out.print( arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println(" =====실수형 : 초기값으로 0.0 ======");
		double[] arr3 = new double[3]; 
		for ( int i = 0 ; i < arr3.length; i++) {
			System.out.print( arr3[i] + " ");
		}
		System.out.println();
		System.out.println(" =====문자 : 초기값으로  <<출력 안됨>> <<공백>> ======");
		char [] arr4 = new char[3]; 
		for ( int i =0; i < arr4.length; i++ ) {
			System.out.print( arr4[i] + " ");
		}
		System.out.println();
		System.out.println("==== 문자열 : 초기값으로 null =============");
		String[] arr5 = new String[3]; 
		for ( int i = 0 ; i < arr5.length ; i++) {
			System.out.print( arr5[i] + " ");
		}
		System.out.println();
		System.out.println("==== Arrays.toString() 로 출력 =====");
		
		System.out.println(Arrays.toString(arr1));	// boolean
		System.out.println(Arrays.toString(arr2));  // int 
		System.out.println(Arrays.toString(arr3));  // double
		System.out.println(Arrays.toString(arr4));	// char
		System.out.println(Arrays.toString(arr5));  // String
		
		
		
		
		
		
	}

}
