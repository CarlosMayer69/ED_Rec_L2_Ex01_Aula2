/* 1. 
 * Criar uma fun��o recursiva que receba 2 valores A e B e, 
 * por somas, apresente o resultado da multiplica��o de A por B.
*/
 
package controller;
 
public class MultSomaRecController {
	public MultSomaRecController(){
		super();
	}
 
	public int multporsoma(int a, int b) {
		//Condi��o de Parada
		if(b == 0) {
			return 0;
		} else {
			return a + multporsoma(a, b - 1);
		}
	}
}
 

