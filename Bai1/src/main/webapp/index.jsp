<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user?action=tao-user" class="form" name="formDangKy" method="POST">
    <h1>User Registration Form</h1>
    <div>
        <input type="text" name="fn" placeholder="First Name">
        <input type="text" name="ln" placeholder="Last Name">
    </div>

    <div>
        <input type="email"  name="email"  placeholder="Email">
    </div>
    <div>
        <input type="text"  name="pw" placeholder="New password">
    </div>
    <div>
        <label>Date of birth:</label>
        <input type="date" name="dob">
    </div>
    <div>
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
    </div>
    <div>
        <input type="submit" value="Sign Up">
    </div>
</form>

</body>
</html>