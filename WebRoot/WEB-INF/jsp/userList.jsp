<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.sxx.entity.User" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>User List</title>


</head>

<body>
	<h4>
		<b>User List</b>
	</h4>
	<table>
		<tr>
			<th style="width: 100px; height: 15px; border:solid  1px; " ></th>
			<th style="width: 100px; height: 15px; border:solid  1px;">username</th>
			<th style="width: 50px; height: 15px; border:solid  1px;">password</th>
			<td style="width: 100px; height: 15px; border:solid  1px;"></td>
		</tr>
		<%
			List<User> userList = (List<User>)request.getAttribute("user");
			Iterator<User> i = userList.iterator();
			int j = 0;
			while(i.hasNext()) {
				j++;
				User u = i.next();
		%>
				<tr>
					<td style="width: 100px; height: 15px; border:solid  1px;"><%=j %></td>
					<td style="width: 100px; height: 15px; border:solid  1px;"><%=u.getUserName() %></td>
					<td style="width: 100px; height: 15px; border:solid  1px;"><%=u.getPassword() %></td>
					<td style="width: 100px; height: 15px; border:solid  1px;">
					<%
						if(u.getIsDel() == 0) {
					%>
						<a href="<%=basePath%>user/<%=u.getId() %>/del">delete</a>
					<%
					 	}
					 %>
					 </td>
				</tr>
		<%
			}
		 %>
	</table>
</body>
</html>
