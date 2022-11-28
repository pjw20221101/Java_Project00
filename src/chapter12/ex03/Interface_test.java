package chapter12.ex03;

interface A {}
interface B {}

//1. 단일 인터페이스 상속 
class C implements A { }
class E implements B {}

//2. 다중 인터페이스 상속 
class D implements A, B {} 


//3. 클래스와 인터페이스를 한번에 상속 { extends, implements 의 순서 변경 불가
    // 자바는 하나의 부모 클래스만 가진다. 인터페이스는 다중 상속이 가능 

class F extends C implements A, B {}  


public class Interface_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
