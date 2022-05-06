package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Food {
	private FoodType food;

	public Food(FoodType food) {
		this.food = food;
	}

	public void setFood(FoodType food) {
		this.food = food;
	}

	public FoodType getFood() {
		return food;
	}

	public String toString() {
		return food.toString();
	}
}
