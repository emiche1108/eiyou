<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="model.SideDish" %>
<%@ page import="model.Comment" %>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ja">


<head>
    <meta charset="UTF-8">
    <title>副菜の提案</title>
</head>


<body>
    <h1>選ばれた色に基づく副菜の提案</h1>
    
    <h2>コメント:</h2>
    <p>${comment.text}</p>

    <h2>おすすめの副菜:</h2>
    <ul>
        <c:forEach var="sideDish" items="${sideDishes}">
            <li>${sideDish.name} - ${sideDish.description}</li>
        </c:forEach>
    </ul>
</body>


</html>


