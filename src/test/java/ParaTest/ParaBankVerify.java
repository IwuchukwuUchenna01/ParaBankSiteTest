package ParaTest;

import ParaBank.ParaBankObjects;
import ParaBank.Selectors;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParaBankVerify {
    ParaBankObjects banks = new ParaBankObjects();

    @BeforeTest
    public void openPage() {
        banks.setUp();
    }

    @Test
    @Description("User account registration successful with success response\n" +
            "successfully logged in User\n" +
            "Successfully confirmed 'account overview'")
    public void registerUser() {
        banks.accountRegistration();
        banks.verifySignUp();
        banks.logOut();
        banks.accountLogin();
        banks.verifyLogin();
    }
    @AfterTest
    public void closePage() {
        banks.tearDown();
    }
}
