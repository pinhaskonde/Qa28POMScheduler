package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AdvancedConfig {

    protected AppiumDriver<MobileElement> driver;

    public Logger logger = LoggerFactory.getLogger(AdvancedConfig.class);

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Pix");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability("appPackage", "com.h6ah4i.android.example.advrecyclerview");                      //*
//        capabilities.setCapability("appActivity",".presentation.splashScreen.SplashScreenActivity");       //.launcher.MainActivity    *

        capabilities.setCapability("automationName", "Appium");                                                       //*
        capabilities.setCapability("app", "/Users/workspace/Tools/AdvancedRecyclerView.apk");

        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver= EventFiringWebDriverFactory.getEventFiringWebDriver(driver,new AppiumListener());
        logger.info("Start app Advanced ");

    }

    @AfterSuite
    public void tearDown() {
        logger.info("Stop Advanced");
        driver.quit();
    }

}
