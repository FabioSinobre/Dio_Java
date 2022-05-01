package com.copa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//(consume<? super String>) : void
public class desafioCopa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * quantidade máxima
		 * quantidade comprada
		 * lista
		 */
		
		int numTotal = scan.nextInt();//quantidade máxima de figurinhas no album
		int numFigCompradas = scan.nextInt();//numero de figurinhas compradas
		
		Set<Integer> setFig = new HashSet<>();// lista descarta elementos repetidos 
		
		/*for(int i = 0; i < numTotal; i++) {
			numFigCompradas.add(scan.nextInt());
		}*/
		
		for(int i = 0; i < numFigCompradas; i++) {
			setFig.add(scan.nextInt());
		}
		
		int faltam = numTotal - setFig.size();
		System.out.println(faltam);
	}

}
