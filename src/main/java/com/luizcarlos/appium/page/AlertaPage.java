package com.luizcarlos.appium.page;

import com.luizcarlos.appium.core.BasePage;

public class AlertaPage extends BasePage {
	
	public void clicarAlertasConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}

	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}

	public void sair() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarForaCaixa() {
		tap(200, 300);
	}
}
