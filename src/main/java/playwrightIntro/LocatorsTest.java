package playwrightIntro;

import com.microsoft.playwright.*;

public class LocatorsTest {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.com/gmail/about/");
        page.locator("a[data-action='sign in']").click();
//        page.type("input[id='identifierId']","abxd@gmail.com",new Page.TypeOptions().setDelay(100)
//        );
//        ElementHandle elementHandle = page.querySelector("input[id='identifierId']");
        page.fill("input[id='identifierId']","helo@gmail.com");



    }
}
