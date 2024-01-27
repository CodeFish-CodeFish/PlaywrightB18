package playwrightIntro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Test {
    public static void main(String[] args) {
//        Playwright playwright = Playwright.create();
//
//        Browser browser = playwright.chromium().launch();
//
//        Page page = browser.newPage();
//
//        page.navigate("https://www.google.com/");
//        System.out.println(page.title());



        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));

        Page page = browser.newPage();

        page.navigate("https://www.google.com/");
        System.out.println(page.title());


        page.close();
        playwright.close();


    }
}
