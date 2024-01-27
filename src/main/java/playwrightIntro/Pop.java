package playwrightIntro;

import com.microsoft.playwright.*;

public class Pop {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://sso.teachable.com/secure/673/identity/sign_up/email");

        Locator privacyPolici = page.locator("text=Privacy Policy");

//        Page newWindow = page.waitForPopup(() -> {
//
//            page.locator("text=Privacy Policy").nth(0).click();
//
//        });
        Page newWindow = page.waitForPopup(() -> {

            privacyPolici.nth(0).click();

        });

        newWindow.locator("//*[@id=\"header-sign-up-btn\"]").click();//sighn up
        newWindow.locator("body > main > div > form > div:nth-child(3) > button").click();
        newWindow.locator("#user_name").fill("CODEFISH");//userName

        page.locator("#user_name").fill("backToPage");

//
//
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        newWindow.close();
        page.close();
        browser.close();
        playwright.close();
    }
}
