package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] t : matrise) {
			for (int[] i : matrise) {
				System.out.println(t);
				System.out.println(i);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder();
		for (int[] rad : matrise) {

			for (int i : rad) {
				sb.append(i + " ");
			}
			sb.append("\n");
		}
		String tableAsString = sb.toString();

		return tableAsString;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise [i][j] = matrise[i][j]*tall;
			}
			
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
