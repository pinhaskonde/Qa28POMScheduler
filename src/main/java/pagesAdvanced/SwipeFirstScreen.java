package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SwipeFirstScreen extends BaseScreenAdvanced {

    public SwipeFirstScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@content-desc ='Swipe']")
    MobileElement selectSwipeBasic;

    public SwipeableSecBasicScreen selectSwipeBasicPage() {
        selectSwipeBasic.click();
        return new SwipeableSecBasicScreen(driver);
    }

}