package chapter09.ex01;

public class A {
	
	//필드 이름 앞에 접근 제어자 
	public int a = 1; 			//외부 패키지에서 접근이 가능, 
	protected int b = 2; 		//외부 패키지에서 접근이 가능 (상속관계일때만 가능)
	int c = 3; 					//default : 같은 패키지 내에서 접근 가능 
	private int d = 4; 			//동일한 파일에서만 접근이 가능 
	
	 public A () {} 
	
	public void abc() {					//public : 다른 패키지에서 접근가능
		System.out.println("public");
	}
	protected void bcd() {				//protected : 다른 패키지에서 접근 가능 (단.상속관계일때)
		System.out.println("protected");
	}
	void cde() {						//default : 같은 패키지에서만 접근 가능
		System.out.println("default");
	}
	private void def() {				//private : 같은 파일 내에서만 접근 가능 
		System.out.println("private");
	}
	
}
