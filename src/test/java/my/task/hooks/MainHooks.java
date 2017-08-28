package my.task.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import my.task.webdriver.driver.Driver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainHooks {

    @Before
    public void prepareData() {
        WebDriver driver = Driver.init(Driver.Type.FIREFOX);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
    }

    @After
    public void clearData() {
        Driver.close();
    }

}
