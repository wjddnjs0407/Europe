<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Tip WriteForm</title>
<style>
form{
	margin: 0 auto;
	width : 1000px;
}
div.button{
	margin: auto;
	width : 20%;
}
</style>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">Review</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br><br>
<form>
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label">게시판</label>
      <div class="col-sm-10">
      <select name="category1" style="width:150px; float:left;">
					<option>나라선택</option>
					<option>국내</option>
					<option>영국</option>
					<option>프랑스</option>
	  </select>
	  <select name="category2" style="width:150px; float:left;">
					<option>말머리선택</option>
					<option>일정</option>
					<option>대중교통</option>
					<option>입장권</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label">제목</label>
      <div class="col-sm-10">
        <input type="title" class="form-control" id="title" placeholder="제목을 입력해주세요." style="width:900px;">
      </div>
     </div>
     <div class="form-group">
      <label for="inputfile">파일첨부</label>
      <div class="col-sm-10" style = "float:right;">
      <input type="file" class="form-control-file" id="inputfile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted">글과 관련된 사진만 첨부하여 주십시오.</small>
    </div>
    </div>
    <div class="form-group">
      <label for="content">내용</label>
      <textarea class="form-control" id="content" rows="15" placeholder="내용을 입력해주세요." ></textarea>
    </div>
	</fieldset>
	<div class="button">
	<input type="submit" class="btn btn-primary" value="글쓰기">
	<input type="reset" class="btn btn-primary" value="취소" onclick="location='tip.jsp'">
	</div>
</form>
</body>
</html>