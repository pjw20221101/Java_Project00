package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한 루프를 돌립니다.     <완료시간 : 1: 50분까지 완료> 
		//        if or switch 
		// p.jangwoo@gmail.com
		//   스케너에서 1 을 넣으면 "1. 평균 출력" 으로 출력 
		//   스케너에서 2 을 넣으면 "2. 합계 출력" 으로 출력
		//   스케너에서 3 을 넣으면 "3. 이름 출력" 으로 출력
		//   4번을 넣으면 do while 문을 빠져나옴 "프로그램 종료" 
		//     1 ~ 4 이 외의 번호를 넣으면 " 잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요" 
		
		Scanner sc = new Scanner (System.in); 
		int a ; 
		
		do {
			System.out.println("====================================================");
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3.이름 출력 | 4. 프그램 종료");
			System.out.println("====================================================");
			System.out.println(" 위 번호를 선택하세요 >>> ");
			a =sc.nextInt(); 
			
			if (a == 1) {
				System.out.println(" 1. 평균 출력 ");
			}else if ( a==2 ) {
				System.out.println(" 2. 합계 출력 ");
			}else if ( a==3 ) {
				System.out.println(" 3. 이름 출력 ");
			}else if ( a==4 ) {
				System.out.println(" 4. 프로그램 종료 ");
				break; 
			}else {
				System.out.println("잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요");
			}
		
		}while ( true ); 
		
		System.out.println("do whie 문을 빠져 나왔습니다. ");

	}

}
