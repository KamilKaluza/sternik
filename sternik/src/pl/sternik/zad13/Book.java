package pl.sternik.zad13;

class Book extends Article{
	private String autor;
	private int rok;
	
	
	public Book() {
	}

	public Book(String autor, int rok) {
		super();
		this.autor = autor;
		this.rok = rok;
	}
	
	
	public Book(int id, String nazwa, double cena, String opis, String autor, int rok) {
		super(id, nazwa, cena, opis);
		this.autor = autor;
		this.rok = rok;
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
		printChange();
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
		printChange();
	}

	@Override
	public String toString() {
		return "Book [autor=" + autor + ", rok=" + rok + ", getId()=" + getId() + ", getNazwa()=" + getNazwa()
				+ ", getCena()=" + getCena() + ", getOpis()=" + getOpis() + "]";
	}
}

