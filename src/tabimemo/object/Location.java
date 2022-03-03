package tabimemo.object;
import java.io.Serializable;

public class Location implements Serializable{

	//地域名
	private String area;
	//都道府県名
	private String prefecture;
	//行きたい場所の名前
	private String locationName;
	//参考URL
	private String URL;
	//コメント
	private String comments;


	public Location() {}
	public Location(String area,String prefecture,String locationName,String URL,String comments) {
		this.area = area;
		this.prefecture = prefecture;
		this.locationName = locationName;
		this.URL = URL;
		this.comments = comments;
	}

	//地域のgetter、setter
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	//都道府県名のgetter、setter
	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.area = prefecture;
	}

	//行きたい場所名のgetter、setter
	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.area = locationName;
	}

	//URLのgetter、setter
	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.area = URL;
	}

	//コメントのgetter、setter
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.area = comments;
	}

}
