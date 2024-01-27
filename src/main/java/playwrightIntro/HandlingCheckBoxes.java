package playwrightIntro;

import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.List;

public class HandlingCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        List<String> arguments = new ArrayList<>();
        arguments.add("--start-maximized");

        Browser browser = playwright.chromium().launch(new BrowserType
                .LaunchOptions().setHeadless(false).setArgs(arguments));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        Page page = browserContext.newPage();
        page.navigate("http://www.tizag.com/htmlT/htmlcheckboxes.php");

        Locator checkBoxes = page.locator("[type='checkbox']");
        System.out.println(checkBoxes.count());

        for (int i = 0; i< checkBoxes.count(); i ++){
            System.out.println(checkBoxes.nth(i).isChecked());
            checkBoxes.nth(i).click();

            Thread.sleep(1000);


        }

    }
}
