import java.util.*;

public class Main {


	public static void main(String[] args) {
		
		Guitar[] guitar = new Guitar[6];
		Random nbr = new Random();
		
		for (int i = 0; i< 3; i++) {
			guitar[i] = new Guitar(nbr.nextInt(10), "Si");
			System.out.println(guitar[i].jouer());
	}
		for (int i = 3; i<guitar.length; i++) {
			guitar[i] = new Guitar_Electrique(nbr.nextInt(100), "Si");
			Guitar_Electrique ge = (Guitar_Electrique) guitar[i];
			ge.disto();
			System.out.println(ge.jouer());
		}

}
}