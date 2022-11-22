package chapter09.ex01;

public class A_test {

	public static void main(String[] args) {
		// A 클래스와 동일한 패키지 내에서 존재하는 클래스 
		A a1 = new A(); 
		System.out.println(a1.a);    //public : 동일한 패키지 내에서 접근이 가능함. 
		System.out.println(a1.b);    //protected : 동일한 패키지 내에서 접근이 가능함. 
		System.out.println(a1.c);    //default : 동일한 패키지에서 접근이 가능 
//		System.out.println(a1.d);    //private : 동일한 패키지에 다른 파일에서 접근이 불가, 
									      //같은 파일에서만 수정일 가능함. 
		a1.abc();     //public
		a1.bcd();     //protected
		a1.cde();     //default
		//a1.def();     //private 접근 불가 
		

	}

}
