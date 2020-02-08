package com.luizcarlos.appium.test;

import static com.luizcarlos.appium.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;

public class ScrollTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void opcaoEscondida() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formul�rio']")));
		System.out.println("Iniciando");
		menu.scroll(0.9, 0.1);
		
		menu.clicarPorTexto("Op��o bem escondida");
		
		Assert.assertEquals("voc� achou essa op��o", menu.obterMsgAlerta());
		
		menu.clicarPorTexto("OK");
		
		
	}
}
