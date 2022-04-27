package com.estrutura_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite o nome do aluno:");
		nome = scan.next();
		
		System.out.println("Digite a idade do aluno:");
		idade = scan.nextInt();
		
		System.out.println("nome: " + nome + " idade: " + idade);

	}

}
