import java.util.ArrayList;

public class MainAss1 {

	public static void main(String[] args) {

		ArrayList<Data> dates = new ArrayList<Data>();

		Empleat adam = new Empleat("Adam");
		Empleat bale = new Empleat("Bale");
		Empleat cinder = new Empleat("Cinderella");

		Projecte p1 = new Projecte("P1");
		Projecte p2 = new Projecte("P2");

		Data data1 = new Data("01012015");
		Data dataFi1 = new Data("25012015");
		Data data3 = new Data("15012015");
		Data data4 = new Data("26012015");

		dates.add(data1);
		dates.add(dataFi1);
		dates.add(data3);
		dates.add(data4);

		adam.assignar(1, p1, data1);
		adam.fiAssignacio(dataFi1);

		bale.assignar(2, p1, data1);
		bale.fiAssignacio(dataFi1);

		cinder.assignar(3, p2, data3);

		bale.assignar(4, p2, data4);

		System.out.println("Dates de Adam a " + p1);
		adam.getDates(p1);

		System.out.println("Assignacions de Adam a data " + data1);
		adam.getAssignacions(data1);

		System.out.println("\nAssignacions de " + p1 + " a data " + data1);
		p1.getAssignacions(data1);

		System.out.println("Empleats de " + p1 + " a data " + data1);
		p1.getEmpleats(data1);

		System.out.println("\nDates de " + bale + " a " + p1);
		bale.getDates(p1);
		System.out.println("Assignacions de " + bale + " a data " + data1);
		bale.getAssignacions(data4);

		System.out.println("\nDates de " + cinder + " a " + p2);
		cinder.getDates(p2);
		System.out.println("Assignacions de " + cinder + " a data " + data1);
		cinder.getAssignacions(data3);

	}

}
