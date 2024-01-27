package recordingVideoAndScreenshots;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class ScreenshotPW {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.wikipedia.org/");

//        page.locator("[name='search']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./screenshots/screenshot.png")));
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./screenshots/screenshot.png")));
    }
}