package by.javaintroonline.modul04.aggregation_and_composition.task03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */


public class Main {

	public static void main(String[] args) {
		City logoisk = new City("Logoisk", 100);
		City kosino = new City("Kosino", 50);
		City medvejeno = new City("Medvejeno", 1000);
		City polyana = new City("Polyana", 1400);
		City krugly = new City("Krugly", 1900);

		City minsk = new City("Minsk", 100100);
		City valejin = new City("Valejin", 5700);
		City polock = new City("Polock", 4100);
		City lida = new City("Lida", 1300);
		City brest = new City("Brest", 9992);

		District logoisky = new District(logoisk);
		logoisky.addCity(kosino);
		logoisky.addCity(medvejeno);
		logoisky.addCity(logoisk);

		District polyanski = new District(polyana);
		polyanski.addCity(polyana);
		polyanski.addCity(krugly);

		District minsky = new District(minsk);
		minsky.addCity(minsk);
		minsky.addCity(valejin);
		minsky.addCity(polock);

		District lidsky = new District(lida);
		lidsky.addCity(lida);
		lidsky.addCity(brest);

		Region logoiskyy = new Region(logoisk);
		logoiskyy.addDistrict(logoisky);
		logoiskyy.addDistrict(polyanski);

		Region minskyy = new Region(minsk);
		minskyy.addDistrict(minsky);
		minskyy.addDistrict(lidsky);

		State belarus = new State("Belarus", "Minsk");
		belarus.addRegion(logoiskyy);
		belarus.addRegion(minskyy);

		System.out.println(belarus.getCapitalCity());

		System.out.println(belarus.getName() + " has " + belarus.getNumberOfRegions() + " regions.");

		System.out.println("Area of " + belarus.getName() + " = " + belarus.getArea() + " square kilometers.");

		System.out.println("Regional centers of " + belarus.getName() + ": " + belarus.listOfRegions());
	}

}
