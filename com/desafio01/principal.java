package com.desafio01;

import java.io.IOException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int n = 1;
		double soma = 0;
		
		while(n >= 1){
			System.out.println("Digite a idade!");
			n = sc.nextInt();
			if(n > 0) {
				soma += n;
				cont++;
			}
		}
		double media = soma / cont;
		System.out.println(String.format("%.2f", media));
	}

}
