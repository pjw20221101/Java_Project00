package chapter07;

class Student {
	
	//6시 30 분까지 완료.  <p.jangwoo@gmail.com> 
	
	//필드선언 
	String stuName;     //학생이름 
	int stuNum ;        //학번을 저장 
	String stuAddr ;    //학생의 주소 
	String stuPhone;    //학생의 전화번호 
	double weight ;     //학생의 몸무게 
	
	// 생성자 오버로딩 , 
	//    기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자 
	
	//기본생성자
	Student() {}
	
	//매개변수 3개인 생성자 
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName = stuName; 
		this.stuNum = stuNum; 
		this.stuAddr = stuAddr; 	
	}
	
	//매개변수 5개인 생성자 
	Student(String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName; 
		this.stuNum = stuNum; 
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone; 
		this.weight = weight; 
	}
	
	//필드의 값을 출력 하는 메소드 void print () { 필드의 값을 출력 } 
	
	void print () {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학번 : " + stuNum);
		System.out.println("학생 주소 : " + stuAddr);
		System.out.println("학생 전화번호 : " + stuPhone);
		System.out.println("학생의 몸무게 ; " + weight);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// 기본 생성자 호출 
		Student stu1 = new Student(); 
		stu1.print();
		
		System.out.println("============================");
		// 매개변수 3개인 생성자 호출
		Student stu2 = new Student("홍길동", 1111, "서울 성북구"); 
		stu2.print();
		System.out.println("===============================");
		//매개변수 5개인 생성자 호출 
		Student stu3 = new Student ("홍길순" , 2222, "서울 강남구", "010-1111-1111", 73.5); 
		stu3.print();
		
		System.out.println("===============================");
		//매개변수 5개인 생성자 또 호출 
		Student stu4 = new Student ("김똘똘" , 3333, "서울 금천구", "010-1111-2222", 70.3); 
		stu3.print();
		
		
		
	}

}
