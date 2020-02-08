package com.luizcarlos.appium.page;

import static com.luizcarlos.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.luizcarlos.appium.core.BasePage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class CliquesPage extends BasePage {

	public void cliqueLongo() {
		new TouchAction<>(getDriver())
				.longPress(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))))
				.perform();
	}
	

	public String obterTextoCampo() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}

}
