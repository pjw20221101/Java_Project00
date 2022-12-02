package chapter16.ex08;
//제너릭 메소드의 타입 제한 

class A {
	//Number : Boolean, Charter 를 제외한 정수, 실수를 처리하는 
		//Byte, Short, Integer, Long, Float, Double 
	
	public <T extends Number> void method1 (T t) {
		//Object 클래스의 메소드외의 Number의 메소드를 사용가능함.
		System.out.println(t.intValue());    //intValue() : Number 의 메소드 
	}
}

//인터페이스 
interface MyInterface {
	void print();    //public abstract 
}


class B {
	
	//T : MyInterface 하위의 구현클래스가 올 수 있다. , 주의 : 타입을 제한할때는 extends 를 사용. 
	public <T extends MyInterface> void method1 (T t) {
		t.print();
	}
}


public class BoundedtypeOfGenericMethod {

	public static void main(String[] args) {
		// 
		A a = new A();
		a.<Double>method1(10.11); 
		a.method1(5.8);   //Double
		a.<Integer>method1(100); 
		a.method1(200);
		
	//	a.<String> method1("안녕"); 
		
		B b = new B(); 
		b.<MyInterface> method1 (new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현됨 ");				
			}
			
		}); 
		
		
		//인풋되는 타입을 생략 
		b.method1 (new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현됨 2 ");				
			}
			
		});
		

	}

}
