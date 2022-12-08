package client;

import adaptee.JapaneseAdaptee;
import adapter.TranslatorAdapter;
import target.VietnameseTarget;

public class VietnameseClient {
	public static void main(String[] args) {
		VietnameseTarget target = new TranslatorAdapter(new JapaneseAdaptee());
		target.send("Xin chao");
	}
}	
