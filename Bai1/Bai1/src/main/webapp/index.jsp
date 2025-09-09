<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<div>
    <form action="registration-form" class="form" name="formDangKy" method="GET">
        <div>
            <label>First name:</label>
            <input type="text" name="fn">
        </div>
        <div>
            <label>Last name:</label>
            <input type="text" name="ln">
        </div>
        <div>
            <label>Date of birth:</label>
            <input type="date" name="dob">
        </div>
        <div>
            <label>Email:</label>
            <input type="email"  name="email">
        </div>
        <div>
            <label>Mobile number:</label>
            <input type="text"  name="mn">
        </div>
        <div>
            <label>Gender:</label>
            <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female
        </div>
        <div>
            <label>Address:</label>
            <input type="text"  name="address">
        </div>
        <div>
            <label>City:</label>
            <input type="text"   name="city">
        </div>
        <div>
            <label>Pincode:</label>
            <input type="text"   name="pc">
        </div>
        <div>
            <label>State:</label>
            <input type="text"    name="state">
        </div>
        <div>
            <label>Country:</label>
            <input type="text"    name="country">
        </div>
        <div>
            <label>Hobbies:</label>
            <input type="checkbox" name="hobbies" value="Drawing"> Drawing
            <input type="checkbox" name="hobbies" value="Dancing"> Dancing
            <input type="checkbox" name="hobbies" value="Sketching"> Sketching
            <input type="checkbox" name="hobbies" value="Other"> Other
        </div>
        <div>
            <label>Course applies for:</label>
            BCA <input type="radio" name="course" value="BCA">
            B.Com <input type="radio" name="course" value="B.Com">
            C.Sc <input type="radio" name="course" value="B.Sc">
            B.A <input type="radio" name="course" value="B.A">
        </div>
        <div>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </div>
    </form>

</div>
</body>
</html>