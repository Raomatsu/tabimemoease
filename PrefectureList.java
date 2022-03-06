package tabimemo.object;
import java.util.HashMap;
import java.util.Map;

public class PrefectureList {


	public static Map <String,String[]> areaAndPrefectures = new HashMap<>();

	//北海道・東北地方
	public static String[] prefecturesInHokkaidoAndTohoku = {"北海道","青森県","岩手県県","秋田県","山形県","宮城県","福島県"};
	static {
		areaAndPrefectures.put("北海道・東北",prefecturesInHokkaidoAndTohoku);
	}


	//関東地方
	public static String[] prefecturesInKanto = {"茨城県","栃木県","群馬県","埼玉県","東京都","神奈川県","千葉県"};
	static {
		areaAndPrefectures.put("関東",prefecturesInKanto);
	}


	//中部地方
	public static String[] prefecturesInChubu = {"新潟県","富山県","石川県","福井県","長野県","山梨県","静岡県","愛知県","岐阜県"};
	static {
		areaAndPrefectures.put("中部",prefecturesInChubu);
	}


	//近畿地方
	public static String[] prefecturesInKinki = {"三重県","滋賀県","奈良県","大阪府","京都府","兵庫県","和歌山県"};
	static {
		areaAndPrefectures.put("近畿",prefecturesInKinki);
	}

	//中国・四国地方
	public static String[] prefecturesInChugokuAndShikoku = {"鳥取県","島根県","岡山県","広島県","山口県","香川県","徳島県","愛媛県","高知県"};
	static {
		areaAndPrefectures.put("中部・四国",prefecturesInChugokuAndShikoku);
	}

	//九州地方
	public static String[] prefecturesInKyushu = {"福岡県","佐賀県","長崎県","大分県","熊本県","宮崎県","鹿児島県","沖縄県"};
	static {
		areaAndPrefectures.put("九州",prefecturesInKyushu);
	}
}
