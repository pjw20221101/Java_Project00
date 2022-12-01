package chapter14.ex07;


public class Account {
	//완료시간 : 1:20분까지 , p.jangwoo@gmail.com
	
	private long balance = 1000; 		//예금의 잔고 1000
	public Account() {}   //기본 생성자 
	
	public long getBalance () {   //getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance; 
	}
	
	//예금 : 
	public void deposit(int money) {   //기존의 잔고에서 money를 인풋받아서 더해서 다시 필드에 적용
		balance += money; 
	}
	
	// 예외처리 
	//출금 : 
	public void withdraw(int money) throws BalanceException {
		//잔고가 money 보다 작은 경우 잔고 부족이라고 강제로 예외를 발생 시켜서
			//예외 메세지 : "잔고가 부족 합니다." 라고 출력을 해주면됨
			//  BalanceException <== 사용자 정의 예외를 생성해서 
		
		if (balance < money) {
			System.out.println("현재 예금잔고 : " + balance  + ",  출금 요청한 금액 : " + money);
			throw new BalanceException("예금 잔고가 부족합니다." +  (money - balance) + "원 모자랍니다");
			
		}else {
			balance -= money; 
		}
	}
	

}
