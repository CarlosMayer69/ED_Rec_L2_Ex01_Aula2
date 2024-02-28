/* 1. 
 * Criar uma função recursiva que receba 2 valores A e B e, 
 * por somas, apresente o resultado da multiplicação de A por B.
*/
 
package controller;
 
public class MultSomaRecController {
	public MultSomaRecController(){
		super();
	}
 
	public int multporsoma(int a, int b) {
		//Condição de Parada
		if(b == 0) {
			return 0;
		} else {
			return a + multporsoma(a, b - 1);
		}
	}
}
 

