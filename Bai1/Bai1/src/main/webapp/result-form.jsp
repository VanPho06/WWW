<%@ page import="iuh.fit.se.bai1.Student" %><%--
  Created by IntelliJ IDEA.
  User: Pho
  Date: 9/9/2025
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result submit</title>
</head>
<body>
<%
  Student st = new Student();
  st = (Student) request.getAttribute("student");
  out.println(
          "First Name: " + st.getFirstName()
          + "<br/> Last name: " + st.getLastName()
          +"<br/> Email: " + st.getEmail()
                  +"<br/> Gender: "+ st.getGender()
                  +"<br/> Birthday: "+st.getBirthday()
  );
%>
</body>
</html>
