package bank.system;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminMenu {
	
	final static Logger logger = LogManager.getLogger(AdminMenu.class);
	
	public void AdminLogin(Scanner sc) {
		// 관리자 인증 메소드입니다
		
		logger.info("start admin authentication");
		System.out.println("관리자 비밀번호를 입력하세요."); // 현재 관리자 비밀번호는 1234
		int input = sc.nextInt();
		
		if (input == 1234) {
			logger.info("admin authentication");
			System.out.println("인증되었습니다.");
			Adminmain(sc);
			return;
		} else {
			logger.info("admin filled authentication");
			System.out.println("틀렸습니다. 메인으로 돌아갑니다.");
			return;
		}
		
	}
	
	private void Adminmain(Scanner sc) {
		// 관리자 메뉴 메소드입니다
		System.out.println("1.사용자 관리 | 2.로그 확인 | 0.메인메뉴");
		System.out.print("메뉴를 선택해 주세요 > ");
		int input = 0;
		logger.info("admin login");
		do {
			input = sc.nextInt();
			
			if (input == 0) {
				logger.info("return to main meun");
				System.out.println("메뉴로 돌아갑니다.");
				return;
			}
		} while (true);

		
	}
}
