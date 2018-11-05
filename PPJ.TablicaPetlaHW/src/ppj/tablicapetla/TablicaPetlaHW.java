package ppj.tablicapetla;

import java.util.Scanner;

public class TablicaPetlaHW {

	public static void main(String[] args) {

		int i, j, a;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		a = odczyt.nextInt();
		int tablica[][] = new int[a][a];
		for (i = 0; i < tablica.length; i++) {
			for (j = 0; j < tablica.length; j++) {
				tablica[i][j] = j;
				System.out.print(tablica[i][j] + "  ");
				if (i == j)	
				break;
			}
			System.out.println();
		}

	}

}
