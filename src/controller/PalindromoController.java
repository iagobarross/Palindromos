/*3. Considerando a biblioteca PilhaString, já criada, faça:
Criar um projeto Java (Palíndromos) e importe a biblioteca PilhaStrings. Esse novo projeto irá receber uma
cadeia de Strings do usuário e demonstrar para ele se essa palavra se trata ou não de um Palíndromo.
“Palíndromo é uma cadeia de caracteres que se lê da direita para a
esquerda e da esquerda para a direita e a sequência de caracteres é a
mesma, como em arara, ovo, subinoonibus, por exemplo.”

A classe PalindromoController no package controller deve ter 2 métodos:

• O método invertePalavra que recebe um String e retorna o String invertido. Os
métodos push(), pop(), isEmpty() devem ser usados para esse fim;
• O método comparaPalavras, que recebe o String, o String já invertido e retorna um
boolean (True para Palíndromo e False para Não Palíndromo)

A classe Principal, no package view, no seu método Main, deve exibir a possibilidade de o usuário inserir uma
cadeia de Strings e retornar a ele se é ou não um palíndromo.
*/
package controller;

import br.edu.fateczl.pilhaString.*;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	public String invertePalavra(String palavra) {
		String palavraInvertida = "" ;
		String [] vetor = palavra.split("");
		PilhaString p = new PilhaString();
		int tamanho = palavra.length();
		
		for(int i = 0; i < tamanho; i++) {
			p.push(vetor[i]);
		}
		
		while(!p.isEmpty()) {
			try {
				palavraInvertida += p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return palavraInvertida;
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if(palavra.equalsIgnoreCase(palavraInvertida)) {
			return true;
		}
		
		return false;
	}

}
