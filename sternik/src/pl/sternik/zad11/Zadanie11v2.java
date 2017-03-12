package pl.sternik.zad11;

public class Zadanie11v2 {

	public enum Stan {
		NOWE(), OCZEKUJACE(), REALIZOWANE("Pilne"), WYSLANE(), ZWROT("Kontakt");
		private String stan = "";
		private Stan(String stan){
			this.stan = stan;
		}
		private Stan(){			
		}
		public String getStan(){
			if ("".equals(stan))
				return this.toString();
			else
				return stan;
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zadanie11 zam = new Zadanie11();
		for(Stan s : Stan.values()){
			System.out.println("Dla : "+s.name()+" : "+ s.getStan());
		}
	}

}
