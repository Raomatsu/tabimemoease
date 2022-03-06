<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import='tabimemo.object.Location' %>
<%@ page import='java.util.List' %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録地一覧</title>
</head>
<body>
<a href="index.html" id="to_map_btn">マップに戻る </a>
<br><br>

<%
String[] prefectures = (String[])request.getAttribute("allPrefecturesInTheArea");
List<Location> locations = (List<Location>)request.getAttribute("AllLocationsInfInTheArea");
%>

<%-- 都道府県ごとに、1箇所につき1つのリストでスポットを表示 --%>

<%
for(int i = 0; i < prefectures.length; i++){

%>

<%-- ①都道府県名表示 --%>

<%= prefectures[i] %>
<br>

<%
/** ②繰り返し locationsに入っているLocationインスタンスの内、areaプロパティ＝上位forで扱っている都道府県名
のもののプロパティをリスト形式で画面に表示していく。インスタンスを取り出す→areaフィールド判定→一致すれば表示
*/
	for(int j = 0; j < locations.size(); j++){
		if(locations.get(j).getPrefecture().equals(prefectures[i])){
%>
	<table border="1">
		<tr>
		<td>
		スポット名：<%= locations.get(j).getLocationName() %>
		</td>
		</tr>
		<tr>
		<td>
		<%= locations.get(j).getURL() %>
		</td>
		</tr>
		<tr>
		<td>
		コメント：<%= locations.get(j).getComments() %>
		</td>
		</tr>
	</table>
<%
		}
	}
%>


<%
}
%>

</body>
</html>