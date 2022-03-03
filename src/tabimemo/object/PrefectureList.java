package tabimemo.object;
import java.util.HashMap;
import java.util.Map;

public class PrefectureList {


	public static Map <String,String[]> areaAndPrefectures = new HashMap<>();

	//北海道・東北地方
	public static String[] prefecturesInHokkaidoAndTohoku = {"北海道","青森"};
	static {
		areaAndPrefectures.put("北海道・東北",prefecturesInHokkaidoAndTohoku);
	}


	//関東地方
	public static String[] prefecturesInKanto = {"茨城","栃木"};
	static {
		areaAndPrefectures.put("関東",prefecturesInKanto);
	}


	//中部地方
	public static String[] prefecturesInChubu = {"新潟","富山"};
	static {
		areaAndPrefectures.put("中部",prefecturesInChubu);
	}


	//近畿地方
	public static String[] prefecturesInKinki = {"三重","滋賀"};
	static {
		areaAndPrefectures.put("近畿",prefecturesInKinki);
	}

	//中国・四国地方
	public static String[] prefecturesInChugokuAndShikoku = {"鳥取","島根"};
	static {
		areaAndPrefectures.put("中部・四国",prefecturesInChugokuAndShikoku);
	}

	//九州地方
	public static String[] prefecturesInKyushu = {"福岡","佐賀"};
	static {
		areaAndPrefectures.put("九州",prefecturesInKyushu);
	}
}
