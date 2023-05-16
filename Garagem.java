package AvFormativa;
import java.util.Scanner;

public class Garagem {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String cars[] = new String[6];
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite qual é o carro que ira ser guardado: ");
			cars[i] = ler.nextLine();
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("O carro " + cars[i] + " foi guardadado na garagem " + i);
		}
		ler.close();
	}
}
