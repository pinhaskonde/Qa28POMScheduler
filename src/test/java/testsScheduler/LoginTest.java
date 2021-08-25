package testsScheduler;

import config.ConfigScheduler;
import dto.AuthTest;
import dto.Authdto;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesScheduler.SplashScreen;

public class LoginTest extends ConfigScheduler {

    @Test
    public void loginTest(){

        Boolean isFabButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("john@gmail.com")
                .fillPassword("Jj123456$")
                .clickLoginButton()
                .skippWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabButtonPresent);
    }

















    @Test
    public void loginWithDto(){
        AuthTest testA = new AuthTest().withEmail("").withPassword("");
        AuthTest testB = new AuthTest().withEmail("dfdfd");

        Authdto dto = Authdto.builder().email("john@gmail.com").password("Jj123456$").build();

        boolean isFabPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDto(dto)
                .skippWizard()
                .isFabAddPresent();

        Assert.assertTrue(isFabPresent);
    }

}
