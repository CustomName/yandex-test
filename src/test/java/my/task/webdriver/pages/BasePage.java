package my.task.webdriver.pages;

import my.task.webdriver.SelectorType;
import my.task.webdriver.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    public void click(SelectorType type, String selector){
        findElem(type, selector).click();
    }

    public void clear(SelectorType type, String selector){
        findElem(type, selector).clear();
    }

    public void input(SelectorType type, String selector, String text){
        findElem(type, selector).sendKeys(text);
    }

    public String getText(SelectorType type, String selector){
        return findElem(type, selector).getText();
    }

    public boolean isExistElem(SelectorType type, String selector){
        return findElems(type, selector).size() > 0;
    }

    private WebElement findElem(SelectorType type, String selector){
        switch (type){
            case ID:
                return Driver.getDriver().findElement(By.id(selector));
            case NAME:
                return Driver.getDriver().findElement(By.name(selector));
            case XPATH:
                return Driver.getDriver().findElement(By.xpath(selector));
            default:
                return null;
        }
    }

    private List<WebElement> findElems(SelectorType type, String selector){
        switch (type){
            case ID:
                return Driver.getDriver().findElements(By.id(selector));
            case NAME:
                return Driver.getDriver().findElements(By.name(selector));
            case XPATH:
                return Driver.getDriver().findElements(By.xpath(selector));
            default:
                return null;
        }
    }

}
