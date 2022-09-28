package pages;

import java.io.IOException;

import elementos.Elementos;

public class Formulario {
	
	
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	public void preencherFormulario(String nome, String email, String mensagem) throws IOException {
		
		metodos.escrever(elemento.getNome(), nome);
		metodos.escrever(elemento.getEmail(), email);
		metodos.escrever(elemento.getMsg(), mensagem);
		metodos.screenshot("CT01 - enviarFormulario");
		metodos.clicar(elemento.getBtnEnviar());
		
	}

}