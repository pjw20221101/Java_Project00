package chapter16.ex05;

//제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드 
class GenericMethods {
	
	//제너릭 메소드  : 일반클래스 내부에 제너릭 타입의 메소드
	//접근제어자 <외부에서타입지정> 리턴타입 메소드명 (타입 변수) 
	// 다양한 타입의 값을 리턴으로 되돌려주는 메소드 
	public <T> T method1 (T t) {
		return t; 
	}
	
	//동일한 타입의 두값을 인풋받아서 같으면 true, 다르면 false 를 리턴시켜줌 
	// 제너릭에 넣는 타입변수 T 에 올수있는 것은 기본타입은 넣을 수 없다. wrapper 클래스만 올수 있다. 
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2); 
	}
	
	public <K, V> void method3 (K k , V v) {
		System.out.println(k + " : " + v);
	}		
}


public class GenericMethod {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기 
		//일반 클래스의 객체 생성 
		GenericMethods gm = new GenericMethods(); 
		
		String str1 = gm.<String>method1("안녕"); 
		String str2 = gm.method1("하세요");  //뒤의 인풋 값으로 타입을 유추할 수 있는경우 생략 가능      
		
		System.out.println(str1);
		System.out.println(str2);
		
		Integer int1 = gm.<Integer>method1(100); 
		Integer int2 = gm.method1(200); 
		System.out.println(int1);
		System.out.println(int2);
		
		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		
		System.out.println("==========================");
		//2. method2 호출 
		
		//리턴 타입은 일반 타입
		boolean bool1 = gm.<Double>method2( 2.5, 2.5 );
		boolean bool2 = gm.method2(2.4, 2.5); 
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("==============");
		System.out.println(gm.<String> method2("안녕","안녕"));
		System.out.println(gm.method2("안녕", "하세요"));
		
		System.out.println("=================");
		//method3 출력 
		
		gm.<String, Integer> method3("국어", 80); 
		gm.method3("영어", 88);
		
		System.out.println("================");
		gm.method3("아바타2", "롯데시네마");
		gm.method3(1000, 2000 );
		gm.<Integer,Double> method3(1000, 30.33); 
		
		
		
	}

}
