package AvFormativa;

public class Bingo {

	public static void main(String[] args) {
		
		int nmrbingo[] = new int[20];
		
		for(int i = 0; i < 20; i++) {
		nmrbingo[i] = (int)(Math.round(Math.random()*(100)));
		System.out.println("O " + i + "º número é: " + nmrbingo[i]);	
		}
	}
}