package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public enum TransportType {
	BUS("Bus"), MINIBUS("Minibus"), TRAIN("Train"), AIRPLANE("Airplane"), CRUISESHIP("Cruise ship");

	private String transportType;

	TransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getTransportType() {
		return transportType;
	}

	public String toString() {
		return transportType;
	}
}
