package chapter06;

class Man {
	//필드    <p.jangwoo@gmail.com> <<완료시간 : 1:10분까지>>
	String name = "홍길동" ; 
	int age = 30 ; 
	String phone = "010-1111-1234"; 
	String addr = "서울 종로구 인사동"; 
	double weight = 70.5; 
	
	//기본 생성자는 생략됨 : Man () {} 
	
	//메소드 : 
	void add1 () {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
		int sum = 0; 
		for (int i = 1 ; i <=100 ; i++) {
			
			if (i % 2 == 0 ) {
				sum += i; 
				System.out.print( i  + " ");
			}
		}
		System.out.println();
		System.out.println("2의 배수를 합한 값 : " + sum );
	}
	
	void add2 () {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값출력	
		int sum = 0; 
		for (int i = 1 ; i <= 500 ; i++ ) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i; 
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("3의 배수와 4의 배수의 합 : " + sum);
	}
	void add3 () {
		// 1 ~ 1000까지 1씩증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력 
		int sum = 0 ; 
		for (int i = 0 ; i <=1000; i++) {
			if (i % 4 == 0) {
				continue; 
			}
			sum += i; 
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("모두 더한값 : " + sum);
	}
		
}


public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출 
		
		Man man = new Man (); 
		
		man.add1();
		
		System.out.println("=========================");
		
		man.add2();
		
		System.out.println("=========================");
		man.add3();
		
		
		
		

	}

}
