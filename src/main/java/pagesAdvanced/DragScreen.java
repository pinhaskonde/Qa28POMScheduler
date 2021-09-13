package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DragScreen extends BaseScreenAdvanced{

    public DragScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id ='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement selectDraggableBasic;

    @AndroidFindBy (xpath = "//*[@content-desc ='Swipe']")
    MobileElement swipe;

    public DraggableBasicScreen selectDraggableBasic(){
        selectDraggableBasic.click();
        return new DraggableBasicScreen(driver);
    }

    public SwipeableSecBasicScreen selectSwipe(){
        swipe.click();
        return new SwipeableSecBasicScreen(driver);
    }

}

