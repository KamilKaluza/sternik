package pl.sternik.zad11;

public class Zadanie11 {

	public enum Stan {
		NOWE, 
		OCZEKUJACE,
		REALIZOWANE,					
		WYSLANE, 
		ZWROT;
		}
	
	public String zwrocOpisStanu(Stan stan){
		String opis = "";
		switch (stan) {
		case REALIZOWANE:
			opis = "Pilne!";
			break;
		case ZWROT:
			opis = "Kontakt!";
			break;
		default:
			opis = stan.name();
			break;
		}
		return opis;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zadanie11 zam = new Zadanie11();
		for(Stan s : Stan.values()){
			System.out.println("Dla : "+s.name()+" : "+ zam.zwrocOpisStanu(s));
		}
	}

}
