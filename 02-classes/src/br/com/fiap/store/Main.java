package br.com.fiap.store;


public class Main {

	public static void main(String args[]) {
		
		Editora arqueiro = new Editora();
		
		arqueiro.nome = "Arqueiro";
		arqueiro.cnpj = "092.308.100/0001-09";
		arqueiro.endereco = "R. Eng. Albert Leimer, 300 - Jardim Sao Geraldo, Guarulhos - SP, 07140-020";
		
		Ebook harryPotter = new Ebook();
		
		harryPotter.editora = arqueiro;
		harryPotter.genero = "Aventura";
		harryPotter.idioma = "Ingles";
		harryPotter.isbn = "47851175413";
		harryPotter.nome = "Harry Potter e o enigma do principe";
		harryPotter.quantidadePaginas = 500;
		harryPotter.rating = 5;
		harryPotter.resumo = "Menino mágico";
		harryPotter.valor = 49.90;

		System.out.println(harryPotter.nome);

		System.out.println(harryPotter.valor);
		
		System.out.println(harryPotter.editora.nome);
	}
}
