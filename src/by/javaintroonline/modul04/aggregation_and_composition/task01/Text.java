package by.javaintroonline.modul04.aggregation_and_composition.task01;

import java.util.ArrayList;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Text {
	private Sentence title;
	private ArrayList<Sentence> sentences = new ArrayList<>();

	public Text() {
	}

	public Text(Sentence title, ArrayList<Sentence> sentences) {
		this.title = title;
		this.sentences = sentences;
	}

	public void setSentence(ArrayList<Sentence> sentences) {
		this.sentences = sentences;
	}

	public void setTitle(Sentence title) {
		this.title = title;
	}

	public void addSentence(Sentence sentence) {
		sentences.add(sentence);
	}

	public void addChapter(int indexOfSentence) {
		sentences.get(indexOfSentence).addWord(0, "\n");
		sentences.get(indexOfSentence).addWord("\n");
	}

	public void printTitle() {
		System.out.print("\n" + title.toString() + "\n");
	}

	public void printText() {

		for (Sentence sentence : sentences) {
			System.out.print(sentence.toString());
		}
	}
}
