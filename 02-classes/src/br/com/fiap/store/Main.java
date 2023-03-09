package br.com.fiap.store;

public class Main {

	public static void main(String args[]) {
		
		Editora arqueiro = new Editora();
		
		arqueiro.nome = "Arqueiro";
		arqueiro.cnpj = "092.308.100/0001-09";
		arqueiro.endereco = "R. Eng. Albert Leimer, 300 - Jardim Sao Geraldo, Guarulhos - SP, 07140-020";
		
		Ebook ebook = new Ebook();
		
		ebook.editora = arqueiro;
	}
}
