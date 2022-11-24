package chapter10.ex05;

class Aa {
	static int m = 3; 
}
class Bb extends Aa {
	static int m = 4; 
}

public class Override_Static_Field {

	public static void main(String[] args) {
		// 정적 필드 (static field) : 오버라이딩 되지 않는다. 별도의 공간에 값이 존재함
		      // 메모리의 클래스영역에 값이 존재함 
		
		//1. 객체 생성 없이 클래스 이름으로 출력 
		System.out.println(Aa.m);   //3
		System.out.println(Bb.m);	//4
		System.out.println("===============");
		
		//2. 객체화 해서 정적 필드 내용을 출력
		 Aa aa = new Aa(); 
		 Bb bb = new Bb(); 
		 Aa ab = new Bb(); 
		 
		 System.out.println(aa.m);   //3
		 System.out.println(bb.m);   //4
		 System.out.println(ab.m);   //3 
		

	}

}
