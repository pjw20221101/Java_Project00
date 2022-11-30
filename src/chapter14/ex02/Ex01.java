package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		// 12: 45분까지 완료 , p.jangwoo@gmail.com 
		
		//try  ~ catch - finally 구문을 사용해서 예외 처리  

		int[] arr = new int[] {1,2,3,4} ; 
		
		//실행시 예외 발생 : ArrayIndexOutOfBoundsException
		
		try {
			
			System.out.println(arr[5]);
			System.out.println("try 블락의 코드 ");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동
			System.out.println("catch 블락 작동됨");
		}finally {
			//무조건 작동 되는 블락 
			System.out.println("Finally 블락 : 예외와 상관 없이 항상 작동됨");
		}
		
		System.out.println("프로그램 종료 ");
	}

}
