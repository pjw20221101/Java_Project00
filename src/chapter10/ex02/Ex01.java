package chapter10.ex02;

class Human {
	String name; 
	int age; 
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human{
	String stuID ; 
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다. ");
	}
}
class Student2 extends Student{
	String stu2ID; 
	void sut2Eat() {
		System.out.println("학생2는 음식을맛나게 먹습니다. ");
	}
}


public class Ex01 {
    
	public static void main(String[] args) {
		// 3시 45분까지 : 
		
		// 업캐스팅 실습 
		//1. Studnet 객체를 생성하면서 Human 타입으로 지정   : h1
		//2. Student 객체를 생성하면서 Studnet 타입으로 지정  : s1
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		//4. Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		//5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3 
		
		//다운캐스팅 실습 


	}

}
