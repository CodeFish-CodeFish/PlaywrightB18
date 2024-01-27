package DownloadsUploads;

import java.nio.file.Paths;
 
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class DownloadingFiles {
 
    public static void main(String[] args) {
 
 
 
       Playwright playwright = Playwright.create();
       Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
       Page page = browser.newPage();
       page.navigate("https://www.selenium.dev/downloads/");
       
       
       Download file = page.waitForDownload(() -> {
          page.locator("body > div > main > div:nth-child(5) > div.col-sm-6.py-3.ps-0.pe-3 > div > div > p:nth-child(1) > a").click();
       });//body > div > main > div:nth-child(5) > div.col-sm-6.py-3.ps-0.pe-3 > div > div > p:nth-child(1) > a
 
       
//     file.saveAs(Paths.get("./src/main/resourcesselenium.jar"));
       file.saveAs(Paths.get("/Users/codefish/Downloads/resourcesselenium.jar"));

    }
 
}
