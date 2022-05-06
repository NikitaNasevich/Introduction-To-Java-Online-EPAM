package by.javaintroonline.modul04.aggregation_and_composition.task05;

import java.util.ArrayList;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {
		City minsk = new City(CityType.MINSK);
		City lviv = new City(CityType.LVIV);
		City ankara = new City(CityType.ANKARA);
		City logoisk = new City(CityType.LOGOISK);
		City mediterraneanSea = new City(CityType.MEDITERRANEAN_SEA);
		City sharmEiSheikh = new City(CityType.SHARM_EI_SHEIKH);

		Food ai = new Food(FoodType.AI);
		Food bb = new Food(FoodType.BB);
		Food fb = new Food(FoodType.FB);
		Food hb = new Food(FoodType.HB);
		Food ro = new Food(FoodType.RO);
		Food uai = new Food(FoodType.UAI);

		Holiday cruise = new Holiday(HolidayType.CRUISE);
		Holiday excursion = new Holiday(HolidayType.EXCURSION);
		Holiday rest = new Holiday(HolidayType.REST);
		Holiday shopping = new Holiday(HolidayType.SHOPPING);
		Holiday treatment = new Holiday(HolidayType.TREATMENT);

		Period fourteen = new Period(PeriodType.FOURTEEN);
		Period seven = new Period(PeriodType.SEVEN);
		Period twentyOne = new Period(PeriodType.TWENTYONE);

		Transport airplane = new Transport(TransportType.AIRPLANE);
		Transport bus = new Transport(TransportType.BUS);
		Transport cruis = new Transport(TransportType.CRUISESHIP);
		Transport minibus = new Transport(TransportType.MINIBUS);
		Transport train = new Transport(TransportType.TRAIN);

		Tour tour1 = new Tour(minsk, shopping, seven, minibus, ro);
		Tour tour2 = new Tour(minsk, shopping, fourteen, bus, fb);
		Tour tour3 = new Tour(minsk, rest, fourteen, bus, bb);
		Tour tour4 = new Tour(minsk, shopping, twentyOne, train, ai);

		Tour tour5 = new Tour(lviv, shopping, seven, minibus, ro);
		Tour tour6 = new Tour(lviv, shopping, fourteen, bus, bb);
		Tour tour7 = new Tour(lviv, rest, fourteen, bus, ai);

		Tour tour8 = new Tour(ankara, rest, seven, airplane, ro);
		Tour tour9 = new Tour(ankara, rest, fourteen, airplane, ai);
		Tour tour10 = new Tour(ankara, treatment, fourteen, airplane, ai);

		Tour tour11 = new Tour(logoisk, excursion, twentyOne, bus, ai);

		Tour tour12 = new Tour(mediterraneanSea, cruise, seven, cruis, hb);
		Tour tour13 = new Tour(mediterraneanSea, shopping, fourteen, cruis, ai);

		Tour tour14 = new Tour(sharmEiSheikh, rest, fourteen, airplane, ai);
		Tour tour15 = new Tour(sharmEiSheikh, treatment, twentyOne, airplane, uai);

		ArrayList<Tour> tours = new ArrayList<Tour>();
		tours.add(tour1);
		tours.add(tour2);
		tours.add(tour3);
		tours.add(tour4);
		tours.add(tour5);
		tours.add(tour6);
		tours.add(tour7);
		tours.add(tour8);
		tours.add(tour9);
		tours.add(tour10);
		tours.add(tour11);
		tours.add(tour12);
		tours.add(tour13);
		tours.add(tour14);
		tours.add(tour15);

		TravelAgency agency = new TravelAgency("SomeWhere Tour", tours);

		agency.search(CityType.LOGOISK);

		agency.search(FoodType.BB);

		agency.sortByCity();

		agency.sortByFood();

		agency.printAlltours();

	}

}
