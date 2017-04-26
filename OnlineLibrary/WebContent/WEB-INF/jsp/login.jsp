<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp"/>
<body>
<h2>Bejelentkezés</h2>
<form>
<div>
   <label for="name">Név:</label>
   <input type="text" id="name" name="user_name">
</div>
<div>
   <label for="passwd">Jelszó:</label>
   <input type="password" id="passwd" name="user_passwd">
</div>
<div>
   <input type="submit" id="btn" value="Bejelentkezés">
</div>
</form>
</body>
</html>