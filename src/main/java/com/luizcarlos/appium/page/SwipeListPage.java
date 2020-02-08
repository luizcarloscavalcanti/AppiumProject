package com.luizcarlos.appium.page;

import org.openqa.selenium.By;

import com.luizcarlos.appium.core.BasePage;
import com.luizcarlos.appium.core.DriverFactory;

public class SwipeListPage extends BasePage {
	
	public void swipeElementLeft(String opcao) {
		swipeElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}

	public void swipeElementRight(String opcao) {
		swipeElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}

	
}
