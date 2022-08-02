<%
	out.println("This is my first web application <br>");
	String reqName = request.getParameter("myname");
	out.println("Name is converted to uppercase " + reqName.toUpperCase());
%>