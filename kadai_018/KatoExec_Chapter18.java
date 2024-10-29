package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		// インスタンスを作成する
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		// setGivenNameメソッドを実行する
		taro.givenName = "太郎";
		ichiro.givenName = "一郎";
		hanako.givenName = "花子";
		
		// eachIntroduceメソッドを実行する
		taro.execIntroduce(taro.givenName);
		ichiro.execIntroduce(ichiro.givenName);
		hanako.execIntroduce(hanako.givenName);
	}

}