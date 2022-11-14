package chapter04.ex07;

public class Break_Control_Keyword {

	public static void main(String[] args) {
		// break 제어 키워드 : 제어문 (if(생략됨) , switch(명시해야됨), for, while, do while)
		//    - 제어문을 탈출 할때 사용됨 
		//1. 단일 loop 문에서 break 탈출 
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			break; 						//break를 만나면 제어문 탈출 
		}   //0 
		System.out.println("================");
		
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			if (i == 5) {				// if 조건을 사용해서 조건이 만족 되었을때 탈출 
				break; 
			}
		}			//0, 1, 2, 3, 4, 5 
		
		System.out.println("====================");
		
		// 2. 다중(이중) loop 문에서 break 탈출 
		//   case 1 : 하나의 반복문만 탈출하는 경우 
			for(int i = 0 ; i < 5 ; i++) {	//i :  0, 1, 2, 3, 4
				for (int j = 0 ; j < 5 ; j++) { // j : 0, 1, 2, 3, 4
					if ( j == 2) {			// 안쪽의 for 문만 빠져나온다. 
						break; 
					}
					System.out.println(i + " , " + j);
				}
				System.out.println();
			}
		
		System.out.println("=====LABLE을 사용해서 한꺼번에 LABLE 위치로 점프===========================");
		//   case 2 : 점프해서 한번에 밖같쪽의 for 문을 탈출 ( LABLE ) 
		pos1: for ( int i = 0 ; i < 5 ; i++ ) {
				for ( int j=0 ; j <5 ; j++) {
					if ( j ==2 ) {
						break pos1;      // 레이블(LABLE로 지정된 곳으로 점프해서 탈출 
					}
					
					System.out.println(i + " , " + j);
				}
				System.out.println();
			}
			
			System.out.println("=================================");	
			
			
		//   case 2 : 점프해서 한번에 밖같쪽의 for 문을 탈출 ( 변수 값을 조정해서 탈출  ) 
		
		for ( int i = 0 ; i < 5 ; i ++) {
			for (int j = 0 ; j < 5; j ++) {
				if (j == 2) {
					i = 100;       // 바깥쪽 for문의 변수의 값을 큰값을 넣어서 조건을 false 
					break; 
				}
				System.out.println(i + " , " + j);
			}
		}

	}

}
