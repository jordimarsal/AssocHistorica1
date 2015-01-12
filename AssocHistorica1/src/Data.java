import java.util.ArrayList;

public class Data {
	private String data;
	private ArrayList<Projecte> projectes;
	private ArrayList<Empleat> empleats;
	private ArrayList<Assignacio> assignacions;

	public Data(String data) {
		this.data = data;
		projectes = new ArrayList<Projecte>();
		empleats = new ArrayList<Empleat>();
		assignacions = new ArrayList<Assignacio>();
	}

	private void addProjecte(Projecte projecte) {
		projectes.add(projecte);
	}

	private void addEmpleat(Empleat empleat) {
		empleats.add(empleat);
	}

	public void addAssignacio(Assignacio assignacio) {
		assignacions.add(assignacio);
		addProjecte(assignacio.getProjecte());
		addEmpleat(assignacio.getEmpleat());
	}

	@Override
	public String toString() {
		return this.data;
	}
}
