package premier_projet;

public class WhileBoucle {

	public static void main(String[] args) {

		System.out.println("Début");

		int cpt = 1;

		while (cpt <= 10) {

			System.out.println("Bonjour " + cpt);

			cpt++;

			// equivalent cpt = cpt + 1;

		}

		int cpt2 = 10;

		while (cpt2 >= 1) {

			System.out.println("yas " + cpt2);

			cpt2--;

			// equivalent cpt2 = cpt2-1

		}

		System.out.println("Fin");

// il faut incrémenter un compteur pour sortir de la boucle

	}

}
