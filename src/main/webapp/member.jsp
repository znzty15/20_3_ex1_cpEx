<%@page import="com.javaGG.daodto.MemberDAO"%>
<%@page import="com.javaGG.daodto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>member.jsp</title>
</head>
<body>
	<%
		MemberDAO memberDAO = new MemberDAO();
		ArrayList<MemberDTO> dtos = memberDAO.memberSelect();
		
		for(int i=0; i<dtos.size(); i++){
			MemberDTO dto = dtos.get(i);
			String name = dto.getName();
			String id = dto.getId();
			String pw = dto.getPw();
			String ph = dto.getPh1() + " - " + dto.getPh2() + " - " + dto.getPh3();
			String gender = dto.getGender();
			
			out.println("이름  : " + name + "<br>");
			out.println("아이디  : " + id + "<br>");
			out.println("비밀번호  : " + pw + "<br>");
			out.println("전화번호  : " + ph + "<br>");
			out.println("성별  : " + gender + "<br>");
			out.println("=============================" + "<br>");			
		}
	%>
</body>
</html>