package premier_projet;

import java.util.Scanner;

public class ExerciceChaine4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String email = "";

		do {

			System.out.println("VEuillez saisir une adresse GMAIL : ");

			email = sc.nextLine();

		} while (!email.endsWith("@gmail.com") );

		System.out.println("Merci");
		
	}
		
		
		
	
		
		
		
		
		
		
	}


