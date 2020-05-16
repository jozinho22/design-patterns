package main;

import complexity.ConstantComplexity;
import complexity.ExponentialComplexity;
import complexity.LinearComplexity;
import complexity.LogarithmicComplexity;
import complexity.PolynomialeComplexity;
import complexity.recursivity.Factorielle;
import complexity.recursivity.Fibonacci;
import domain.Number;

public class Main {

	public static void main(String[] args) {

//		// Parcourir les 3 premiers �l�ments de la liste al�atoire de 10 nombres
//		ConstantComplexity.algorythm(10000, 150);
//
//		// Parcourir tous les �l�ments de la liste
//		LinearComplexity.algorythm(10000);
//
//		// Cherche un nombre place 150 dans la liste ordonn�e de 10 000 nombres
//		LogarithmicComplexity.algorythm(10000, 150);
//
		// Parcourir tous les �l�ments de deux boucles imbriqu�es
		PolynomialeComplexity.algorythm(100);
		PolynomialeComplexity.algorythm(1000);
		PolynomialeComplexity.algorythm(10000);
		PolynomialeComplexity.algorythm(100000);
		PolynomialeComplexity.algorythm(1000000);

//
//		ExponentialComplexity.algorythm(10000);
//
//		System.out.println(Fibonacci.fibonacci(9));
//		;
//		Factorielle.factorielle(5);
	}

}
