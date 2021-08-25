package pagesScheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    public String getCurrentVersion(){
        return versionTextView.getText();
    }

    public LoginScreen checkVersion(String version){
        shouldHave(versionTextView, version,15);
        return new LoginScreen(driver);
    }

    public boolean checkLoginButtonIsPresent(){
        if (loginButton.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }


}
