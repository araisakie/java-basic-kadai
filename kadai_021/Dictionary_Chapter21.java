package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static void main(String[] args) {
		

	}
	
	public String fruit(String fruitName) {
		HashMap<String, String> fruitDictionary = new HashMap<>();
		
		// fruitマップに追加
		fruitDictionary.put("apple","りんご");
		fruitDictionary.put("peach","桃");
		fruitDictionary.put("banana","バナナ");
		fruitDictionary.put("lemon","レモン");
		fruitDictionary.put("pear","梨");
		fruitDictionary.put("kiwi","キウィ");
		fruitDictionary.put("strawberry","いちご");
		fruitDictionary.put("grape","ぶどう");
		fruitDictionary.put("muscat","マスカット");
		fruitDictionary.put("cherry","さくらんぼ");
		
		fruitName = fruitDictionary.get(fruitName);
		
		return fruitName;
	}
};
