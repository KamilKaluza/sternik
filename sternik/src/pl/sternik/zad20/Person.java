package pl.sternik.zad20;

public abstract class Person {
	private int id;
	private String name;
	static int counter;
	
	public abstract boolean getAuthorization();

	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s]", id, name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
