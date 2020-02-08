package com.luizcarlos.appium.page;

import static com.luizcarlos.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.luizcarlos.appium.core.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class SeuBarrigaNativoPage extends BasePage {

	public void escreverEmail(String nome) {
		escrever(By.xpath("//*[@text='Nome']"), nome);
	}

	public void escreverSenha(String senha) {
		escrever(By.xpath("//*[@text='Senha']"), senha);
	}

	public void escreverConta(String conta) {
		escrever(By.xpath("//*[@text='Conta']"), conta);
	}

	public void btnEntrar() {
		clicarPorTexto("ENTRAR");
	}

	public void clicarContas() {
		clicarPorTexto("CONTAS");
	}

	public void clicarMovimentacao() {
		clicarPorTexto("MOV...");
	}

	public void salvarConta() {
		clicarPorTexto("SALVAR");
	}

	public void excluirConta() {
		clicarPorTexto("EXCLUIR");
	}
	
	public void clicarResumo() {
		clicarPorTexto("RESUMO");
	}
	
	public void clicarHome() {
		clicarPorTexto("HOME");
	}

	public void cliqueLongo() {
		new TouchAction<>(getDriver())
				.longPress(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Conta Teste']"))))
				.perform();
	}

	public void setDescricao(String desc) {
		escrever(By.className("android.widget.EditText"), desc);
	}

	public void setInteressado(String interessado) {
		escrever(By.xpath("//android.widget.EditText[2]"), interessado);
	}

	public void setValor(String valor) {
		escrever(By.xpath("//android.widget.EditText[3]"), valor);
	}

	public void setConta(String conta) {
		selecionarCombo(By.xpath("//android.widget.Spinner[2]"), conta);
	}

	public String obterSaldoConta(String conta) {
		return obterTexto(By.xpath("//*[@text='" + conta + "']/following-sibling::android.widget.TextView"));
	}
	
	public void excluirMovimentacao(String desc) {
		MobileElement el = getDriver().findElement(By.xpath("//*[@text='"+desc+"']/.."));
		swipeElement(el, 0.9, 0.1);
		clicarPorTexto("Del");
	}
}
