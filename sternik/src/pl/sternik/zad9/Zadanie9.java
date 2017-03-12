package pl.sternik.zad9;

import java.util.Scanner;

public class Zadanie9 {
	public static void Wyswietl(int[][] tab){
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				System.out.print(tab[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int [][] Zamien(int[][] tab, int a, int b){
		int[][] temp = new int[4][4];
		for(int i=0; i<temp.length; i++){
			for(int j=0; j<temp[i].length; j++){
				if (a-1==i){
					temp[i][j]=tab[b-1][j];					
				} else if (b-1==i){
					temp[i][j]=tab[a-1][j];	
				} else temp[i][j]=tab[i][j];								
			}
		}
		return temp;
	}
	public static int [][] Zamien2(int[][] tab, int a, int b){
		int[] tmp1, tmp2;
		tmp1 = tab[a];
		tmp2 = tab[b];
		tab[a] = tmp2;
		tab[b] = tmp1;
		return tab;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tab = new int[4][4];
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab[i].length; j++){
				tab[i][j]=i+j;
				
			}
		}
		Wyswietl(tab);
		Scanner input = new Scanner(System.in);		
		System.out.println("Które wiersze chcesz zamieniæ?");
		int a = input.nextInt();
		int b = input.nextInt();
		
		//Zamien(tab,a,b);
		Wyswietl(Zamien2(tab,a,b));
		
	}

}
