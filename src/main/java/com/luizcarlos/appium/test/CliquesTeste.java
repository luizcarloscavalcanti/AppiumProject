package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.CliquesPage;
import com.luizcarlos.appium.page.MenuPage;


public class CliquesTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	public void setuo() {
		menu.acessarCliques();
	}
	
	@Test
	public void realizaCliqueLongo() {
		
		page.cliqueLongo();
		
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test
	public void realizaCliqueDuplo() {
		
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
		
	}

}
