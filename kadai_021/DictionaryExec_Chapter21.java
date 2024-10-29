package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		// インスタンスを作成
		Dictionary_Chapter21 fruitDictionary = new Dictionary_Chapter21();
		
		// 英単語を配列にセットする
		ArrayList<String> fruitList = new ArrayList<>();
		
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("orange");
		
		// 配列にセットした値が存在するか調べる
		for(String fruit: fruitList) {
			
			// 辞書で調べた結果を取得する
			String rs = fruitDictionary.fruit(fruit);
			
			// 辞書に意味が存在しない場合
			if(rs == null || rs.isBlank()) {
				System.out.println(fruit + "は辞書に存在していませんでした");
				continue;
			}
			// 辞書に意味が存在する場合
			System.out.println(fruit + "の意味は" + rs + "です");
		}
	}
}
