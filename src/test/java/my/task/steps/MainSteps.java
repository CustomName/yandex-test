package my.task.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import my.task.webdriver.pages.MainPage;

public class MainSteps {

    private MainPage mainPage;

    @Дано("^Страница ГЛАВНАЯ$")
    public void goToMainPage(){
        mainPage = new MainPage();
    }

    @Если("^Ввести \"([^\"]*)\" в поле поиска на странице ГЛАВНАЯ$")
    public void inputSearch(String text){
        mainPage.inputSearch(text);
    }

    @Если("^Нажать на кнопку НАЙТИ на странице ГЛАВНАЯ$")
    public void clickSearch(){
        mainPage.clickSearch();
    }

}
