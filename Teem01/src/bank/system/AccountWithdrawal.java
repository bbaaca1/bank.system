package bank.system;

import java.util.Scanner;

public class AccountWithdrawal {
	
	public void withdrawlMeun(Scanner sc) {
		// 출금 메뉴화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			
			System.out.println(" ==========================================================");
			System.out.println(" | 계좌 출금 메뉴 입니다 잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다. |");
			System.out.println(" ==========================================================");
			System.out.print("\n-을 제외한 계좌 번호를 12 자리를 입력해주세요 > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			if (inputNumber == 0) {
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			
		} while (true);
	}
}
