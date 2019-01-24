package premier_projet;

public class ExerciceTableau3 {

	public static void main(String[] args) {
		
		

		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 81, 89, 91 };

		int somme = 0;

		for (int i = 0; i < nombresPremiers.length; i++) {

			somme = somme + nombresPremiers[i];
			//System.out.println(somme);
		}

	
		
		int multiplication = 1;
		int nouvelleVariable = 1;

		for (int i = 0; i < nombresPremiers.length; i++) {
			
			if (nombresPremiers[i] % 7 == 0 ) {
				System.out.println( multiplication);
			
			
			
			multiplication = (multiplication * nombresPremiers[i]) + nouvelleVariable;

			}
			
		}
		
			System.out.println(multiplication);
		
		
			
		
		}
	

}
