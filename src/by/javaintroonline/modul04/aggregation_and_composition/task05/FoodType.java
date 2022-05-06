package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public enum FoodType {
	RO("room only"), BB("bed breakfast"), HB("half board"), FB("full board"), AI("all inclusive"),
	UAI("ultra all inclusive");

	private String foodType;

	FoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodType() {
		return foodType;
	}

	public String toString() {
		return foodType;
	}
}
