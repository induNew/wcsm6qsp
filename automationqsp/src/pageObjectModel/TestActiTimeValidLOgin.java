package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLOgin  extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser and launch the web app
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		
		lp.validLogin(validUsername, validPassword);//valid login
		bt.closeBrowser();
	}

}
