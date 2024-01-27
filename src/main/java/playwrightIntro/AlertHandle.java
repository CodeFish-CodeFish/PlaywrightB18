package playwrightIntro;

import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.List;

public class AlertHandle {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");

        Browser browser = playwright.chromium().launch(new BrowserType
                .LaunchOptions().setHeadless(false).setArgs(arguments));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        Page page = browserContext.newPage();
//        page.navigate("https://mail.rediff.com/cgi-bin/login.cgi");
//        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");



        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
        page.click("[onclick='jsAlert()']");
        Thread.sleep(5000);
//        page.click("[type='submit']");
//        System.out.println(page.locator("p.form-label").first().innerText());
//
        page.onDialog(x -> {
            System.out.println(x.message());
            x.accept();
        });


        System.out.println(page.locator("#result").innerText());
    }
}
