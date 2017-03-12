package pl.sternik.zad7;

import java.util.Scanner;

public class Zadanie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Podaj liczbe x: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % x == 0) {
				System.out.println("FOR: " + tab[i] + " jest podzielna przez " + x + " i znajduje sie na pozycji " + i);
				break;
			}
		}
		int i = 0;
		while (tab[i] % x != 0) {
			i++;
		}
		System.out.println("WHILE: " + tab[i] + " jest podzielna przez " + x + " i znajduje sie na pozycji " + i);
	}

}
