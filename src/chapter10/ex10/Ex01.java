package chapter10.ex10;

import java.util.Objects;

class C {
	
	//완료시간 : 11시 20분 , p.jangwoo@gmail.com
	
	String stuID ;  
	String name; 
	int age; 
	
	//c1.equals(c2)  //stuID 필드를 재정의 해서, stuID가 같으면 true, 아니면 false 
	C () {}

	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((C)obj).stuID ) {
			return true; 
		}else {
			return false; 
		}
			
	}

	//생성자 , 기본생성자1, 생성자2
	
	//toSting 메소드 재정의 : 필드의 값을 출력 , 객체 
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		C c1 = new C("1234", "홍길동", 30); 
		C c2 = new C("1234", "임꺽정", 40); 
		C c3 = new C("4567", "세종대왕", 60); 
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}
