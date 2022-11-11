package chapter03.ex05;

public class AssignmentOperator {

	public static void main(String[] args) {
		// 대입 연산자  ( +=, -=, *=, /= )
		
		//1. 대입연산자 축약 표현 
		int value1 = 3; 
		value1 = value1 + 3; 		//value1 += 3 
		System.out.println(value1 );   //6 
		System.out.println("====================");
		
		//2. 축약 표현 
		int value2 = 2; 
		System.out.println(value2 += 2);  //4    //value2 = value2 + 2 
		System.out.println(value2 -= 2);  //2    //value2 = value2 - 2
		System.out.println(value2 *= 2);  //4    //value2 = value2 * 2 
		System.out.println(value2 /= 2);  //2	//value2 = value2 / 2
		
		
		

	}

}
