package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	// 共通の紹介を出力する
	public void commonIntroduce(String givenName) {
		System.out.println("名前は加藤" + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	// 個別の紹介を出力する
	public abstract void eachIntroduce();

	// 紹介を実行する
	public void execIntroduce(String givenName) {
		commonIntroduce(givenName);
		eachIntroduce();
		System.out.println("");
	}
}
