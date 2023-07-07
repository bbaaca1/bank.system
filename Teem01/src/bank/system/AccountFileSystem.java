package bank.system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public abstract class AccountFileSystem {
	
	final static Logger logger = LogManager.getLogger(AccountFileSystem.class);
	
	private String accountNumber;
	private String accountPasswd;
	private ArrayList<AccountCreate> list = new ArrayList<AccountCreate>();
	
	private void inputFileDate() {
		try {
			FileInputStream file = new FileInputStream("C:\\Development_Kits\\java_workspace\\Teem01\\File_system\\user_date\\accounts");
			Workbook workbook = WorkbookFactory.create(file);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
