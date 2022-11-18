package chapter07;

class Car{
	
	String company; 
	String car_Name; 
	String color; 
	int year; 
	int maxSpeed; 
	
	//생성자오버로딩 : 시그니쳐에 따라서 다른 생성자를 호출 
	
	//기본 생성자 
	Car ( ) {}
	
	//생성자 : 매개변수가 3개인 생성자 
	Car(String company, String car_name, String color) {
		this.company = company; 
		this.car_Name = car_name; 
		this.color = color; 
	}
	
	Car(String company, String car_name, String color, int year, int maxSpeed) {
		this.company = company; 
		this.car_Name = car_name; 
		this.color = color; 
		this.year = year; 
		this.maxSpeed = maxSpeed; 
		
	}
	
	void print () {
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + car_Name);
		System.out.println("차색깔 : " + color);
		System.out.println("연식 : " + year);
		System.out.println("최대 스피드 : " + maxSpeed);
	}
	
	
	
}

public class Constructor01 {

	public static void main(String[] args) {

		//1. 기본 생성자로 객체 생성 
		Car car1 = new Car ();   //기본 생성자 호출 
		car1.print();
		
		System.out.println();
		
		//2. 매개변수 3개인 생성자 호출 
		Car car2 = new Car("현대자동차","그랜져","검은색");
		car2.print();
		
		System.out.println("======================");
		//3. 매개변수 5개인 생성자 호출 
		Car car3 = new Car ("기아자동차", "K9", "붉은색", 2022, 300); 
		car3.print();   //필드의 저장된 값을 출력
		
		System.out.println("=================");
		//
		Car car4 = new Car ("삼성자동차", "SM5", "갈색", 2020, 200); 
		car4.print();

	}

}
