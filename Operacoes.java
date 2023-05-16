package AvFormativa;
import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, resultado;
		String operacao;
			
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextInt();
		
		System.err.println("Escolha entre: +, - e *");
		System.out.print("Que operação será utilizada?: ");
		operacao = ler.next();
		
		if(operacao.equals("+")) {
			resultado = valor1 + valor2;
			System.out.print("Resultado da soma é igual: " + resultado);
			System.exit(0);
		}
		
		if(operacao.equals("-")) {
			resultado = valor1 - valor2;
			System.out.print("Resultado da subtração é igual: " + resultado);
			System.exit(0);
		}
		
		if(operacao.equals("*")) {
			resultado = valor1 * valor2;
			System.out.print("Resultado da multiplicação é igual: " + resultado);
			System.exit(0);
		}
		
		ler.close();

	}

}
