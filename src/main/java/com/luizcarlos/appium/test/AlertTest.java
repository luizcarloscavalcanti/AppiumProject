package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.AlertaPage;
import com.luizcarlos.appium.page.MenuPage;

public class AlertTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();

	@Test
	public void confirmaAlerta() {
		menu.acessarAlertas();

		page.clicarAlertasConfirm();

		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterMsgAlerta());

		page.confirmar();

		Assert.assertEquals("Confirmado", page.obterMsgAlerta());

		page.sair();
	}

	@Test
	public void clicaForaAlerta() {
		menu.acessarAlertas();

		page.clicarAlertaSimples();

		esperar(1000);
		page.clicarForaCaixa();

		Assert.assertFalse(page.checaElementoTexto("Pode clicar no OK ou fora da caixa para sair"));
	}

}
