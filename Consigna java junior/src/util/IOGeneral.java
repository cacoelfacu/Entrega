package util;

import java.util.Scanner;





public class IOGeneral {

	public static void pritln(String frase){
		System.out.println(frase);
	}
	
	public static int leerInt(String msjInicio, String msjError){
		IOGeneral.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()){
			IOGeneral.pritln(msjError);
			scan.next();
		}
		return scan.nextInt();
	}
	
	public static String leerLinea(String msjInicio){
		IOGeneral.pritln(msjInicio);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
}
