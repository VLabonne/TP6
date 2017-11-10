
public class Guitar {

	private int nombreCorde;
	public String son;
	
	public Guitar(int nbcorde, String vson) {
		this.nombreCorde = nbcorde;
		this.son = vson;
	}
	public String jouer() {
		String result = son + " " + nombreCorde;
		return result;
	}
	public static void main(String[] args) {
		Guitar guitar;
		guitar = new Guitar(3, "Si");
		System.out.print(guitar.jouer());
	}

}