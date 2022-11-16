package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>  : < 완료시간 5: 30분까지 >,     p.jangwoo@gmail.com  
		/*
		     2차원 배열 변수 :  arr1
		     arr1[0]     <== 2의 배수만 저장 
		     arr1[1]     <== 5의 배수만 저장 
		     arr1[2]     <== 3의 배수와 8배수를 저장 
		     arr1[3]     <== 1부터 시작 해서 1씩 증가하는데 7의 배수는 저장하지 않도록 저장 
		     
		     행의 갯수 : 4
		     열의 갯수 : 100 
	
		     1. for 문으로 출력, 2. Enhanced For, 3. Arrays.toString()
		     
		 */
		
		int[][] arr1 = new int[4][100]; 
		
		for (int i = 0 ; i < arr1.length; i++) {
			if (i ==0) {		// 2의 배수만 저장
				for (int j = 0 , a = 1; j < arr1[i].length; a ++) {
					if (a % 2 == 0) {
						arr1[i][j] = a; 
						j++; 
					}
				}
			}else if (i == 1) {  // 5의 배수만 저장
				for (int j = 0 , a = 1; j < arr1[i].length; a ++) {
					if (a % 5 == 0) {
						arr1[i][j] = a; 
						j++; 
					}
				}
			}else if (i == 2) { // 3의 배수와 8의 배수만 저장
				for (int j = 0 , a = 1; j < arr1[i].length; a ++) {
					if (a % 3 == 0 || a % 8 == 0 ) {
						arr1[i][j] = a; 
						j++; 
					}
				}
			}else if ( i == 3) { // 1부터 시작 해서 1씩 증가하는데 7의 배수는 저장하지 않도록 저장
				for (int j = 0 , a = 1; j < arr1[i].length; a ++) {
					if (a % 7 == 0 ) {
						continue ; 
					}
					arr1[i][j] = a; 
					j++; 
				}
			}

		}
		
		
		
		
		System.out.println("====for 문을 사용해서 내용 출력 =====");
			for (int i = 0 ; i < arr1.length; i++) {
				for (int j = 0 ; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
		System.out.println("====Enhanced for 문을 사용해서 내용 출력 =====");
		for ( int[] a : arr1) {
			for (int b : a) {
				System.out.print( b + " ");
			}
			System.out.println();
		}
		
		System.out.println("====Arrays.toString()를 사용해서 내용 출력 =====");
		for ( int[] a : arr1) {
			System.out.println(Arrays.toString(a));
		}
	}

}
