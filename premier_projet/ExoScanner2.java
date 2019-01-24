package premier_projet;

import java.util.Scanner;

public class ExoScanner2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir note java:");

		double noteJava = sc.nextDouble();

		System.out.println("Veuillez saisir note html");

		double noteHtml = sc.nextDouble();
		
		System.out.println("Veuillez saisir note javascript");

		double noteJavascript = sc.nextDouble();
		
		
		System.out.println("Veuillez saisir note sql");

		double noteSql = sc.nextDouble();
		
		double moyenne = (noteJava + noteHtml + noteJavascript + noteSql) / 4;
	
		System.out.println("votre moyenne =" + moyenne);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
