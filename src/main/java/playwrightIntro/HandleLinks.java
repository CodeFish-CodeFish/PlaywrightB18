package playwrightIntro;

import com.microsoft.playwright.*;

public class HandleLinks {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.wikipedia.org/");

        Locator block = page.locator("div.footer > div.other-projects");
        Locator links = block.locator("a");
        System.out.println(links.count());

        for (int i = 0; i < links.count(); i ++){
            System.out.println(links.nth(i).innerText() + "--URL--" + links.nth(i).getAttribute("href"));
        }
    }
}
