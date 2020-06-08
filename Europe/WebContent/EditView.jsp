<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function cancel(){
		window.history.back(); 
	}
</script>
<body>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
 <!--top place start-->
    <section class="event_part section_padding" style="background-image: url('marine/img/${re.getCountry()}.jpg'); background-size:cover; height:400px;">
            <div class="container">
            <div class="row justify-content-center" style="background-color:white; opacity:0.6; margin-top:100px">
                <div class="col-xl-6"><br><br><br><br>
                    <div class="section_tittle text-center">
                        <h2 style="font-size:40pt; color:black;">${re.getCountry()} ${re.getCate1()}</h2>
                        <br><br><br><br>
                    </div>
                </div>
            </div>
            </div>
    </section>
    <div style="background-color:lightgray;">
       <jsp:include page="header.jsp"/>
    </div>
    <br><br><br><br>
    
<form action="EditAction.do" method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label" style="position: relative; font-size:15pt; left:130px;">나라/주제</label>
      <div style="position: relative; left:95px;">
      <select name="country" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>korea</option>
					<option>england</option>
					<option>france</option>
					<option>swiss</option>
					<option>germany</option>
					<option>hungary</option>
					<option>czech</option>
					<option>italy</option>
	  </select>
	  <select name="cate1" style="background-color:#fbfbfb; width:150px; float:left;">
					<option>information</option>
					<option>market</option>
					<option>together</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">제목</label>
      <input type="text" class="form-control" name="title" value="${re.getTitle()}" style="background-color:#fbfbfb; width:700px; position: relative; left:95px;">
     </div>
     <div class="form-group">
      <label for="inputfile" style="position: relative; font-size:15pt; left:130px;">파일첨부</label>
      <div class="col-sm-10" style = "position: relative; left:70px; float:right;">
      <input type="file" class="form-control-file" name="inputfile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted" style="color:red">※글과 관련된 사진만 첨부하여 주십시오.※</small>
    </div>
    </div>
    <div class="form-group">
      <label for="detail" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">내용</label>
      <br>
      <input class="form-control" name="detail" value="${re.getDetail()}" style="background-color:#fbfbfb; height:600px; width:830px; position: relative; left:130px;">
    </div>
        <input type="hidden" name="number" value="${re.getNumber()}">
	</fieldset>
	<div style="position: relative; left:350px;">
	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="수정">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="취소" onclick="cancel()">
	</div>
	 <br><br><br><br><br>
</form>
</body>
</html>