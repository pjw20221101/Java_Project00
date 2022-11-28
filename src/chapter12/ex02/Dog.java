package chapter12.ex02;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");

	}

	@Override
	public void run() {
		System.out.println("개는 달립니다. ");

	}

}
