package my.task.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import my.task.webdriver.pages.SearchPage;

public class SearchSteps {

    private SearchPage searchPage;

    @Дано("^Страница РЕЗУЛЬТАТЫ ПОИСКА$")
    public void goToAuthPage(){
        searchPage = new SearchPage();
    }

    @Тогда("^URL в результате поиска на позиции (\\d+) должен быть равен \"([^\"]*)\"$")
    public void checkUrlByNumber(int number, String expUrl){
        String actUrl = searchPage.getUrlByNumber(number);
        assert actUrl.equals(expUrl) :
                String.format("expUrl = \"%s\", actUrl = \"%s\"", expUrl, actUrl);
    }

    @Тогда("^Результат запроса пуст$")
    public void checkResultIsEmpty(){
        boolean isEmpty = searchPage.isEmptyResult();
        assert isEmpty : String.format("exp = \"%b\", act = \"%b\"");
    }

}
