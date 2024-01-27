package playwrightIntro;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://www.google.com/");
      page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).click();
      page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).fill("amazon");

      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Amazon.com. Spend less. Smile")).click();
    }
  }
}