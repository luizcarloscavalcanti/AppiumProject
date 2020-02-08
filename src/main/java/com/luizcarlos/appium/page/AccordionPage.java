package com.luizcarlos.appium.page;

import com.luizcarlos.appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOp1() {
		clicarPorTexto("Opção 1");
	}
	
	public boolean obterValorOp1() {
		return checaElementoTexto("Esta é a descrição da opção 1");
	}

}
