package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성해서 ArrayList 에 저장후 객체를 출력시 필드의 값을 출력 하도록함. 
// for , Enhanced For , 컬렉션 객체 자체를 출력
//완료시간 : 6시 20분까지 , p.jangwoo@gmail.com

class Car{
	String company; 
	String carModel; 
	String color; 
	int maxSpeed;
	
	public Car(String company, String carModel, String color, int maxSpeed) {
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	} 
		
}

public class Ex01 {

	public static void main(String[] args) {
		// ArrayList 생성 
		ArrayList<Car> a1 = new ArrayList();
		
		//객체 생성및 ArrayList 에 저장
		a1.add(new Car("현대자동차","그랜져", "검은색", 200)); 
		a1.add(new Car("기아자동차","K9", "흰색", 300));
		a1.add(new Car("삼성자동차","SM5", "회색", 250));
		
		//for 문을 사용하여 객체 출력 
		for (int i = 0 ; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("========================");
		//Enhanced For 문을 사용하여 출력
		for (Car k : a1) {
			System.out.println(k);
		}
		System.out.println("==========================");
		//컬렉션 자체를 출력 
		System.out.println(a1);
		
	}

}
