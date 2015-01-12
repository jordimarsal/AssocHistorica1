public class Assignacio {
	private String nom;
	private Data inici, fi;
	private Empleat empleat;
	private Projecte projecte;

	/**
	 * @param codi
	 * @param empleat
	 * @param projecte
	 */
	public Assignacio(String codi, Empleat empleat, Projecte projecte) {
		this.nom = codi;
		this.empleat = empleat;
		this.projecte = projecte;
	}

	public void setDataInici(Data inici) {
		this.inici = inici;
	}

	public void setDataFi(Data fi) {
		this.fi = fi;
	}

	@Override
	public String toString() {
		String str1 = "", str2 = "";
		if (inici == null) {
			str1 = "???";
		} else {
			str1 = inici.toString();
		}
		if (fi == null) {
			str2 = "???";
		} else {
			str2 = fi.toString();
		}

		return "Assignacio num " + this.nom + ": Empleat:" + empleat + " assignat al projecte " + projecte + ". Inici:"
				+ str1 + " fi:" + str2;
	}

	public Projecte getProjecte() {
		return projecte;
	}

	public Empleat getEmpleat() {
		return empleat;
	}

	public Data getDataFi() {
		return fi;
	}

	public Data getDataInici() {
		return inici;
	}
}
