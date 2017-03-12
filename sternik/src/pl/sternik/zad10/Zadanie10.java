package pl.sternik.zad10;

public class Zadanie10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] liczby ={{1,1,1,2,4},
						{2,1,2,2,2}};
		char[] znaki = {'+', 'x', '-', '*', '/' };
		int [] wyniki = new int[znaki.length];
		
		for(int i=0; i<znaki.length; i++){
			switch (znaki[i]) {
			case '+':
				wyniki[i] = liczby[0][i] + liczby[1][i];
				break;
			case '-':
				wyniki[i] = liczby[0][i] - liczby[1][i];
				break;
			case '*':
				wyniki[i] = liczby[0][i] * liczby[1][i];
				break;
			case '/':
				wyniki[i] = liczby[0][i] / liczby[1][i];
				break;

			default:
				wyniki[i] = liczby[0][i] + liczby[1][i];
				break;
			}
		}
		for(int wynik : wyniki){
			System.out.print(wynik+" ");
		}
		
		
	}

}
