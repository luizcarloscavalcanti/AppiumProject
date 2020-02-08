package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.AbasPage;
import com.luizcarlos.appium.page.MenuPage;

public class AbasTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void interagirComAbas() {
		menu.acessarAbas();
		
		Assert.assertTrue(page.isAba1());
		
		page.clicarAba();
		
		Assert.assertTrue(page.isAba2());
	}

}
