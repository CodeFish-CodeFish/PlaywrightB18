package userGestures;

import com.microsoft.playwright.*;

public class TestMouseOver {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//        Page page = browser.newPage();
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate("https://www.way2automation.com/");

        ////*[@id="menu-item-27580"]/a/span[2]
//        Locator allCoueses = page.locator("//*[@id=\"menu-item-27580\"]/a/span[2]");
        Locator allCoueses = page.locator("//*[@id=\"menu-item-27580\"]/a/span[2]");
        allCoueses.hover();
        Thread.sleep(2000);
//        Locator devops = page.locator(".eicon-close");
        Locator devops = page.locator("//*[@id=\"menu-item-27592\"]/a/span[2]");

        devops.click();

        System.out.println("test is done");
//        page.locator("//*[@id=\"menu-item-27592\"]/a").click();
    }
}
