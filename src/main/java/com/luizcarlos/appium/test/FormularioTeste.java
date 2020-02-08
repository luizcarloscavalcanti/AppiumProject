package com.luizcarlos.appium.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.FormularioPage;
import com.luizcarlos.appium.page.MenuPage;

import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();
	}

	@Test
	public void preencherTexto() throws MalformedURLException {

		page.escreverNome("Luiz Carlos");

		assertEquals("Luiz Carlos", page.obterNome());

	}

	@Test
	public void interagirCombo() throws MalformedURLException {

		page.selecionarCombo("Nintendo Switch");

		Assert.assertEquals("Nintendo Switch", page.obterValorCombo());

	}

	@Test
	public void interagirCheckboxSwitch() throws MalformedURLException {

		Assert.assertFalse(page.isCheckedMarcado());
		Assert.assertTrue(page.isSwitchMarcado());

		page.clicarCheck();
		page.clicarSwitch();

		Assert.assertTrue(page.isCheckedMarcado());
		Assert.assertFalse(page.isSwitchMarcado());

	}

	@Test
	public void resolverDesafio() throws MalformedURLException {

		page.escreverNome("Luiz Carlos");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("Nintendo Switch");

		page.salvar();

		Assert.assertEquals("Nome: Luiz Carlos", page.obterNomeCad());
		Assert.assertEquals("Console: switch", page.obterConsoleCad());
		Assert.assertTrue(page.obterSwitchCad().endsWith("Off"));
		Assert.assertTrue(page.obterCheckboxCad().endsWith("Marcado"));
	}

	@Test
	public void cadastroDemorado() throws MalformedURLException {
		page.escreverNome("Luiz Carlos");

		// DriverFactory.getDriver().manage().timeouts().implicitlyWait(0,
		// TimeUnit.SECONDS);
		page.salvarDemorado();
		// esperar(5000);
		// WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome:
		// Luiz Carlos']")));

		Assert.assertEquals("Nome: Luiz Carlos", page.obterNomeCad());

	}

	@Test
	public void alterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");

		Assert.assertTrue(page.checaElementoTexto("20/2/2000"));
	}

	@Test
	public void alterarHora() {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");

		Assert.assertTrue(page.checaElementoTexto("10:40"));
	}

	@Test
	public void interageSeekBar() {
		page.clicarSeek(0.67);

		page.salvar();
	}

}
