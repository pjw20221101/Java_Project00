package chapter04.ex03;

public class Ex01 {

	public static void main(String[] args) {
		//<문제>  :  For 문을 사용해서 1단 출력    p.jangwoo@gmail.com
		
		//			1 * 1 = 1
		//          1 * 2 = 2
		//			....
		//		    1 * 9 = 9 
		// 1 단 출력 
		System.out.println("1 단 출력 ");
		for (int i =1 , j=1 ; j < 10 ; j++) {
			System.out.println(i + " * " + j + " = " + i*j);
		}
		System.out.println("2 단 출력 ");
		for (int i =2 , j=1 ; j < 10 ; j++) {
			System.out.println(i + " * " + j + " = " + i*j);
		}
		
		
		
	}

}
