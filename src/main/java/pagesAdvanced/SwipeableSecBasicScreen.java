package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableSecBasicScreen extends BaseScreenAdvanced {

    public SwipeableSecBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@content-desc='Swipe']")
    MobileElement swipeBookmark;

    public SwipeableSecBasicScreen selectSwipeBasicSecPage() {
        swipeBookmark.click();
        return new SwipeableSecBasicScreen(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button']")
    List<MobileElement> swipeButtons;

    public SwipeableThirdBasicScreen selectSwipeableThirdScreen(){
        swipeButtons.get(1).click();
        return new SwipeableThirdBasicScreen(driver);
    }


}
