package chapter11.ex02;

class Studnet {
	//필드 
	String nanme; 
	
	//합계와 평균을 출력 하는 메소드
	void sum_avg () {	
	}
}

class Student_Sub extends Studnet{
	//자식의 필드 
	int kor ;    //국어 점수
	int eng ; 	 //영어 점수
	int math;    //수학 점수 
	
	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor , eng, math 의 합계와 평균을 출력 하는 메소드 
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력 
		// <<14: 30분까지 완료 >>, p.jangwoo@gmail 
		
		//생성자를 사용해서 객체 생성시 필드의 값을 할당하고 
		/* 
		홍길동 70 88 77   
		이순신 80 68 87       
		김똘똘 60 86 87      
		홍길순 77 56 80    
		강감찬 55 66 77 
		*/ 
		
		// Student 배열변수 arr 변수에 모든 객체를 저장해서 
		
		//배열의 값을 for 문으로 출력 할때  
			//오버라이딩된 메소드 출력  < 그 학생의 국어,영어 수학 의 합계, 평균>
		    // 5명의 학생의 국어에 대한 합계, 평균
			// 5명의 학생의 영어에 대한 합계, 평균
		    // 5명의 학생의 수학에 대한 합계, 평균	
	}

}
