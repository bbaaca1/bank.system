package bank.system;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BankMain {
	
	final static Logger logger = LogManager.getLogger(BankMain.class);
	
	public static void main(String[] args) {
		// 은행 메인메뉴 입니다.
		// 메인 메인에는 가능한 코드를 사용하지 말아주세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		AccountDeposit ad = new AccountDeposit();
		AccountWithdrawal aw = new AccountWithdrawal();
		AccountTransfer at = new AccountTransfer();
		AccountManage am = new AccountManage();
		AdminMenu adminmeun = new AdminMenu();
		
		int input = 0;
		
		logger.info("System launched"); // 로깅 : 시스템 시작
		
		
		do {
			System.out.println("==========================================================");
			System.out.println("|\t\t\t대우 은행 관리 시스템 \t\t |");
			System.out.println("==========================================================");
			System.out.println("|    1.계좌 관리 | 2.계좌 입금 | 3.계좌 출금 | 4.계좌 이체 | 0.종료\t |");
			System.out.println("==========================================================");
			System.out.print("\n메뉴을 선택해주세요(정수만 입력해주세요) > ");
			
			try {
				input = Integer.parseInt(sc.nextLine());
				
				switch (input) {
				// 1.계좌 관리 메뉴 2. 입금메뉴 3. 출금메뉴 4. 이체메뉴 0. 종료 9. 관리자 화면
				
				case 1:
					am.manageMeun(sc);
					break;
					
				case 2:
					ad.depositMeun(sc);
					break;
					
				case 3:
					aw.withdrawlMeun(sc);
					break;
					
				case 4:
					at.transferMeun(sc);
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					logger.info("End of System"); // 로깅 : 시스템 종료
					sc.close();
					return;
					
				case 9:
					adminmeun.AdminLogin(sc);
					break;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			} catch (NumberFormatException e) {
				// 숫자(정수)외 입력시 실행합니다.
				System.out.println("숫자(정수)외 입력이 들어왔습니다 다시 입력해주세요.");
				logger.error(e.toString());
			} catch (Exception e) {
				// 그외 에러 발생시
				System.out.println("에러가 발생했습니다 다시 입력해주세요.");
				logger.error(e.toString());
			}
			
			System.out.println("\n\n\n\n\n");// 이전 메뉴가 가능하면 안나오게 하기 위해 줄바꿈
		}while (true);
			
			

		

	}

}
