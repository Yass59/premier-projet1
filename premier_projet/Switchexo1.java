package premier_projet;

public class Switchexo1 {

	public static void main(String[] args) {

		int mois = 13;

		switch (mois) {
		case 1:
			System.out.println("janvier");
			break;
		case 2:
			System.out.println("fevrier");
			break;
		case 3:
			System.out.println("mars");
			break;

		case 4:
			System.out.println("avril");
			break;
		case 5:
			System.out.println("mai");
			break;
		case 6:
			System.out.println("juin");
			break;

		case 7:
			System.out.println("juillet");
			break;
		case 8:
			System.out.println("aout");
			break;
		case 9:
			System.out.println("septembre");
			break;
		case 10:
			System.out.println("octobre");
			break;

		case 11:
			System.out.println("novembre");
			break;
		case 12:
			System.out.println("decembre");
			break;
		default:
			System.out.println("impossible");
		}

		String nommois = "marfjs";

		switch (nommois) {
		case "janvier":
			System.out.println("01");
			break;
		case "fevrier":
			System.out.println("02");
			break;
		case "mars":
			System.out.println("03");
			break;
		case "avril":
			System.out.println("04");
			break;
		case "mai":
			System.out.println("05");
			break;
		case "juin":
			System.out.println("06");
			break;
		case "juillet":
			System.out.println("07");
			break;
		case "aout":
			System.out.println("08");
			break;
		case "septembre":
			System.out.println("09");
			break;
		case "octobre":
			System.out.println("10");
			break;
		case "novembre":
			System.out.println("11");
			break;
		case "decembre":
			System.out.println("12");
			break;
		default:
			System.out.println("le mois n'existe pas");
		}

	}

}
