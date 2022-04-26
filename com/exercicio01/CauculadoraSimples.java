package com.exercicio01;

import java.util.Scanner;

public class CauculadoraSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] valor = new double[2];
		int menu = 0;
		System.out.println("Digite 1 para soma, 2 para subtracao, 3 para multiplicação e 4 para divisao!");
		menu = sc.nextInt();
		if(menu == 1) {
			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o numero");
				valor[i] = sc.nextDouble();
			}
			somar(valor[0], valor[1]);
		}
		else if(menu == 2) {
			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o numero");
				valor[i] = sc.nextDouble();
			}
			subtrair(valor[0], valor[1]);
		}
		else if(menu == 3) {
			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o numero");
				valor[i] = sc.nextDouble();
			}
			multiplicar(valor[0], valor[1]);
		}
		else{
			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o numero");
				valor[i] = sc.nextDouble();
			}
			dividir(valor[0], valor[1]);
		}
		
		

	}

	public static void somar(double a, double b) {
		double soma = a + b;
		System.out.println(soma);
	}

	public static void subtrair(double a, double b) {
		double subtrai = a - b;
		System.out.println(subtrai);
	}

	public static void multiplicar(double a, double b) {
		double multiplica = a * b;
		System.out.println(multiplica);
	}

	public static void dividir(double a, double b) {
		double divide = a / b;
		System.out.println(divide);
	}

}
