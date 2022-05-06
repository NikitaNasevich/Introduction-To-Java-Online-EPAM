package by.javaintroonline.modul04.aggregation_and_composition.task01;

import java.util.ArrayList;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
		Word word1 = new Word("Title");
		Word word2 = new Word("One");
		Word word3 = new Word("two");
		Word word4 = new Word("three");
		Word word5 = new Word("four");
		Word word6 = new Word("Five");
		Word word7 = new Word("Six");
		Word word8 = new Word("seven");
		Word word9 = new Word("Eight");
		Word word10 = new Word("nine");
		Word word11 = new Word("ten");
		Word wordPlus = new Word("Plus");

		Word title1 = new Word("New ");
		Word title2 = new Word("Title");

		ArrayList<Word> words1 = new ArrayList<>();
		words1.add(word2);
		words1.add(word3);
		words1.add(word4);
		words1.add(word5);
		words1.add(word6);

		ArrayList<Word> words2 = new ArrayList<>();
		words2.add(word7);
		words2.add(word8);
		words2.add(word9);
		words2.add(word10);
		words2.add(word11);

		Sentence sentence1 = new Sentence(words1, '.');
		Sentence sentence2 = new Sentence(words2, '!');
		Sentence title = new Sentence();

		title.addWord(word1);

		ArrayList<Sentence> sentences = new ArrayList<>();
		sentences.add(sentence1);
		sentences.add(sentence2);

		Text text = new Text(title, sentences);

		text.addChapter(0);
		text.addChapter(1);

		text.printTitle();
		text.printText();

		Sentence newTitle = new Sentence(title1);
		newTitle.addWord(title2);
		text.setTitle(newTitle);

		sentence1.addWord(sentence1.size() - 2, wordPlus);

		text.printTitle();
		text.printText();

	}

}
