package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// <완료시간 11: 40분까지>  , p.jangwoo@gmail.com
		
		//객체 생성, 메소드 호출 : Main method 에서 호출 
		
		// sum1, sum2 객체 생성 없이 바로 호출 : static 메소드 
		sum1 (3,4,5); 
		int a = sum1(3,4,5); 
		System.out.println(a);
		
		System.out.println(sum1(6,7,8));
		System.out.println("==================");
		double b = sum2(3.0, 4.0, 5.0); 
		System.out.println(b);
		
		System.out.println(sum2 ( 6.0, 7.0, 8.0));
		
		System.out.println("===============");
		
		//sum3 : 인스턴스 메소드 : static 키가 붙어있지 않는 메소드 , 객체화 해야 호출이 가능 
	//	String c = sum3 ("제품이름", "제품가격", "제품수량");   //오류 발생, 객체화 해야 호출
		
		//객체화 
		Ex01 e1 = new Ex01();  //기본 생성자 호출 
		String d = e1.sum3("제품이름", "제품가격", "제품수량"); 
		System.out.println(d);
		
		System.out.println( e1.sum3("제품이름", "제품가격", "제품수량"));

	}
	
	//정수값 3개를 인풋 받아  더한값을 정수 리턴하는 메소드  (static)
	public static int sum1 (int a, int b, int c) {
		return a + b + c ; 
	}
	
	//실수 3개를 인풋 받아  더한값으로 실수로 리턴 하는 메소드 (static)
	public static double sum2 (double a, double b, double c) {
		return a + b + c; 
	}
	
	//문자열을 연결해서 출력 하는 메소드 (인스턴스 메소드 : static 을 사용하지 않는 메소드 ) 
	 //"제품이름" , "제품수량", "제품가격" 
	 // 객체를 생성해서 사용됨
	public String sum3 (String a , String b, String c) {
		return a + " " + b + " " + c ;
	}
	
}
