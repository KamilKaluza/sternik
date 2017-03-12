package pl.kk;

public class Petle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = new String[4];
		tab[0]="aaa";
		tab[1]="bbb";
		tab[2]="ccc";
		tab[3]="ddd";
		for(int i=0; i<tab.length; i++)
			System.out.println(tab[i]);
		for(String string : tab)
			System.out.println(string);
		int i = 0;
		while(i<tab.length)
		{
			System.out.println(tab[i]);
			i++;
		}
		
		
		
	}

}
