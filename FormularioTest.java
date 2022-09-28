package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Formulario;
import pages.Metodos;

public class FormularioTest {
	
	Metodos metodos = new Metodos();
	Formulario form = new Formulario();
	
	
	@Dado("que eu esteja no formulario")
	public void que_eu_esteja_no_formulario() {
		metodos.abrirBrowser("file:///C:/Users/Think/Desktop/Semana%20piramide%20de%20teste/index.html");
	}

	@Quando("eu preencher e enviar o formulario")
	public void eu_preencher_e_enviar_o_formulario() throws IOException {
	   form.preencherFormulario("E2E Treinamentos", "e2etreinamentos@e2etreinamentos.com.br", "Semana da Piramide de Teste");
	}

	@Entao("sou direcionado para o site da escola")
	public void sou_direcionado_para_o_site_da_escola() {
	    metodos.validarTitle("E2E Treinamentos");
	}


}