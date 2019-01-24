package premier_projet;

import java.util.Scanner;

public class ExoMaison {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;

		System.out.println("Veuillez choisir un nombre 1");

		int nombre1 = sc.nextInt();



		if (nombre1 > max) {

			max = nombre1;

		}



		System.out.println("Veuillez choisir un nombre 2");

		int nombre2 = sc.nextInt();

		if (nombre2 > max) {

			max = nombre2;

		}

		System.out.println("Veuillez choisir un nombre 3");

		int nombre3 = sc.nextInt();



		if (nombre3 > max) {

			max = nombre3;

	}



		System.out.println(max + " est le nombre le plus grand ");



		
		
		
		
		
		
		
		
		
		
	
	}

}
