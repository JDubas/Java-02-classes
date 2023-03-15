package br.com.fiap.store;
import java.util.*;
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double nota1,nota2,nota3;
		double notaC, notaGS;
		double media,mediaF;
		// notaC peso 2 notaGS peso 6 NotaCP peso 2
		String nome;
		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		System.out.println("Digite sua nota do primeiro CP: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite sua nota do segundo CP: ");
		nota2 = entrada.nextDouble(); 
		System.out.println("Digite sua nota do terceiro CP: ");
		nota3 = entrada.nextDouble(); 
		System.out.println("Digite sua nota do Challenge: ");
		notaC = entrada.nextDouble(); 
		System.out.println("Digite sua nota do Global Solution: ");
		notaGS = entrada.nextDouble(); 
		media = (nota1 + nota2 + nota3)/3;
		//System.out.println(nome + " sua media é: " + String.format("%.2f", media));
		
		if ((nota1 <= nota2) & (nota1 <= nota3)){
			media = (nota2 + nota3)/2;
		}else if ((nota2 <= nota1) & (nota2 <= nota3)) {
			media = (nota1 + nota3)/2;
		}else {
			media = (nota1 + nota2)/2;
		}
		//System.out.println(nome + " mas verdadeira media é: " + String.format("%.2f", media));

		media *= 0.20;
		notaC *= 0.20;
		notaGS *= 0.6;
		mediaF = media + notaC + notaGS;
		System.out.println(nome + " sua média é: " + mediaF );
		
		//		int alunos, grupos;
//	    int resto;
		
//		alunos = entrada.nextInt();
//		grupos = alunos / 5;
//		resto = alunos % 5;
//		if (resto == 0) {
//			System.out.println("Formam " + grupos + " grupo"); 
//		}else if (resto == 1) {
//			System.out.println("Formam " + grupos + " e 1 fica de fora");
//		}else {
//		System.out.println("Formam " + grupos + " grupos e " + resto + " ficam de fora");
//		}
	}

}
