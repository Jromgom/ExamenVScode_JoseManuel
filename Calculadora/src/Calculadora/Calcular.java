
package Calculadora;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		
		System.out.println("Este programa realiza una calculadora simple");
	
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Introduzca el primer valor: ");
		double primerValor = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Introduzca el segundo valor: ");
		double segundoValor = Double.parseDouble(entrada.nextLine());

		System.out.println("El resultado de la suma es " + (primerValor + segundoValor));
		System.out.println("El resultado de la resta es " + (primerValor - segundoValor));
	}
}
