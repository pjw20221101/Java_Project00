package chapter10.ex06;

class Aa {
	void abc() {
		System.out.println(" Aa 클래스의 abc() ");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab()");
	}
}

class Bb extends Aa { 
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc()");
	}
	void bcd() {
		abc();      // this.abc()  //자신의 클래스의 abc()
	}
	void cde () {
		super.abc();      // 부모 클래스의 abc() 
	}
	void def() {
		super.ab();       //부모의 클래스의 ab() 
	}
	
}

public class Super_Keyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 객체 생성 
		//bb : Aa, Bb 가 내포 되어 있고, 타입을 Bb 타입으로 지정 
		Bb bb = new Bb(); 
		
		//2. 메소드 호출 
		bb.bcd();     //Bb 클래스의 abc()
		bb.cde();	  // Aa 클래스의 abc() 
		bb.def();     // Aa 클래스의 ab()
		
	}

}
