package my.task.steps;

import cucumber.api.java.ru.Тогда;
import my.task.webdriver.driver.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps {

    @Тогда("^Заголовок страницы должен быть \"([^\"]*)\"$")
    public void checkTitle(String expTitle){
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.titleIs(expTitle));
        String actTitle = Driver.getDriver().getTitle().trim();
        assert actTitle.equals(expTitle) :
                String.format("expected title = \"%s\", actual title = \"%s\"", expTitle, actTitle);
    }

    @Тогда("^Заголовок страницы должен содержать \"([^\"]*)\"$")
    public void checkTitle2(String expTitle){
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.titleContains(expTitle));
        String actTitle = Driver.getDriver().getTitle().trim();
        assert actTitle.contains(expTitle) :
                String.format("expected title = \"%s\", actual title = \"%s\"", expTitle, actTitle);
    }

}
