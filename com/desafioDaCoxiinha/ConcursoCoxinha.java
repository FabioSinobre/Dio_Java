package com.desafioDaCoxiinha;

import java.util.Scanner;

public class ConcursoCoxinha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] inputSplit = input.split(" ");
		
		String coxinhas = inputSplit[0];
		String participantes = inputSplit[1];
		
		double media = Double.parseDouble(coxinhas)/Double.parseDouble(participantes);
		System.out.printf("%.2f", media );
	}

}
