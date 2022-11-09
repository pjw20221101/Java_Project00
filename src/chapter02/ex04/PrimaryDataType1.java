package chapter02.ex04;

public class PrimaryDataType1 {

	public static void main(String[] args) {
		//자료형 : 변수명 앞에 반드시 선언, 변수에 어떤 값을 넣을지 지정 (Java, c, c++)
		//  - 기본 자료형 : boolean, byte, short, int, long, float, double, char 
		//  - 참조 자료형 : String , 배열, 객체 ... 무한대로 생성가능 
		
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴 
		
		// 1. boolean  : true, false 
		boolean bool1 = true; 	//선언과 동시에 변수에 값을 할당
		boolean bool2; 			//선언후 
		bool2 = false ;			//값 할당 
		System.out.println(bool1);     //true
		System.out.println(bool2);     //false
		
		System.out.println("====================");
		//2. 정수 (byte : 1byte, short : 2byte, int : 4byte, long:8byte)
			//정수의 기본은 int 
		   //byte :(1byte= 8bit) : -2^7 ~ 2^7-1    : -128 ~ 127  
		byte value1 = -128;
		byte value2 = 127;
		
		System.out.println(value1);
		System.out.println(value2);
		
			//short : (2byte = 16bit ) : -2^15 ~ 2^15-1 :  -32,768 ~ 32,767
		
		short value3 = -32768;
		short value4 = 32767; 
		
		System.out.println(value3);
		System.out.println(value4);
		
			//int : (4byte = 32bit) : -2^31 ~ 2^31-1 : 
					//-2,147,483,648 ~ 2,147,483,647
		
		int value5 = -2147483648; 
		int value6 = 2147483647;
		
		System.out.println(value5);
		System.out.println(value6);
		
			//long : 8byte = 64bit : -2^63 ~ 2^63-1 
				//long 의 변수에 값을 할당 할때는 l, L 을 붙여 줘야 한다. 
				//    붙여주지 않으면 기본적으로 int 형으로 값이 저장됨 
		
		long value7 = -100L;  
		System.out.println(value7);
				
		//3. 실수 (float : 정밀도 7자리(4byte) , double: 정밀도 15자리(8byte) 
		    //실수의 기본은 double 
		
			//float : float 으로 지정된 변수의 값을 할당 할때 리터럴에 f, F 명시를 해야 한다. 
		float value8 = 1.123456789F;
		System.out.println(value8);    //1.1234568
		
		double value9 = 1.12345678910111213; 
		System.out.println(value9);
		
			
		//4. 문자 (char) : 영문/한글/일본어/.... 한 글자 
		//      변수의 값을 할당할 리터럴에 ' ' 
		char value10 = 'A';
		char value11 = 'a'; 
		char value12 = '가';
		char value13 = '3';
		char value14 = '#'; 
		
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		
		
		
		//5. 문자열 (String) : 여러 글자를 담을 수 있다. 
		//      변수의 값을 할당하는 리터럴에 " "

	}

}
