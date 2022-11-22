package chapter09.ex02;

import chapter09.ex01.A;

//외부 클래스, 상속 관계가 설정된 클래스 
public class A_test3 extends A {

	int k = a;  // a : public 
	int l = b;  // b : protected 
//	int m = c;  // c : default   //외부 패키지에서 접근 불가
//	int n = d;  // d : private   //외부 패키지에서 접근 불가 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_test3 a1 = new A_test3(); 
		System.out.println(a1.a);  //public
		System.out.println(a1.b);  //protected
//		System.out.println(a1.c);  //default
//		System.out.println(a1.d);  //private
		
		a1.abc();	//public
		a1.bcd(); 	//protected
//		a1.cde(); 	//default
//		a1.def(); 	//private
		
		
		
	}

}
