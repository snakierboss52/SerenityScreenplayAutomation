package Utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverUtil {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver<MobileElement> driver) {
        DriverUtil.driver = driver;
    }

}
