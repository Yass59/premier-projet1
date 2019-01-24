package premier_projet;

public class ConditionExo1 {

	public static void main(String[] args) {

		int age = 17;

		if (age >= 18) {
			System.out.println("vous etes majeur");
		}

		if (age < 18) {
			System.out.println("vous etes mineur");
		}

		if (age == 17) {
			System.out.println("vous etes presque majeur");
		}

		double note = 10;

		if (note >= 15) {
			System.out.println("tb");
		}

		if (note >= 12 && note < 15) {
			System.out.println("bien");
		}

		if (note >= 10 && note < 12) {
			System.out.println("ab");
		}

		if (note >= 5 && note < 10) {
			System.out.println("mal");
		}

		if (note >= 0 && note < 5) {
			System.out.println("encourageant");
		}

		// && = et , || = ou, else if

		double argent = 15;

		if (argent >= 15) {
			System.out.println("tb");
		}

		else if (argent >= 12) {
			System.out.println("bien");
		}

		else if (argent >= 10) {
			System.out.println("ab");
		}

		else if (argent >= 5) {
			System.out.println("mal");
		}

		else if (argent >= 0) {
			System.out.println("encourageant");
		}

	}

}
