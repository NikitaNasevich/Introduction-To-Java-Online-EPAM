package by.javaintroonline.modul04.aggregation_and_composition.task01;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Word {
	String word;

	public Word(String word) {
		setWord(word);
	}

	public String getWord() {
		if (word != null) {
			return word;
		} else {
			return "";
		}
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String toString() {
		if (word != null) {
			return word;
		} else {
			return "";
		}
	}

	public void toLowerCase() {
		setWord(word.substring(0, 1).toLowerCase() + word.substring(1));
	}

	public void toUpperCase() {
		setWord(word.substring(0, 1).toUpperCase() + word.substring(1));
	}

}
