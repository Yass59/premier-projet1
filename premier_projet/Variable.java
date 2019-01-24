package premier_projet;

public class Variable {

	public static void main(String[] args) {
		// <type_de_la_variable> <nom_de_la_variable> = <valeur>;

		// declaration
		// <type_de_la_variable> <nom_de_la_variable>;

		// affectation
		// <nom_de_la_variable> = <valeur>;

		// declaration
		String nom;

		// affectation
		nom = "jack";

		// declaration + affectation
		String prenom = "john";

		System.out.println(nom);

		System.out.println(prenom);

		// afficher -> nom prenom

		System.out.println(nom + "  " + prenom + ".");

		nom = "un autre nom";

		System.out.println(nom);

		short nombrePetit;
		nombrePetit = 12;

		System.out.println(nombrePetit);
		System.out.println(nombrePetit + 14);

		int nombreGrand = 145;

		System.out.println(nombreGrand * 12);

		nombreGrand = 125896;

		System.out.println(nombreGrand / 2);
		System.out.println(nombreGrand - 10000);
		System.out.println(nombreGrand);

		long nombreTropGrand = 12457869;

		System.out.println(nombreTropGrand + nombreGrand);
		System.out.println(nombreTropGrand * nombrePetit * nombreGrand);

		long coordoneeSpace = 120120120120l;

		System.out.println(coordoneeSpace);

		double tva = 20.0;

		System.out.println(tva * 20);

		float taxe = 33.5f;

		System.out.println(taxe * 15);

		// aficher tva * prix = valeur

		int prix = 100;

		System.out.println(tva + "*" + prix + "=" + (tva * prix));

		short longueur = 10000;
		short largeur = 1000;

		System.out.println("l * L =" + (longueur * largeur));

		float entier1 = 8f;
		int entier2 = 5;

		System.out.println(entier1 / entier2);

		int a = 2;
		double b = 10;
		int c = 10;

		System.out.println(c / (a / b));

		int somme = 1;
		somme = 2;
		System.out.println(somme);
		somme = 12 + 10;
		System.out.println(somme);
		somme = somme + 10;
		System.out.println(somme);
		somme = somme - 5;
		System.out.println(somme);

		// char
		char z = 'f';
		System.out.println(z);

		// boolean

		boolean faux = false;
		System.out.println(faux);
		boolean vrai = true;

		boolean k = (somme >= 27);
		System.out.println(somme);
		System.out.println();

	}

}
