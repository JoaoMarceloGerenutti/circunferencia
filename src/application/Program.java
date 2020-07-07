package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double raio = sc.nextDouble();
		
		double cir = Calculator.circunferencia(raio);
		
		double vol = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", cir);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("Valor do PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
}
