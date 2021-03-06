<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<style>
div.button{
	margin: auto;
	width : 50%;
}
</style>
<script type="text/javascript">
	function checkForm(){
		if(!document.join.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		
		if(!document.join.password.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		
		if(document.join.password.value != document.join.passwordconfirm.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}
		alert("회원가입이 완료되었습니다. 로그인 해주세요.");
		return true;
	}
	
	function cancel(){
		window.history.back(); 
	}
	
	function confirmId(){
		if(!document.join.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}
		
		var _width = 270;
		var _height = 140;
		
		var _left = Math.ceil(( window.screen.width - _width )/2);
		var _top = Math.ceil(( window.screen.width - _height )/4); 

		var id = document.join.id.value;
		var url = "confirmId.jsp?id=" + id;
		window.open(url,"confirmID", "height=" + _height  + ", width=" + _width  + ", left="+ _left + ", top="+ _top);
	}
	
</script>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <div class="culmn">
        <jsp:include page="header.jsp" />
        		 <!-- Counter Section --> 
            <section id="counter" class="counter">
                <div class="video_overlay">
                    <div class="container">
                        <div class="row">  
                            <div class="col-sm-12">               
                                <div class="main_counter_area text-center">

                                    <div class="row">
									 <div class="head_title text-center" style="color:white; margin-top:80px;">
                                 	   <h2 style="font-size:50pt;">JOIN</h2>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- End off container --> 
            </section>
        </div>
<br><br><br><br>
<form name="join" action="JoinMemberAction.do" method="post" onsubmit = "return checkForm();" style ="margin:0 auto; width:500px;">
  <fieldset>
    <div class="form-group row">
      <label for="id" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">ID</label>
        <input type="text" class="form-control" name="id" placeholder="ID" style="width:300px; position: relative; left:95px;">
        <input type="button" value="중복확인" name="confirm_id" onclick="confirmId(this.form)" style="left:55px; position:relative; margin-top:5px; border: 1px solid skyblue; background-color: skyblue; color:white; padding:3px;
	border-top-right-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-bottom-left-radius: 10px;; float:right;">
    </div>
    <div class="form-group row">
      <label for="name" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">Name</label>
      <input type="text" class="form-control" name="name" placeholder="Name" style="width:300px; position: relative; left:95px;">
    </div>
    <div class="form-group row">
      <label for="nickname" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">Nickname</label>
      <input type="text" class="form-control" name="nickname" placeholder="Nickname" style="width:300px; position: relative; left:95px;">
    </div>
    <div class="form-group row">
      <label for="exampleInputEmail1" class="col-sm-2 com-form-label" style="position:relative; font-size:15pt; left:40px;">Email Address</label>
      <input type="text" class="form-control" name="email1" aria-describedby="emailHelp" placeholder="Email" maxlength="20" style="width:150px; float:left; position: relative; left:95px;"><p style="float:left; margin-top:15px; position: relative; left:95px;">@</p>
      <select name="email2" style="width:150px; margin-top:15px; position: relative; left:95px;">
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>
				</select>
    </div>
    <div class="form-group row">
      <label for="exampleInputPassword1" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">Password</label>
      <input type="password" class="form-control" name="password" id="password" placeholder="Password" style="width:300px; position: relative; left:95px;">
    </div>
    <div class="form-group row">
			<label for="exampleInputPassword1" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px;">Password Confirm</label>
			<input type="password" class="form-control" name ="passwordconfirm" id="passwordconfirm" placeholder="Password Confirm" style="width:300px; position: relative; left:95px;">
		</div>
    <div class="form-group row">
      <label for="phonenumber" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px;">Phone Number</label>
      <div style="position: relative; left:95px;">
        <input type="text" class="form-control" name="phone1" value="010" maxlength="3" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="text" class="form-control" name="phone2" maxlength="4" style="width:90px; float:left;">
        <p style="float:left;"> - </p><input type="text" class="form-control" name="phone3" maxlength="4" style="width:90px;">
        </div>
      </div>
    <div class="form-group row">
      <label for="address" class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">Address</label>
      <input type="text" class="form-control" name="address" placeholder="Address" style="width:500px; position: relative; left:55px">
    </div>
 </fieldset>
    <fieldset class="form-group row">
      <label class="col-sm-2 col-form-label" style="position:relative; font-size:15pt; left:40px; margin-top:10px;">Gender</label>
      <div style="width:500px; position: relative; left:95px; margin-top:10px;">
      <div class="form-check" style="float:left;">
        <label class="form-check-label">
          <input type="radio" class="form-check-input" name="gender" id="optionsRadios1" value="female" checked="">Female
        </label>
      </div>
      <div class="form-check">
      <label class="form-check-label">
          <input type="radio" class="form-check-input" name="gender" id="optionsRadios2" value="male"> Male
        </label>
      </div>
      </div>
    </fieldset>
    <div style="position: relative; left:95px;">
	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="Submit">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="Cancel" onclick="cancel()">
	</div>
</form>
<br><br><br><br><br>


 <script src="resources/assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="resources/assets/js/vendor/bootstrap.min.js"></script>

        <script src="resources/assets/js/jquery.magnific-popup.js"></script>
        <script src="resources/assets/js/jquery.mixitup.min.js"></script>
        <script src="resources/assets/js/jquery.easing.1.3.js"></script>
        <script src="resources/assets/js/jquery.masonry.min.js"></script>

        <!--slick slide js -->
        <script src="resources/assets/css/slick/slick.js"></script>
        <script src="resources/assets/css/slick/slick.min.js"></script>


        <script src="resources/assets/js/plugins.js"></script>
        <script src="resources/assets/js/main.js"></script>
</body>
</html>