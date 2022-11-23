package chapter10.ex01;
                        //완료시간 12: 20분 까지 완료, p.jangwoo@gmail.com 
class Animal {			//Animal클래스를 상속 해서 Tiger, Eagle, Lion 를 생성 
							// 자식 클래스에서는 필드1, 메소드1 정의 
						 //LionChild클래스는 Lion 클래스를 상속 해서 필드1, 메소드 1. 
	String name; 
	int age; 
	String color; 
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal {
	String tigerSound; 
	void tigerRun() {
		System.out.println("호랑이는 껑충껑충 달립니다. ");
	}
}
class Eagle extends Animal {
	String eagleSound; 
	void eagleFly () {
		System.out.println("독수리는 날라 다닙니다. ");
	}
	
}
class Lion extends Animal {
	String lionSound; 
	void lionRun () {
		System.out.println("사자는 껑충 달립니다. ");
	}
}
class LionChild extends Lion {
	String lionChildSound ; 
	void lionChildRun () {
		System.out.println("새끼 사자는 엉금엉금 달립니다. ");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		//1. Tiger 객체 생성 
		Tiger t1 = new Tiger(); 
		
		//2. Eagle 객체 생성 
		Eagle e1 = new Eagle(); 
		
		//3. Lion 객체 생성 
		Lion l1 = new Lion (); 
		
		//4. LionChild 객체 생성 
		LionChild lc = new LionChild (); 
		
		System.out.println("======================");

		
		
		

	}

}
