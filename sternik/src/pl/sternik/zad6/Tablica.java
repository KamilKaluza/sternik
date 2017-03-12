package pl.sternik.zad6;

public class Tablica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
	int[][] values={{3,8,16},
					{1,22,28,24},
					{3},
					{41,42}};
	max=values[0][0];
	min=values[0][0];
	for(int i=0; i < values.length; i++){
		for(int j=0; j< values[i].length; j++){
			if (max<values[i][j])
				max=values[i][j];
			if (min>values[i][j])
				min=values[i][j];
		}
		
	}
	System.out.println("max : "+max+"\nmin : "+min);
	}


}
