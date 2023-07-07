package bank.system;

import java.util.Scanner;

public class AccountTransfer extends AccountFileSystem {
	
	public void transferMeun(Scanner sc) {
		// 이체 메뉴화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println(" ==========================================================");
			System.out.println(" | 계좌 이체 메뉴 입니다  잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다.|");
			System.out.println(" ==========================================================");
			System.out.print("\n계좌 번호를 -을 제외한 12 자리를 입력해주세요 > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			if (inputNumber == 0) {
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			
		} while (true);
	}

}
