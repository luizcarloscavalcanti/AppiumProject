package com.luizcarlos.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.luizcarlos.appium.core.BaseTest;
import com.luizcarlos.appium.page.MenuPage;
import com.luizcarlos.appium.page.SeuBarrigaNativoPage;

public class SeuBarrigaNativoTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SeuBarrigaNativoPage page = new SeuBarrigaNativoPage();
	
	@Before
	public void start() {
		menu.acessarSeuBarrigaNativo();
		
		page.escreverEmail("teste@testando.com");
		page.escreverSenha("123456");
		page.btnEntrar();
	}
	
	@Test
	public void insereConta() {
		esperar(2000);
		page.clicarContas();
		
		page.escreverConta("Conta Teste");
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Conta adicionada com sucesso"));
	
	}
	
	@Test
	public void deletaConta() {
		esperar(2000);
		page.clicarContas();
		
		page.cliqueLongo();
		page.excluirConta();
		Assert.assertTrue(page.checaElementoTexto("Conta excluída com sucesso"));
	}
	
	@Test
	public void incluiMovimentacao() {
		page.clicarMovimentacao();
		
		esperar(2000);
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Descrição é um campo obrigatório"));
		
		page.setDescricao("Desc");
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Interessado é um campo obrigatório"));
		
		page.setInteressado("interess");
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Valor é um campo obrigatório"));
		
		page.setValor("123");
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Conta é um campo obrigatório"));
		
		page.setConta("Conta para alterar");
		page.salvarConta();
		Assert.assertTrue(page.checaElementoTexto("Movimentação cadastrada com sucesso"));
		
	}
	
	@Test
	public void atualizaSaldoMovimentacao() {
	
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
		
		page.clicarResumo();
		
		page.excluirMovimentacao("Movimentacao 3, calculo saldo");
		
		Assert.assertTrue(page.checaElementoTexto("Movimentação removida com sucesso!"));
		
		page.clicarHome();
		
		esperar(1000);
		page.scroll(0.2, 0.9);
		
		Assert.assertEquals("-1000.00", page.obterSaldoConta("Conta para saldo"));
	}

}
