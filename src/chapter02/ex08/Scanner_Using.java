package chapter02.ex08;

//2. Scanner 객체를 import  (ctrl + shift + o ) 
import java.util.Scanner;

public class Scanner_Using {

	public static void main(String[] args) {
		// Scanner 사용법 : 이클립스에서 콘솔로 값을 인풋 받을 수가 있다. 
		//	--콘솔로 값을 받아서 변수에 저장하고 값을 출력 할 수 있다. 
		
		//1. 스케너 선언 
		//객체   객체변수 = 객체 생성 
		Scanner sc = new Scanner(System.in); 
		
		//3. 사용할 변수 선언 : 스캐너(콘솔)로 인풋 받아서 저장할 변수 선언 
		String name ;    //이름 저장하는 변수 // sc.next();     <== 문자열
		int kor;		 //국어 점수 		  // sc.nextInt();  <== 정수 
		int eng; 		//영어 점수 
		int math; 		//수학 점수 
		int music; 		//음악점수 
		int sience; 	// 과학 점수 
		
		System.out.println("이름을 입력 하세요 >>>");
		name = sc.next();								//문자열을 받도록
		System.out.println("국어점수를 입력 하세요>>>");
		kor = sc.nextInt(); 							//정수를 인풋 받도록 
		System.out.println("영어점수를 입력 하세요>>>");
		eng = sc.nextInt(); 
		System.out.println("수학점수를 입력 하세요>>>");
		math = sc.nextInt(); 
		System.out.println("음악점수를 입력 하세요>>>");
		music = sc.nextInt(); 
		System.out.println("과학점수를 입력 하세요>>>");
		sience = sc.nextInt();
		
		int sum ; 		//합계 
			sum = kor + eng + math + music + sience; 
		double avg; 	//평군
			avg = sum / 5.0; 
		
	System.out.println("=========================================");
		System.out.println("당신의 이름은 " + name + "이고");
		System.out.println("점수의 합계는 " + sum + "이고");
		System.out.println("평균은 " + avg + "입니다. ");
		
		
		
		
		
		
		

	}

}
