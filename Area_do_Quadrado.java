package AvFormativa;
import java.util.Scanner;

public class Area_do_Quadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int lado;
		
		System.out.print("Infome o comprimento do lado de um quadrado para saber sua área: ");
		lado = ler.nextInt();
		
		lado = lado * lado;
		
		System.out.println("A área do quadrado é igual a: " + lado);
		ler.close();
	}

}
