package com.luizcarlos.appium.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.luizcarlos.appium.core.BasePage;
import com.luizcarlos.appium.core.DriverFactory;

public class SplashPage extends BasePage {
	
	public boolean isTelaSplashVisivel() {
		return checaElementoTexto("Splash!");
	}
	
	public void aguardaSplashSumir() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}

}
