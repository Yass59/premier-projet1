package premier_projet;

public class ExerciceChainedeCaractére {

	public static void main(String[] args) {

		String chaine = "hello";

		String nom = "JACK";



		if (chaine.equals(nom)) {

			System.out.println("Les deux chaines sont identiques");

		}



		String chaineMaj = chaine.toUpperCase();

		System.out.println(chaineMaj);



		String nomMin = nom.toLowerCase();

		System.out.println(nomMin);



		System.out.println(nom);



		nom = "John";

		System.out.println(nom);



		if (!nom.equals(chaine)) {

			System.out.println("cool ");

		}

		chaine = "     bonjour                   ";

		System.out.println(chaine);

		String s = chaine.trim();

		System.out.println(s);



		// Comparaison

		// EQ

		// chaine1.equals(chaine2)

		// NOT EQ

		// !chaine1.equals(chaine2)

		// mettre en MAJ

		// chaine.toUpperCase()

		// chaine.toLowerCase

		// Supprimer les esopaces avant et après

		// chaine.trim()
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
