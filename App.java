/*
* File: App.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-02-16
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

import java.util.Scanner;
class App {
	
	public static void main (String[] args) {
		System.out.println("Santa Renata Diana, 2022-02-16, Szoft I N");
		System.out.println("Feladat 0306");
		System.out.println("Haromszog teruletszamitas");
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Alap: ");
		double alap = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terulet = (alap*magassag)/2;
		System.out.print("Terulet: " + terulet);
		
		
	}
}
