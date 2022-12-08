package adapter;

import adaptee.JapaneseAdaptee;
import target.VietnameseTarget;

public class TranslatorAdapter implements VietnameseTarget{

	private JapaneseAdaptee adaptee;
	
	public TranslatorAdapter(JapaneseAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void send(String word) {
		System.out.println("Reading Words ...");
        System.out.println(word);
        String vietnamesWords = this.translate(word);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnamesWords);
	}

	private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "day la han dich tieng nhat";
    }
}
