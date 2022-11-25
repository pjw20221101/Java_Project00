package chapter11.ex03;

abstract class Animal {   //클래스 내부에 추상 메소드가 1개라도 존재하면, 추상 클래스가 되어야 한다. 
	
	int a ; 
	int b ; 
	
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
	  //추상 메소드 : 실행블락이 존재하지 않는 메소드
		//반드시 자식 클래스에서 오버라이딩해서 구현부를 만들어야 한다. 
		// 프로잭트 설계시 메소이름을 다른 이름으로 사용하지 못하도록 할수 있다.
		// 부모 클래스에서는 메소드 이름을 선언만 해주고, 자식 클래스에서 구현하도록 함. 
		// 자식 클래스에서는 메소드 이름을 변경 할 수 없다. 
	abstract void run ()  ;   //구현부가 없는 선언만된 메소드 : 추상메소드 
	
}

class Cat extends Animal {  //콘크리트 클래스, 부모의 추상 메소드를 모두 구현한 클래스 
	//부모 클래스에서 추상 메소드가 존재할 경우 자식에서는 추상메소드를 오버라이딩해서 구현해야 한다. 
	//부모의 클래스의 추상 메소드를 구현하지 않는 경우는 자신도 추상 클래스가 되어야 한다. 
	
	@Override
	void run() {
		System.out.println("고양이가 달립니다. ");		
	}
	
}

class Dog extends Animal {
    @Override
    	void run() {
    		System.out.println("개도 달립니다. ");   		
    	}	
}

public class Abstract_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
