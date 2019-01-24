package premier_projet;

public class Conditionexo3 {

	public static void main(String[] args) {

		double noteJava = 10;
		double noteSql = 15;
		double noteHtml = 11.2;
		double noteJavascript = 5.5;

		int coefJava = 5;
		int coefSql = 2;
		int coefHtml = 1;
		int coefJavascript = 3;

		double moyenne1 = ((noteJava * coefJava) + (noteSql * coefSql) + (noteHtml * coefHtml)
				+ (noteJavascript * coefJavascript)) / ((coefJava + coefSql + coefHtml + coefJavascript));

		System.out.println("la moyenne : " + moyenne1);

		int sommeCoef = coefJava + coefSql + coefHtml + coefJavascript;

		double resultatJava = noteJava * coefJava;

		double resultatSql = noteSql * coefSql;

		double resultatHtml = noteHtml * coefHtml;

		double resultatJavascript = noteJavascript * coefJavascript;

		double sommeResultat = resultatJava + resultatSql + resultatHtml + resultatJavascript;

		double moyenne = sommeResultat / sommeCoef;

		System.out.println("la moyenne : " + moyenne);

		//

		if (moyenne >= 8 && moyenne < 10) {
			System.out.println("ra");
		}

		else if (moyenne >= 10 && moyenne <= 12) {
			System.out.println("bien");
		}

		else if (moyenne > 12 && moyenne <= 15) {
			System.out.println("assb");
		}

		else if (moyenne > 12 && moyenne <= 15) {
			System.out.println("bien");
		}

		else if (moyenne > 15 && moyenne <= 20) {
			System.out.println("tb");
		}

		else {
			System.out.println("a l'annee prochaine");
		}
		//

		if (moyenne < 10 && noteJava >= 10) {
			System.out.println("conseil de classe");
		}

		//

		if ((moyenne >= 8 && moyenne < 10)
				&& (noteJava >= 15 || noteSql >= 15 || noteHtml >= 15 || noteJavascript >= 15)) {
			System.out.println("alors il passe");
		}

		// moyenne au dessus de 15

		if ((moyenne >= 15) && (noteJava >= 15 || noteSql >= 15 || noteHtml >= 15 || noteJavascript >= 15)) {
			System.out.println("felicitation");
		}

		//

		boolean moyenne17 = (moyenne >= 17);

		boolean uneDesNotesEstSupA15 = (noteJava > 15 || noteHtml > 15 || noteSql > 15 || noteJavascript > 15);

		if (moyenne17 && uneDesNotesEstSupA15) {

			System.out.println("felicitation");

		}

	}

}
