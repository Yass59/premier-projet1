package premier_projet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NouvelleExo {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);



	int prix = ThreadLocalRandom.current().nextInt(0,100);

	int prixChoisi = 0;



	do {

		System.out.println("Veuillez choisir un prix :");

		prixChoisi = sc.nextInt();

		if (prixChoisi == prix) {

			System.out.println("Bravo, vous avez gagné !");

		} else if (prixChoisi > prix) {

			System.out.println("Perdu c'est moins !");

		} else if (prixChoisi < prix) {

			System.out.println("Perdu, c'est plus !");

		}



	} while (prixChoisi != prix);



}

}

