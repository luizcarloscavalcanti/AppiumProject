package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.AccordionPage;
import com.luizcarlos.appium.page.MenuPage;

public class AccordionTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void interagirAccordion() {
		menu.acessarAcordion();
		
		page.selecionarOp1();
		
		Assert.assertTrue(page.obterValorOp1());
	}

}
