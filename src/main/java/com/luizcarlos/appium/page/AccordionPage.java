package com.luizcarlos.appium.page;

import com.luizcarlos.appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOp1() {
		clicarPorTexto("Op��o 1");
	}
	
	public boolean obterValorOp1() {
		return checaElementoTexto("Esta � a descri��o da op��o 1");
	}

}
