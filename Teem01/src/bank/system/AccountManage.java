package bank.system;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AccountManage extends AccountFileSystem {
	
	final static Logger logger = LogManager.getLogger(AccountManage.class);
	
	
	public void manageMeun(Scanner sc) {
		// 계좌 관리 메뉴화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println("\n\n\n계좌 관리 메뉴 입니다.");
			System.out.println("1.계좌 생성 | 2. 계좌 조회 | 3.계좌 해지 | 0.메인메뉴");
			System.out.print("메뉴를 선택해주세요(숫자만 입력해주세요) > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			
				switch (inputNumber) {
				case 0:
					logger.info("return to main meun");
					System.out.println("메인메뉴로 돌아갑니다.");
					return;
					
				case 1:
					accCreateMeun(sc);
					return;
					
				case 2:
					accFindMeun(sc);
					return;
					
				case 3:
					accRemoveMeun(sc);
					return;
					
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
				}
			
		} while (true);
	}
	
	public void accCreateMeun(Scanner sc) {
		// 계좌 생성 화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println("계좌 생성입니다. 잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다.");
			System.out.print("계좌 번호를 입력해주세요(숫자만 입력해주세요) > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			
			if (inputNumber == 0) {
				logger.info("return to main meun");
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			
		} while (true);
	}
	
	public void accFindMeun(Scanner sc) {
		// 계좌 조회 화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println("계좌 조회입니다. 잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다.");
			System.out.print("계좌 번호를 입력해주세요(숫자만 입력해주세요) > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			
			if (inputNumber == 0) {
				logger.info("return to main meun");
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			
		} while (true);
	}
	
	public void accRemoveMeun(Scanner sc) {
		// 계좌 해지 화면 메소드입니다.
		
		int inputNumber = 0;
		String inputAccountNumber = null;
		
		do {
			System.out.println("계좌 해지입니다. 잘못들어오셨다면 0번을 입력하면 메인메뉴로 돌아갑니다.");
			System.out.print("계좌 번호를 입력해주세요(숫자만 입력해주세요) > ");
			inputAccountNumber = sc.nextLine();
			inputNumber = Integer.parseInt(inputAccountNumber);
			
			if (inputNumber == 0) {
				logger.info("return to main meun");
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			
		} while (true);
	}
}
