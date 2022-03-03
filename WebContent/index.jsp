<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
<link rel="stylesheet" type="text/css" href="tabimemo.css">
</head>
<body>
<a href="add.jsp" id="add_location_btn">行きたい場所を追加 </a>
<div class="japan_map">
    <img src="都道府県.png" alt="日本地図">
    <form action="toListServlet" method="post">
	    <span class="area_btn area1"><input type=submit name="area" value="北海道・東北"></span>
	    <span class="area_btn area2"><input type=submit name="area" value="関東"></span>
	    <span class="area_btn area3"><input type=submit name="area" value="中部"></span>
	    <span class="area_btn area4"><input type=submit name="area" value="近畿"></span>
	    <span class="area_btn area5"><input type=submit name="area" value="中国・四国"></span>
	    <span class="area_btn area6"><input type=submit name="area" value="九州"></span>
	</form>
</div>


</body>

</html>