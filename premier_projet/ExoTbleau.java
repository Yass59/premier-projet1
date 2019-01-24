package premier_projet;

import java.util.Scanner;

public class ExoTbleau {

	public static void main(String[] args) {
		
		
		
		
		
		


			Scanner sc = new Scanner(System.in);

			System.out.println("Veuillez saisir un  nombre");

			int nombre = sc.nextInt();

			int produit = factorielle(nombre);

			System.out.println("Factorielle : " + produit);// 120

		}



		public static int factorielle(int n) {

			int produit = 1;

			for (int i = n; i > 0; i--) {

				produit = produit * i;

			}

			return produit;

		}
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

		
		
		
		
		
		
		
		
		
		

	


