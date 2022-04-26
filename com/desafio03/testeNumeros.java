package com.desafio03;

import java.io.IOException;
import java.util.Scanner;

public class testeNumeros {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		/*
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;*/
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Escreva o numero");
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if((num[i]%2 == 1) || (num[i]%2 == -1)) {
				impar++;
			}
			if(num[i]%2 == 0) {
				par++;
			}
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] < 0) {
				negativo++;
			}
			if(num[i] > 0) {
				positivo++;
			}
		}
		
		System.out.println(par + " par(es)");
		System.out.println(impar + " impar(es)");
		System.out.println(positivo + " positivo(s)");
		System.out.println(negativo + " negativo(s)");

	}

}
