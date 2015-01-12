import java.util.ArrayList;

public class Projecte {
	private String nom;
	private ArrayList<Empleat> empleats;
	private ArrayList<Assignacio> assignacions;

	public Projecte(String nom) {
		this.nom = nom;
		empleats = new ArrayList<Empleat>();
		assignacions = new ArrayList<Assignacio>();
	}

	public void printLlistatHistoric() {
		/*for (Sou s : historicSous) {
			System.out.println(s);
		}*/
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public void assignacio(Assignacio ass) {
		assignacions.add(ass);
		empleats.add(ass.getEmpleat());

	}

	public void getAssignacions(Data data1) {
		for (Assignacio a : assignacions) {
			if (a.getDataFi() == data1 || a.getDataInici() == data1) {
				System.out.println(a);
			}
		}

	}

	public void getEmpleats(Data data1) {
		for (Assignacio a : assignacions) {
			if (a.getDataFi() == data1 || a.getDataInici() == data1) {
				System.out.println(a.getEmpleat());
			}
		}

	}
}
