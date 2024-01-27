package playwrightIntro;

import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.List;

public class Maximize {
    public static void main(String[] args) {


        Playwright playwright = Playwright.create();

        List<String> arguments = new ArrayList<>();
        arguments.add("---start-maximized");

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));

        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        Page page = browserContext.newPage();

        page.navigate("https://www.google.com/");
        System.out.println(page.title());
    }
}
