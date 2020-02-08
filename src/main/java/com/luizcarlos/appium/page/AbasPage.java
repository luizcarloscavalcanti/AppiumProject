package com.luizcarlos.appium.page;

import com.luizcarlos.appium.core.BasePage;

public class AbasPage extends BasePage {

	public boolean isAba1() {
		return checaElementoTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean isAba2() {
		return checaElementoTexto("Este é o conteúdo da Aba 1");
	}
	
	
	public void clicarAba() {
		clicarPorTexto("ABA 2");
	}
	
}
