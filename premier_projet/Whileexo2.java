package premier_projet;

public class Whileexo2 {

	public static void main(String[] args) {

		int compteur = 9;

		while (compteur < 10) {

			if (compteur == 1) {

				System.out.println("Bravo c'est 1");

				compteur++;

			} else if (compteur == 3) {

				System.out.println("Bravo c'est 3");

				compteur++;

			} else if (compteur == 5) {

				System.out.println("Bravo c'est 5");

				compteur++;
			}

			else if (compteur == 7) {

				System.out.println("Bravo c'est 7");

				compteur++;
			}

			else if (compteur == 9) {

				System.out.println("Bravo c'est 9");

				compteur++;
			}

			else {

				System.out.println("il n'es pas impair");

				compteur++;
			}
		}

		int compteur1 = 0;
		while (compteur1 <= 10) {
			if (compteur1 % 2 == 0) {
				System.out.println(compteur1 + " est pair");
			} else {
				System.out.println(compteur1 + " est impair");
				compteur1++;

			}
		}

	}

}
