package pagesScheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class WizardScreen extends BaseScreen{
    public WizardScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id= 'com.example.svetlana.scheduler:id/wizard_settings_skip_container']")
    MobileElement skipButton;

    public HomeScreen skippWizard(){
        if (isDisplayedWithoutException(skipButton)) {
            skipButton.click();
        }
        return new HomeScreen(driver);
    }

    @FindBy(xpath = "//*[@resource-id= 'com.example.svetlana.scheduler:id/wizard_settings_skip_container']")
    MobileElement loginButton;

    public HomeScreen stillThisPage(){
        isDisplayedWithoutException(loginButton);
        return new HomeScreen(driver);
    }

}


