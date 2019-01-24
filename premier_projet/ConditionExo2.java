package premier_projet;

public class ConditionExo2 {

	public static void main(String[] args) {

		double prix = 120;

		double prixchoisi = 120;

		if (prix == prixchoisi) {
			System.out.println("bravo");
		}

		else if (prixchoisi > prix) {
			System.out.println("perdu c'est moins");
		}

		else if (prixchoisi < prix) {
			System.out.println("perdu c'est plus");
		}

	}

}
