package pl.sternik.zad8;

import java.util.Scanner;

public class Zadanie8 {
	
	public static void Wyswietl(int[][] tab){
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

								
		Scanner input = new Scanner(System.in);		
		System.out.println("Podaj wymiary: ");
		String string = input.nextLine();		
		String[] wymiary = string.split(" ");
		int[][] tablica = new int[wymiary.length][];
		for (int i=0; i<tablica.length; i++){
			tablica[i]=new int[Integer.valueOf(wymiary[i])];
			for (int j=0; j<tablica[i].length; j++){
				tablica[i][j] = j;
			}			
		}
		Wyswietl(tablica);
		
		
	}

}
