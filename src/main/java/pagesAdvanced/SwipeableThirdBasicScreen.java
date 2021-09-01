package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableThirdBasicScreen extends BaseScreenAdvanced{

    public SwipeableThirdBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='android:id/text1']")
    List<MobileElement> listOfElements;

    public SwipeableThirdBasicScreen swipeElement(){
        MobileElement element = listOfElements.get(1);

        Rectangle rect = element.getRect();
        int xFrom = rect.getX()+1;
        int yFrom = rect.getY() + rect.getHeight()/2;

        int xTo = xFrom + rect.getWidth();
        int yTo = yFrom;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo,yTo))
                .release()
                .perform();

        return this;
    }

}
