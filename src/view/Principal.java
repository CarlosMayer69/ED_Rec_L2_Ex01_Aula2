package view;
 
import controller.MultSomaRecController;
 
public class Principal {
 
	public static void main(String[] args) {
		MultSomaRecController mps = new MultSomaRecController();
 
		int a = 2;
		int b = 5;
		int multporsoma = mps.multporsoma(a, b);
		System.out.println(multporsoma);
	}
 
}