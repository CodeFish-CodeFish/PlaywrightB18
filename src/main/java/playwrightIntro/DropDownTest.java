package playwrightIntro;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.ArrayList;
import java.util.List;

public class DropDownTest {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.wikipedia.org/");
//        Locator value = page.locator("#searchLanguage");
//        page.selectOption("select","hi"); // select by value
//        page.selectOption("select",new SelectOption().setLabel("Euskara")); // select by text
//        page.selectOption("select",new SelectOption().setIndex(1)); // select by Index

        Locator value = page.locator("select > option");
//        List<ElementHandle>options = page.querySelectorAll("#searchLanguage");

//        System.out.println(value.count());
//        List<String> langName = new ArrayList<>();
//        for (int i = 0; i < value.count(); i++) {
//            System.out.println(value.nth(i).innerText() + "------" + value.nth(i).getAttribute("lang"));
//            langName.add(value.nth(i).innerText());
//        }
//        System.out.println(langName.size());

                List<ElementHandle>options = page.querySelectorAll("#searchLanguage");

                for (ElementHandle elValue: options){
                    System.out.println(elValue.innerText() + "-----" + elValue.getAttribute("value"));
                }


    }
}
