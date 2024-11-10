package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	Scanner scanner = new Scanner(System.in);
	String r = "r";	// rock(グー)
	String s = "s";	// scissors(チョキ)
	String p = "p";	// paper(パー)
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// 入力内容を取得
		String input = scanner.next();
		
		// 入力チェック
		if(r.equals(input) || (s.equals(input)) || (p.equals(input))) { 
			// 入力内容を出力
			System.out.println(input);
		} else {
			input = "じゃんけんの手が正しくありません。正しい手を入力してください";
			System.out.println(input);
			getMyChoice();
		}
		
		return input;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		String[] jankenList = new String[3];
		jankenList[0] = "r";
		jankenList[1] = "s";
		jankenList[2] = "p";
		long janken = 0;
		String jankenStr = null;
		
		// 相手のじゃんけんの手を取得	
		janken = Math.round(Math.random() * jankenList.length);
		
		if(janken == 0) {
			jankenStr = "r";
		} else if(janken == 1) {
			jankenStr = "s";
		} else {
			jankenStr = "p";
		}
		
		return jankenStr;
	}
	
	// じゃんけんを行う
	public void playGame() {
		
		Map<String, String> janken = new HashMap<String, String>();
		
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		
		// 自分の手
		String myJanken = janken.get(getMyChoice());
		// 相手の手
		String youJanken = janken.get(getRandom());
		
		System.out.println("自分の手は" + myJanken + ",相手の手は" + youJanken);
		
		
		// 比較
		// 自分がグー
		if(myJanken.equals("グー")) {
			if(youJanken.equals("グー")) {
				System.out.println("あいこです");
			} else if(youJanken.equals("チョキ")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
			
		// 自分がチョキ
		} else if(myJanken.equals("チョキ")) {
			if(youJanken.equals("グー")) {
				System.out.println("自分の負けです");
			} else if(youJanken.equals("チョキ")) {
				System.out.println("あいこです");
			} else {
				System.out.println("自分の勝ちです");
			}
		
		// 自分がパー
		} else {
			if(youJanken.equals("グー")) {
				System.out.println("自分の勝ちです");
			} else if(youJanken.equals("チョキ")) {
				System.out.println("自分の負けです");
			} else {
				System.out.println("あいこです");
			}
		}
	}
}
