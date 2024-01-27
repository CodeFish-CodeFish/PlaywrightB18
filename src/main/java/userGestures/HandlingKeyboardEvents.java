package userGestures;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Locator.TypeOptions;

public class HandlingKeyboardEvents {

    public static void main(String[] args) throws InterruptedException {


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://google.com");

        Locator locator = page.locator("[name='q']");
        locator.fill("bob.tatykul@gmail.com");

//        page.keyboard().press("Enter");
//        Thread.sleep(1000);
//        page.goBack();
//        page.locator("[name='q']").click();
        Thread.sleep(5000);
        page.keyboard().press("Meta+A"); // macbook

//        page.keyboard().press("Control+A"); // windows
        Thread.sleep(1000);
        page.keyboard().press("Meta+X"); //
        Thread.sleep(1000);
        page.keyboard().press("Meta+V");
        Thread.sleep(1000);

//        page.keyboard().press("Enter");
        Thread.sleep(1000);
        page.keyboard().down("Shift");
//
        for (int i = 0; i < 3; i++) {
            page.keyboard().press("ArrowLeft");
            Thread.sleep(500);
        }


        System.out.println("test done");
    }

}


/*
* package JSandKeyboard;

import com.microsoft.playwright.*;

public class HandlingKeyboardEvents {

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://google.com");

        Locator locator = page.locator("[name='q']");
        locator.fill("bob.tatykul@gmail.com");

        // Uncomment the following line for Windows
        // page.keyboard().press("Control+A");

        Thread.sleep(1000);
        page.keyboard().press("Control+X");
        Thread.sleep(1000);
        page.keyboard().press("Control+V");
        Thread.sleep(1000);
        *
        * page.keyboard().click("Enter");

        // Release the Shift key
        page.keyboard().up("Shift");

        // Perform arrow-left key presses
        for (int i = 0; i < 3; i++) {
            page.keyboard().press("ArrowLeft");
            Thread.sleep(500);
        }

        System.out.println("Test done");
    }
}

*
* */