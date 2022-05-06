package by.javaintroonline.modul04.aggregation_and_composition.task01;

import java.util.ArrayList;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Sentence {
	private ArrayList<Word> sentence = new ArrayList<>();

	public Sentence() {

	}

	public Sentence(ArrayList<Word> words, char endSymbol) {
		sentence = words;

		makeSentence(endSymbol);
	}

	public Sentence(Word word) {
		sentence.add(word);
	}

	public int size() {
		return sentence.size();
	}

	public void addWord(int index, String word) {
		sentence.add(index, new Word(word));
	}

	public void addWord(int index, Word word) {
		if (index == 0) {
			word.setWord(word.toString().toUpperCase());
			sentence.add(index, word);
		} else if (index != sentence.size() - 1) {
			word.setWord(" " + word.toString().toLowerCase());
			sentence.add(index, word);
		}

	}

	public void addWord(String word) {
		sentence.add(new Word(word));
	}

	public void addWord(Word word) {
		sentence.add(word);
	}

	public void addSymbol(char symbol) {
		sentence.add(new Word(Character.toString(symbol)));
	}

	public void makeSentence(char endSymbol) {
		for (int i = 0; i < sentence.size(); i++) {
			if (i == 0) {
				sentence.get(i).toUpperCase();
				sentence.get(i).setWord(sentence.get(i).toString() + Character.toString(' '));
			} else if (i == sentence.size() - 1) {
				sentence.get(i).toLowerCase();
			} else {
				sentence.get(i).toLowerCase();
				sentence.get(i).setWord(sentence.get(i).toString() + Character.toString(' '));
			}
		}

		sentence.add(new Word(Character.toString(endSymbol)));
	}

	public void print() {
		for (Word word : sentence) {
			System.out.print(word.toString());
		}
	}

	public String toString() {
		String to = "";
		for (Word word : sentence) {
			to += word.toString();
		}

		return to;
	}

}
