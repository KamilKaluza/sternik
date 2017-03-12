package pl.sternik.zad20;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee osoba = new Employee();
		System.out.println( osoba.getAuthorization());
		osoba.setName("Kacper");
		System.out.println( osoba.getAuthorization());
	}

}
