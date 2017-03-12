package pl.sternik.zad13;

public class Article {
	private int id;
	private String nazwa;
	private double cena;
	private String opis;
	static int Counter;
	
	
	public Article(){
		Article.Counter++;
	}
	
	
	public Article(int id, String nazwa, double cena, String opis) {
		super();
		this.id = id;
		this.nazwa = nazwa;
		this.cena = cena;
		this.opis = opis;
		Article.Counter++;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		printChange();
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
		printChange();
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
		printChange();
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
		printChange();
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", nazwa=" + nazwa + ", cena=" + cena + ", opis=" + opis + "]";
	}
	
	protected void printChange(){
		System.out.println("Zmieniono wartoœæ pola");
	}
	
	
	

}
