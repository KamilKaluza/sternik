package pl.sternik.zad13;

import pl.sternik.zad15.Order;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article ksiazka =new Article();
		ksiazka.setId(1);
		ksiazka.setNazwa("W³adca pierœcieni");
		ksiazka.setOpis("Opis ksia¿ki");
		ksiazka.setCena(34.99);
		System.out.println(ksiazka);
		
		Article dvd = new Article(2, "Shameles S01", 49.99, "Serial");
		System.out.println(dvd);
		
		Article dvd2 = new Article(3, "Asterix i Obelix", 19.99, "Film");
		System.out.println(dvd2);
		
		System.out.println(Article.Counter);
		
		Order zamowienie = new Order();
		
		Book komiks = new Book();
		System.out.println(komiks);
		komiks.setCena(15);
		komiks.setRok(2013);
		Book bajka = new Book(1,"kozio³ek mato³ek", 15.99, "Dla dzieci", "tomasz", 1999);
		System.out.println(bajka.toString());
		
		Article koziolek = bajka;
		System.out.println(koziolek);
		System.out.println(Article.Counter);
		
	}

}
