package my.task.webdriver.pages;

import my.task.webdriver.SelectorType;

public class MainPage extends BasePage {

    public static final String SELECTOR_SEARCH_INPUT = "text";
    public static final String SELECTOR_SEARCH_BTN = "//button[contains(@class,'button_theme_websearch')]";

    public MainPage inputSearch(String text){
        clear(SelectorType.ID, SELECTOR_SEARCH_INPUT);
        input(SelectorType.ID, SELECTOR_SEARCH_INPUT, text);

        return this;
    }

    public MainPage clickSearch(){
        click(SelectorType.XPATH, SELECTOR_SEARCH_BTN);

        return this;
    }

}
