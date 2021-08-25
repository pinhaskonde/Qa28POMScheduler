package testsScheduler;

import config.ConfigScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesScheduler.SplashScreen;

public class LoginTestNegativeEmail extends ConfigScheduler {

    @Test
    public void loginTestNegativeEmail() {

        Boolean isLoginButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("john@gmailcom")
                .fillPassword("Jj123456$")
                .clickLoginButtonAndStill()
                .checkLoginButton();

        Assert.assertTrue(isLoginButtonPresent);



    }

}


