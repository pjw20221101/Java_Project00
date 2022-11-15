package chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
		 자료형 : 변수를 선언시 변수에 할당할 값을 정의 
		    - 기본 자료형 : boolean , byte, short, int, long, float, double, char
		    	- 메모리의 Stack 공간에 변수와 값이 저장됨 
		    - 참조 자료형 : 배열, 열거, 클래스/인터페이스 
		    	- 메모리의 Stack 공간에 변수명과 참조주소 (Heap 영역의 주소)
		    	-   변수의 들어갈 값은 Heap 영역에 저장됨
		변수 - 변수에는 하나의 값만 저장됨. 
			- 초기값을 할당후 변수를 사용. 
		배열 - 하나의 배열 변수에 많은 값을 저장 할 수 있다. 
		    - 배열의 특징 :1. 배열변수의 동일한 자료형의 값만 저장 할 수 있다. (int, long, double ) 
		    		    2. 배열은 방의 갯수가 정의 되면 수정이 불가능 
		    - 배열의 초기값을 할당 하지 않더라도 강제로 초기 값이 할당됨. 
		    - Heap 공간에는 값이 반드시 할당되어야 된다. 
		    	boolean (false), 정수[byte, short, int, long] (0), 실수 [float, double] (0.0)
		    
		 */
		
		System.out.println("=========변수 =====================");
		//1. 변수 - 선언과 동시에 값 할당 
		int a = 10 ; 
		
		//2. 변수 - 선언 이후 값할당 
		int b;			//선언
		b = 20; 		//값 할당 
		
		// 변수를 선언후 초기 값을 할당 하지 않고 사용하면 오류 발생 
		int c ; 
		int d ; 
		//int sum = c + d; 		//오류 발생 : c, d 변수에 초기 값을 넣지 않고 사용했으므로 오류 
		
		System.out.println("=========배열 : 1. 선언 방법 1========================");
		
		// 1. 배열 선언 1방법 
		int[] array1 = new int[3]; 		//배열을 선언과 동시에 방의 크기를 지정 
		//int[] : 정수 값만 배열에 저장 가능 
		//array1 : 배열 변수 , array1변수 명은 Stack 공간에 저장이되고, array1 에 Heap 영역의 주소 값이 저장
		//new : Heap 영역에 값을 저장하라. 
		//int[3] : Heap 영역에 저장할 방의 갯수를 지정 
		//			index : 방의 번호 , 0 , 1, 2, ......
		
			// 배열에 값 할당. 
			array1[0] = 55;     // array1 의 Heap 영역의 주소 0 번 째 방에 55을 넣어라
			array1[1] = 66; 
			array1[2] = 77; 
			// 배열의 값 출력 
			System.out.println(" 0 번째 방의 값 : " + array1[0]);
			System.out.println(" 1 번째 방의 값 : " + array1[1]);
			System.out.println(" 2 번째 방의 값 : " + array1[2]);
			
		int[] array2 ; 			//배열 변수 선언
		array2 = new int[5]; 	//배열 변수의 들어갈 방의 갯수 지정, index : 0 ~ 4  
		  //array2 배열 변수에 값을 넣고 출력 . 
		
		
		System.out.println("=========배열 : 1. 선언 방법 2========================");
	
		// 배열 선언 과 방 크기 할당
		int array3[] = new int[4]; 		// index : 0,1,2,3
		
		//배열 방에 값 넣기 
		array3[0] = 10; 
		array3[1] = 20; 
		array3[2] = 30; 
		array3[3] = 40; 
		//array3[4] = 50; 	//오류 : 예외 발생 
								// - 컴파일 시 오류     : 이클립스에서 자동으로 오류를 출력해줌  
								// - 실행시 오류 가 발생 : 예외 처리 
		
		//배열의 값을 출력 하기 
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		//System.out.println(array3[4]);   오류 발생 : 실행시 오류 발생 
		
		//선언과 방번호를 분리해서 정의 
		int array4[]; 
		array4 = new int[5]; 
		
		
		System.out.println("=========배열 : 1. 선언 방법 3========================");
		
		// 배열 선언과 동시에 값 할당 		
		int [] array5 = new int[] { 10,20,30,40,50 };
		//int [] array6 = new int[5] { 10,20,30,40,50 };  
			// 오류 발생 : 선언과 동시에 배열 변수에 값을 할당 할때 방크기를 지정하면 오류 발생 
		
		array5[3] = 77; 
		
		System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[3]);
		System.out.println(array5[4]);
		
		
		// 배열을 선언 후 값 할당. 
		int[] array7 ; 
		array7 = new int[] { 100, 200, 300, 400, 500, 600}; 
		
		System.out.println(array7[0]);
		System.out.println(array7[1]);
		System.out.println(array7[2]);
		System.out.println(array7[3]);
		System.out.println(array7[4]);
		System.out.println(array7[5]);
//		System.out.println(array7[6]);  //오류 발생 
			//ArrayIndexOutOfBoundsException  : 배열의 방의 크기를 넘어가면 발생되는 오류 
		
		System.out.println("=========배열 : 1. 선언 방법 4========================");
	
		//배열 선언과 동시에 값 할당 : 선언과 값할당 분리시 오류 발생 
		int[] array8 = {11,22,33,44,55}; 
		
		System.out.println(array8[0]);
		System.out.println(array8[1]);
		System.out.println(array8[2]);
		System.out.println(array8[3]);
		System.out.println(array8[4]);
		
		// 선언과 값을 분리시 오류 발생 
		int [] array9; 
	//	array9 =  {111,222,333,444,5555};    //  오류 발생 
		

	}

}
