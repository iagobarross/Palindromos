package view;

import java.util.Scanner;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController palinCont = new PalindromoController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		String palavraInvertida = palinCont.invertePalavra(palavra);
		System.out.println(palinCont.comparaPalavras(palavra, palavraInvertida));
		
	}

}
