package premier_projet;

public class ExerciceTableauPrenom {

	public static void main(String[] args) {
		String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",

				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

			// Afficher tous les prénoms

			for (int i = 0; i < prenoms.length; i++) {

				System.out.println(prenoms[i]);

			}

			System.out.println("------------------------------------------------------");

			// Afficher le message

			// Laurent existe dans la liste

			// si c'est le cas



			// 1. parcourir mon tableau

			// 2. si une des valeurs = 'laurent'

			// Afficher => Laurent existe dans la liste



			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].equals("Laurence")) {

					System.out.println("Laurence existe dans le tableau");

				}

			} // FIN boucle

			System.out.println("------------------------------------------------------");



			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].startsWith("L")) {

					System.out.println(prenoms[i]);

				}

			} // FIN boucle

			System.out.println("------------------------------------------------------");



			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].endsWith("e")) {

					System.out.println(prenoms[i]);

				}



			} // FIN boucle


			System.out.println("------------------------------------------------------");

		
			for (int i = 0; i < prenoms.length; i++) {

				if (!prenoms[i].contains("a")&& !prenoms[i].contains("A")) {
				
					System.out.println(prenoms[i]);

				}


			}
			
		
		
			System.out.println("------------------------------------------------------");
		
		
		
		
			for (int i = 0; i < prenoms.length; i++) {

				String nomM = prenoms[i].toUpperCase();

				if (!nomM.contains("A")) {

					System.out.println(prenoms[i]);

				}

			}
		
			
			
			System.out.println("------------------------------------------------------");
			
			
			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].endsWith("e")); {
					
					
					
					System.out.println(prenoms[i].substring(0,3));

				}



			}
		
			System.out.println("------------------------------------------------------");
			
			
			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].equals("Laurent")) {

					System.out.println("Laurent existe");}
					
					else if (!prenoms[i].equals("Laurent")) {
						System.out.println("laurent n'existe pas");
						
						
						
						
				}

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
