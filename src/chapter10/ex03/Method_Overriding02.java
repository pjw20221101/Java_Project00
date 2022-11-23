package chapter10.ex03;

class Animal {
	
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다. ");
	}
}
class Tiger extends Animal {
	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥 하고 웁니다. ");
	}
}
class Eagle extends Animal{
	@Override
	void animalSound() {
		System.out.println("독수리는 끼이오 하고 웁니다. ");
	}
}
class Lion extends Animal {
	@Override
	void animalSound() {
		System.out.println("사자는 어흥흐흥 하고 웁니다. ");
	}
}


public class Method_Overriding02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성 
		Animal t1 = new Tiger();   //t1 : Animal, Tiger
		Animal t2 = new Lion(); 	//t2 : Animal, Lion
		Animal t3 = new Eagle(); 	//t3 : Animal, Eagle
		
		//메소드 오버라이딩, 오버라이딩된 메소드 출력....
		//Animal의 메소드 호출시 오버라이딩된 자식의 메소드가 출력
		t1.animalSound();   //Animal 의 animalSound 호출시 , Tiger 의 animalSound 가 출력 
		t2.animalSound();   //Animal 의 animalSound 호출시 , Lion 의 animalSound 가 출력
		t3.animalSound();	//Animal 의 animalSound 호출시 , Eagle 의 animalSound 가 출력

		System.out.println("=======================");
		
		//1. 배열에 객체를 저장 
		
		//arr1 에 Animal 객체를 저장함. 
		Animal[] arr1 = new Animal[3]; 
		
		//arr1 배열의 각방에 Animal 객체 저장 
		arr1[0] = t1; 
		arr1[1] = t2; 
		arr1[2] = t3; 
		
		//2. arr1 배열에 Animal 타입의 객체가 저장이 되어 있음.
		     //배열의 각 방의 값을 가지고 오기 
		Animal a1 = arr1[0];    
		Animal a2 = arr1[1]; 
		Animal a3 = arr1[2];
		
		//3. Animal 타입의 객체를 출력 
		System.out.println("=========");
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();
		
		
		
		
		
		
	}

}
