package pl.sternik.zad17;

import pl.sternik.zad13.Article;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book komiks = new Book();
		System.out.println(komiks);
		komiks.setCena(15);
		Book bajka = new Book(1,"kozio�ek mato�ek", 15.99, "Dla dzieci", "tomasz", 1999);
		System.out.println(bajka.toString());
		
		Article koziolek = bajka;
		System.out.println(koziolek);
		
	}
	

}
