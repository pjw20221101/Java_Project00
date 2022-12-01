package chapter14.ex07;

public class Account_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성후 테스트 
		Account a1 = new Account(); 
		
		
		
		try {
			a1.withdraw(5000);
		} catch (BalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
