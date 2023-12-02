package ParaTest;

import ParaBank.ParaBankObjects;
import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParaBankVerify {
    ParaBankObjects banks = new ParaBankObjects();
    @BeforeTest
    public void openPage(){
        banks.setUp();
    }
    @Test
    @Description("user account registration")
    public void registerUser(){
        banks.accountRegistration();
    }
    @AfterTest
    public void closePage(){
        banks.tearDown();
    }
}
