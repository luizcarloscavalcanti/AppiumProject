package com.luizcarlos.appium.page;

import static com.luizcarlos.appium.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

import com.luizcarlos.appium.core.BasePage;

public class WebViewPage extends BasePage {
	
	public void contextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		//for(String valor : contextHandles) {
		//	System.out.println(valor);
		//}
		getDriver().context((String) contextHandles.toArray()[1]);
	}
	
	public void setEmail(String valor) {
		getDriver().findElement(By.id("email")).sendKeys(valor);
	}
	
	public void setPassword(String valor) {
		getDriver().findElement(By.id("senha")).sendKeys(valor);
	}
	
	public void sairContextoWeb() {
		getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
	}
	
	public void entrar() {
		clicar(By.xpath("//button[@type='submit']"));
	}
	
	public String verificaMsg() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

}
