package com.durgasoft.ecommerce.homepage;

import org.testng.annotations.Test;
import com.durgasoft.ecommerce.basepage.BasePage;
import com.durgasoft.ecommerce.pageUI.CreateLoginAccount;

import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;

public class TC001_CustomerRegistration extends BasePage {

	public static final Logger log = Logger.getLogger(TC001_CustomerRegistration.class.getName());

	@Test
	public void customerRegistration() throws Exception {
		log.info("*******Starting TC001_CustomerRegistration**********");
		CreateLoginAccount login = new CreateLoginAccount(driver);
		login.createAccount();
		log.info("*******End of TC001_CustomerRegistration************");
	}

	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin");
	}

	@Test
	public void verifyLogout() {
		System.out.println("verifyLoout");
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		browserLaunch(getData("browser"), getData("url"));
	}

	@AfterTest
	public void afterTest() {

	}

}
