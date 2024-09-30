package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		System.out.println(Arrays.toString(tabell).replace(" ", ""));
		return Arrays.toString(tabell).replace(" ", "");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int s : tabell) {
			sum += s;
		}
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for (int t : tabell) {
			if (t == tall) {
				finnes = true;
			}
			
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int i = 0;
		for (i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
	}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] rTabell = new int [tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			rTabell[i] = tabell[tabell.length - 1 -i]; 
		}
		return rTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int t = 0; t < tabell.length-1; t++ ) {
			if (tabell[t] >= tabell[t+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int i = 0;
		int [] tabell3 = new int [tabell1.length + tabell2.length];
		
		for (i = 0; i < tabell1.length; i++) {
			tabell3[i] = tabell1[i];
		}
		for (i = 0; i < tabell2.length; i++) {
			tabell3[tabell1.length + i] = tabell2[i];
		}
		return tabell3;
	}
}
