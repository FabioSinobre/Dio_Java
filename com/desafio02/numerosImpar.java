package com.desafio02;

import java.io.IOException;
import java.util.Scanner;

public class numerosImpar {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor\n");
		int x = sc.nextInt();
		int cont = 0;
		
		while(cont < 6) {
			if(x%2 == 1 ) {
				System.out.println(x);
				x += 2;
			}else {
				x = x + 1;
				System.out.println(x);
				x += 2;
			}
			cont++;
		}
	}

}
