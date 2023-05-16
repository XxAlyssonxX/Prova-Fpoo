package AvFormativa;

import java.util.Scanner;

public class Fahrenheit_em_Celcius {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celcius = 0, fahrenheit;
		
		System.out.print("Informe os graus em fahrenheit: ");
		fahrenheit = ler.nextDouble();
		
		celcius = ((fahrenheit - 32)*5)/9;
		
		System.out.println("A conversão em celcius é igual a " + celcius + " º");
		ler.close();
	}

}
