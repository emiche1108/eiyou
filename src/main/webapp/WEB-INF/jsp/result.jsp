<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ja">

<%@ page import="java.util.List" %>
<%@ page import="model.Comment" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>副菜のご提案</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }

        main {
            margin: 20px;
        }

        section {
            margin-bottom: 20px;
        }

        h1, h2 {
            color: #333;
        }

        .vegetable-list {
            list-style-type: none;
            padding-left: 0;
        }

        .vegetable-list li {
            background-color: #f4f4f4;
            padding: 10px;
            margin-bottom: 5px;
            border-radius: 5px;
        }

        .side-dish {
            background-color: #e0f7fa;
            padding: 10px;
            border-radius: 5px;
        }

        .comment-item {
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 5px;
        }
    </style>
</head>


<body>
    <main>
        <h1>選ばれた色: ${selectedColor}</h1>
        <h2>選ばれた野菜：${selectedVegetable}</h2>
        
        
        <!-- 副菜の提案 -->
        <section>
            <h2>副菜の提案</h2>
            <div class="side-dish">
                <p>提案された副菜は: ${sideDish.name}</p>
                <p>副菜の説明: ${sideDish.description}</p>
            </div>
        </section>

        <!-- コメント -->
        <section>
            <h2>管理栄養士おすすめポイント</h2>
            <ul>
            	<c:forEach var="comment" items="${comments}">
            		<li>${comment.content}</li>
        		</c:forEach>
            </ul>
        </section>
        
        
        <!-- 戻るボタン -->
        <form action="ReturnColorSelect" method="get">
        	<button type="submit">気に入らない。やり直し</button>
    	</form>
        
    </main>
</body>

</html>

