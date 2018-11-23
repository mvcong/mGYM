<%@page import="mvc.mGYM.dao.DAO_NhanVien"%>
<%@page import="mvc.mGYM.utils.ObjectDAO"%>
<%@page import="mvc.mGYM.model.NhanVien"%>
<%@page import="mvc.mGYM.utils.DAO" %>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		NhanVien nv = new NhanVien();
		nv.setMaNV("NV01");
		nv.setTenNV("Mai Van Cong");
		nv.setGioiTinh("Nam");
		nv.setChucVu("admin");
		ObjectDAO dao = new DAO_NhanVien();
		dao.saveOrUpdate(nv);
	%>
</body>
</html>