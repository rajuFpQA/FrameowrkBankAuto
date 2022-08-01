package com.learntesting.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver startWeb(WebDriver driver, String bname, String weburl) {
		if (bname.equals("Firefox"))

		{
			System.setProperty("webdriver.firefox.driver", "./geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (bname.equals("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver1.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(weburl);
		driver.navigate().to(weburl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.quit();

	}

}
