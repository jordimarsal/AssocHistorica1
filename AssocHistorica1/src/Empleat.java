import java.util.ArrayList;

public class Empleat {
	private String nom;

	private ArrayList<Projecte> projectes;
	private ArrayList<Assignacio> assignacions;
	private Assignacio ass;

	public Empleat(String nom) {
		this.nom = nom;
		projectes = new ArrayList<Projecte>();
		assignacions = new ArrayList<Assignacio>();
	}

	public void printLlistatProjectes() {
		for (Projecte p : projectes) {
			System.out.println(p);
		}
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public void assignar(Integer i, Projecte p1, Data data1) {
		ass = new Assignacio(i.toString(), this, p1);
		ass.setDataInici(data1);
		p1.assignacio(ass);
		assignacions.add(ass);
	}

	public void fiAssignacio(Data data2) {
		ass.setDataFi(data2);

	}

	public void getDates(Projecte p1) {
		for (Assignacio a : assignacions) {
			if (a.getProjecte() == p1) {
				System.out.println(a.getDataInici());
				System.out.println(a.getDataFi());
			}
		}

	}

	public void getAssignacions(Data data1) {
		for (Assignacio a : assignacions) {
			if (a.getDataFi() == data1 || a.getDataInici() == data1) {
				System.out.println(a);
			}
		}

	}
}
