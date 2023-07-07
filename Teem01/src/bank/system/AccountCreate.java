package bank.system;

public class AccountCreate {
	// 계좌 생성 및 사용용 클래스입니다.
	//필드(계좌용 변수들)
	private String name; 
	private String accountNumber;
	private String ssn;
	private String homeAddress;
	private String phoneNumber; 
	private int balance;
	private String accountType; 
	private String date;
	private int state;
	
	
	//필드 (계좌 상태용 변수들)
	
	private boolean isFreez = false;
	private boolean isNonTradingAcc = false;
	private boolean isWithLimit = false;
	private boolean isTransferLimit = false;
	
	
	// 생성자
	public AccountCreate(String name, String accountNumber, String ssn, String homeAddress, String phoneNumber,
			int balance, String accountType, String date, int state) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.ssn = ssn;
		this.homeAddress = homeAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.date = date;
		this.state = state;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	//계좌 상태 변경용 메소드
	
	public void accountStatus(int status) {
		//계좌 상태용 메소드 입니다.
		/* 0 : 정상 
		   1 : 계좌 동결 
		   2 : 휴면 계좌 
		   3 : 출금 제한
		   4 : 이체 제한
		   5 : 이체,출금 제한
		*/
		
		switch (status) {
		case 0:
			isFreez = false;
			isNonTradingAcc = false;
			isWithLimit = false;
			isTransferLimit = false;
			break;

		case 1:
			isFreez = true;
			break;
			
		case 2:
			isNonTradingAcc = true;
			break;
			
		case 3:
			isWithLimit = true;
			break;
			
		case 4:
			isTransferLimit = true;
			break;
			
		case 5:
			isWithLimit = true;
			isTransferLimit = true;
			break;
		}
		
	}
}
