package advancedTests;

import config.AdvancedConfig;
import org.testng.annotations.Test;
import pagesAdvanced.DragScreen;
import pagesAdvanced.SwipeableSecBasicScreen;

public class TestStart extends AdvancedConfig {

    @Test
    public void dragDownTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown();
    }

    @Test
    public void dragDownCountTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown(4);
    }

    @Test
    public void dragDownWindowTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDownWindow();
    }

    @Test
    public void swipeTest() {
        new SwipeableSecBasicScreen(driver)
                .selectSwipeBasicSecPage()
                .selectSwipeableThirdScreen()
                .swipeElement();
    }

}
