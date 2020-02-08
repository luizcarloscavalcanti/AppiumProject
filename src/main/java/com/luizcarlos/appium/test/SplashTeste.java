package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;
import com.luizcarlos.appium.page.SplashPage;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void aguardaSplasSumir() {	
		menu.acessarSplash();
		
		page.isTelaSplashVisivel();
		
		Assert.assertTrue(page.checaElementoTexto("Formulário"));
	}

}
