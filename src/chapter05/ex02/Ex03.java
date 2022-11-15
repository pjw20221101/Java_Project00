package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방갯 수를 인풋 받습니다. 
		// 배열 변수 : arr1 ,  2의 배수를 저장 후 출력  , enhanced for 문을 사용해서 출력
		// 배열 변수 : arr2 ,  3의 배수를 인풋 받아서 출력  , for 문을 사용해서 출력 
		//   arr1.length  : 배열의 방의 갯수를 자동으로 알아옴.  
		
		//< 완료 시간은 3시 50분까지 > , p.jangwoo@gmail.com
		
		Scanner sc = new Scanner(System.in); 
		
		int idx ;    //방의 갯수를 지정 받는 변수 
		
		System.out.println("방의 갯수를 넣어주세요>>>>");
		idx = sc.nextInt(); 
		
		int[] arr1 = new int[idx]; //2의 배수 저장
		int[] arr2 = new int[idx]; //3의 배수 저장 
		
		// arr1 ( 2의 배수 ) , arr2 (3의 배수)  배열 변수에 값 저장 
		for ( int i = 0 , j = 2 ; i < arr1.length ; i++ , j+= 2 ) {
			arr1[i] = j; 
		}
		for ( int i = 0 , j = 3; i <arr2.length; i++, j+=3) {
			arr2[i] = j; 
		}
		
		System.out.println(" == Enhanced For 문을 사용해서 2의 배수 출력 : arr1 ====== ");
		
		for ( int k : arr1) {
			System.out.print ( k + " ");
		}
		
		
		System.out.println();
 		System.out.println("== For 문을 사용해서 3의 배수 출력 : arr2 =========");
		for ( int i =  0 ; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		

		
		
	}

}
