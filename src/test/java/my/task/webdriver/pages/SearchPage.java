package my.task.webdriver.pages;

import my.task.webdriver.SelectorType;

public class SearchPage extends BasePage {

    public static final String SELECTOR_SEARCH_RESULT_URL = "//ul[contains(@class,'serp-list')]/li[%s]//div[contains(@class,'organic__path')]/a/b";
    public static final String SELECTOR_EMPTY_SEARCH_RESULT = "//div[@class='misspell']";

    public String getUrlByNumber(int number){
        return getText(SelectorType.XPATH,
                        String.format(SELECTOR_SEARCH_RESULT_URL, number));
    }

    public boolean isEmptyResult(){
        return isExistElem(SelectorType.XPATH, SELECTOR_EMPTY_SEARCH_RESULT);
    }

}
