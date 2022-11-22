package chapter07.ex05;

class Book {
	String title ; 		//책의 제목을 넣는 변수
	String author; 		//책의 저자를 넣는 변수 
	
	Book () {
		title = "책제목 없음"; 
		author = "작자미상"; 
	}
	
	Book(String title) {
		this (); 
		this.title = title ; 
	}
	
	Book (String title, String author){
		this(title); 
		this.author = author; 
	}
	
	//필드의 값을 출력해 주는 메소드 
	void print() {
		System.out.println("책의 제목은 : " + title);
		System.out.println("책의 저자는 : " + author);
	}	
}
public class Book_Test {

	public static void main(String[] args) {
		// 
		// 기본 생성자 
		Book book1 = new Book(); 
		book1.print();
		
		//매개변수 1개인 생성자 호출 
		Book book2 = new Book ( "콩쥐 팥쥐"); 
		book2.print();
		
		//매개변수 2개인 생성자 호출 
		Book book3 = new Book ( "홍길동전", "허균"); 
		book3.print();

	}

}
