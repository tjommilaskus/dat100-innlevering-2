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

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}

		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean ikkeLik = false;
		if (a.length != b.length) {
			return ikkeLik;
		}
			for (int i = 0; i < a.length; i++) {
				if (a[i].length != b[i].length) {
					return ikkeLik;
				}
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] != b[i][j]) {
						return ikkeLik;
					}
				}
		}
			return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {
	    int n = matrise.length;
	    int[][] speiletMatrise = new int[n][n];
	    
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            speiletMatrise[j][i] = matrise[i][j];
	        }
	    }
	    
	    return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int aRad = a.length;
	    int aKol = a[0].length;
	    int bRad = b.length;
	    int bKol = b[0].length;

	    if (aKol != bRad) {
	        throw new IllegalArgumentException("Kan ikke multiplisere");
	    }

	    int[][] result = new int[aRad][bKol];

	    for (int i = 0; i < aRad; i++) {
	        for (int j = 0; j < bKol; j++) {
	            for (int k = 0; k < aKol; k++) {
	                result[i][j] += a[i][k] * b[k][j];
	            }
	        }
	    }

	    return result;
	}


	}
