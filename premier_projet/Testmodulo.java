package premier_projet;

public class Testmodulo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Hello " + i);

		}

		int compteur1 = 1;

		while (compteur1 <= 100) {

			if (compteur1 % 7 == 0) {

				System.out.println(compteur1);

			}

			compteur1++;
		}

	}

}
