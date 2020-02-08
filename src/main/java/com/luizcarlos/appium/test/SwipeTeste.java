package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;

public class SwipeTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void realizaSwipe(){
		menu.acessarSwipe();
		
		Assert.assertTrue(menu.checaElementoTexto("a esquerda"));
		
		menu.swipeRight();
		
		Assert.assertTrue(menu.checaElementoTexto("E veja se"));
		
		esperar(5000);
		menu.clicarPorTexto("›");
		
		Assert.assertTrue(menu.checaElementoTexto("Chegar até o fim!"));
		
		menu.swipeLeft();
		
		esperar(3000);
		menu.clicarPorTexto("‹");
		
		Assert.assertTrue(menu.checaElementoTexto("a esquerda"));
	}

}
