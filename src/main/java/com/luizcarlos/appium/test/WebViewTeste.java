package com.luizcarlos.appium.test;

import org.junit.After;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;
import com.luizcarlos.appium.page.WebViewPage;

public class WebViewTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void fazerLogin() {
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
		page.contextoWeb();
		
		page.setEmail("teste@testando.com.br");
		page.setPassword("123456");
		
		page.entrar();
		
		esperar(2000);
		page.verificaMsg();
	}
	
	@After
	public void tearDown() {
		page.sairContextoWeb();
	}

}
