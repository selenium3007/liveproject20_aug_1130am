package com.durgasoft.selenium.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.durgasoft.selenium.java.BasePage;
import com.durgasoft.selenium.java.PageUI;
import atu.testrecorder.ATUTestRecorder;

public class TC001_HMS_Login_Logout extends BasePage {

	public ATUTestRecorder recorder;

	@Test(description = "This test case is to verify login and logout in HMS")
	public void hms_login_logout()throws Exception {
		PageUI p = new PageUI(driver);
		p.verifyLogin();
		p.verifyLogout();
		recorder.stop();
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		recorder = new ATUTestRecorder("D:\\recording", "HMSLogin", false);
		recorder.start();
		browserLaunch("firefox", "http://seleniumbymahesh.com");

	}
}


