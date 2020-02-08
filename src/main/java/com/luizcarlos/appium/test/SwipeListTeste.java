package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;
import com.luizcarlos.appium.page.SwipeListPage;

public class SwipeListTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void desafioSwipeList() {
		
		menu.acessarSwipeList();
		
		page.swipeElementRight("Op��o 1");
	
		page.clicarPorTexto("(+)");
		Assert.assertTrue(page.checaElementoTexto("Op��o 1 (+)"));
		
		page.swipeElementRight("Op��o 4");
		page.clicarPorTexto("(-)");
		Assert.assertTrue(page.checaElementoTexto("Op��o 4 (-)"));
		
		page.swipeElementLeft("Op��o 5");
		Assert.assertTrue(page.checaElementoTexto("Op��o 5"));
	}

}
