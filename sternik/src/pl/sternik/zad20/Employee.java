package pl.sternik.zad20;

public class Employee extends Person {

	@Override
	public boolean getAuthorization() {
		// TODO Auto-generated method stub
		if (getName() != null){
			return true;
		}
		return false;
	}

}
