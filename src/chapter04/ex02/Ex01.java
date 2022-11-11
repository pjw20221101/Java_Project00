package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제1> switch 문을 사용하여 프로그램 하세요. 
		//        p.janagwoo@gmail.com   Ex01.java   , <<완료시간 : 5:00분>>   
		//    스캐너로 정수 1 를 인풋 받으면 "금매달입니다"출력 
		//			     2 를 인풋 받으면 "은매달입니다"출력
		//	     		3 를 인풋 받으면 "동매달입니다"출력
		//				그외 값을 인풋 받으면 "메달이 없습니다"출력 
		
		Scanner sc = new Scanner(System.in); 
		
		int medal ; 
		System.out.println("1 2 3 중 하나의 숫자를 입력 하세요 >>>");
		medal = sc.nextInt(); 
		
		switch ( medal ) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default : 
			System.out.println("메달이 없습니다. ");
			break;
			
		}
		
		System.out.println("===================");
		
		// <문제2> switch 문을 사용하여 프로그램 하세요. 
		//        p.janagwoo@gmail.com    , <<완료시간 : 5:00분>>   
		//    스캐너로 문자열 gold 를 인풋 받으면 "금매달입니다"출력 
		//			      silver 를 인풋 받으면 "은매달입니다"출력
		//	     		  bronze 를 인풋 받으면 "동매달입니다"출력
		//				  그외 값을 인풋 받으면 "메달이 없습니다"출력 
		
		
		String medal2 ; 
		
		System.out.println("gold silver bronze 중하나의 문자열을 입력하세요>>>");
		medal2 = sc.next(); 
		
		switch ( medal2 ) {
		case "gold": case "Gold": case "GOLD":
			System.out.println("금메달 입니다.");
			break;
		case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default : 
			System.out.println("메달이 없습니다. ");
			
		}
		
		sc.close();
	}

}
