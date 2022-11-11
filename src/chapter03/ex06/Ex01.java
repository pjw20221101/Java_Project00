package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	//<문제 Ex01> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수값이 홀수 이면 "홀수" 라고 출력 하고 
		//인풋 받은 값이 짝수이면 "짝수" 라고 출력
		//<<삼항 연산자를 사용>>
		// 11시 45분까지 완료 . <<  p.jangwoo@gmail.com   Ex01.java, Ex02.java    >>
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("정수 하나를 입력해 주세요>>>>");
		int a; 
		a = sc.nextInt(); 
		
		System.out.println((a%2==0) ? "짝수": "홀수");
		
		System.out.println("=======================================");

	// <문제 2 Ex02 > 스케너로 3,6,9의 배수이면 "3,6,9의 배수입니다" 
		//그렇지 않으면 "3,6,9 의 배수가 아닙니다" 를 출력
		int b; 
		System.out.println("다음 정수를 입력해 주세요>>>");
		b = sc.nextInt(); 
		
		System.out.println((b%3==0 ||b%6==0 || b%9==0 ) ? "3,6,9의 배수입니다": "3,6,9 의 배수가 아닙니다");
		
		
		
		
	}

}
