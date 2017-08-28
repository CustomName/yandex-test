package my.task.webdriver.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {

    private static final ThreadLocal<WebDriver> instance = new ThreadLocal<WebDriver>();

    public static WebDriver init(Type type){
        if(instance.get() == null){
            switch (type){
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "src\\test\\java\\my\\task\\webdriver\\driver\\geckodriver.exe");
                    instance.set(new FirefoxDriver());
                    break;
                default:
                    System.setProperty("webdriver.gecko.driver", "src\\test\\java\\my\\task\\webdriver\\driver\\geckodriver.exe");
                    instance.set(new FirefoxDriver());
                    break;
            }
        }
        return instance.get();
    }

    public static WebDriver getDriver() {
        if(instance.get() == null){
            try {
                throw new Exception("Web driver not initialized");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance.get();
    }

    public static void close(){
        if(instance.get() != null){
            instance.get().quit();
            instance.remove();
        }
    }

    public enum Type{
        FIREFOX
    }

}
