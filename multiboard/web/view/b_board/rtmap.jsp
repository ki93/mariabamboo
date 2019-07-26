<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- 지도를 표시할 div 입니다 -->
<div id="map" style="max-width: 100%; height: 600px; margin-top: 7em">
</div>
<div class="contatiner">
	<div class="row" style="margin-top: 1em">
		<div class="col-sm-7"></div>
		<div class="col-sm-auto">
			<button onclick="panTo()" class="btn btn-outline-success" value="멀티캠퍼스">멀티캠퍼스</button>
		</div>
		<div class="col-sm-auto">
			<input class="btn btn-outline-success" type="button" value="마커등록"
				onclick="location.href='makeMarker.go'">
		</div>
	</div>
</div>

<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b91d9d09306bc6154fa673a52ef32dc7"></script>
<script>
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	mapOption = {
		center : new kakao.maps.LatLng(37.501274, 127.039749), // 지도의 중심좌표
		level : 2
	// 지도의 확대 레벨
	};

	// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
	var map = new kakao.maps.Map(mapContainer, mapOption);

	function panTo() {
	    // 이동할 위도 경도 위치를 생성합니다 
	    var moveLatLon = new kakao.maps.LatLng(37.501274, 127.039749);
	    
	    // 지도 중심을 부드럽게 이동시킵니다
	    // 만약 이동할 거리가 지도 화면보다 크면 부드러운 효과 없이 이동합니다
	    map.panTo(moveLatLon);            
	}
	// 마커를 표시할 위치와 title 객체 배열입니다 
	var positions = [
	    {
	        title: '순남시래기', 
	        latlng: new kakao.maps.LatLng(37.501216, 127.040192)
	    },
	    {
	        title: '김밥까페 역삼테헤란점', 
	        latlng: new kakao.maps.LatLng(37.5010846, 127.0403049)
	    },
	    {
	        title: '서브웨이 역삼점', 
	        latlng: new kakao.maps.LatLng(37.5016554, 127.0354804)
	    }
	];

	for (var i = 0; i < positions.length; i ++) {
	  
	    // 마커를 생성합니다
	    var marker = new kakao.maps.Marker({
	        map: map, // 마커를 표시할 지도
	        position: positions[i].latlng, // 마커를 표시할 위치
	        title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
	    });
	}

</script>
