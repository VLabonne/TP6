
public class Guitar_Electrique extends Guitar {

	public Guitar_Electrique(int nbcorde, String vson) {
		super(nbcorde, vson);
	}
	public String disto() {
		son = son+"OUUUIIINNGGG";
		return son;
	}
	public static void main(String[] args) {
		Guitar_Electrique guitar_elec;
		guitar_elec = new Guitar_Electrique(3, "Si");
		System.out.println(guitar_elec.jouer());
		guitar_elec.disto();
		System.out.print(guitar_elec.jouer());
	}

}
