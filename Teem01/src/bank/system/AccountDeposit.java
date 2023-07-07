package bank.system;

import java.util.Scanner;

public class AccountDeposit extends AccountFileSystem {
	
	public void depositMeun(Scanner sc) {
		// 입금 메뉴화면 메소드입니다.
		
		long inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println(" ==========================================================");
			System.out.println(" | 계좌 입금 메뉴 입니다 잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다. |");
			System.out.println(" ==========================================================");
			System.out.print("\n-을 제외한 계좌 번호를 12 자리를 입력해주세요 > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Long.parseLong(inputAccountNumber);
			System.out.println(inputNumber);
			if (inputNumber == 0) {
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			} else {
				System.out.print("\n입금 금액을 입력해주세요 > ");
				inputNumber = sc.nextLong();
			}
			sc.nextLine();
		} while (true);
	}

}
