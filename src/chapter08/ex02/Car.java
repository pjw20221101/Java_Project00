package chapter08.ex02;

public class Car {   //public : 클래스 이름, 필드명, 생성자명, 메소드명 앞, <== 다른 패키지에서 접근
	//필드 
	public String carName; 
	public String carColor; 
	public int maxSpeed; 
	
	//생성자 
	public Car() {}
	public Car(String carName, String carColor, int maxSpeed){
		this.carName = carName; 
		this.carColor =  carColor; 
		this.maxSpeed = maxSpeed; 
	}
	
	public void print () { 
		System.out.println("자동차명 : " + carName);
		System.out.println("자동차색 : " + carColor);
		System.out.println("자동차 최대스피드 : " + maxSpeed);
	}

}
