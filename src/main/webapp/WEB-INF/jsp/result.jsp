<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>副菜提案結果</title>
</head>


<body>
    <main>
        <h1>選ばれた色: ${color}</h1>

        <!-- 選んだ色に関連する野菜 -->
        <section>
            <h2>関連する野菜</h2>
            <ul>
                <li>トマト</li>
                <li>赤ピーマン</li>
                <li>ラディッシュ</li>
                <!-- 必要に応じて他の野菜も追加 -->
            </ul>
        </section>

        <!-- 副菜の提案 -->
        <section>
            <h2>副菜の提案</h2>
            <p>提案された副菜は: ${sideDish.name}</p>
            <p>副菜の説明: ${sideDish.description}</p>
        </section>

        <!-- コメント -->
        <section>
            <h2>コメント</h2>
            <p>${comment.text}</p>
        </section>


        <!-- ボタン群 -->
        <section>
            <!-- 気に入ったボタン -->
            <form action="result.jsp" method="post">
                <button type="submit" name="like" value="true">これで決定</button>
            </form>

            <!-- やり直しボタン -->
            <form action="ReturnColorSelect" method="post">
                <button type="submit">やり直し</button>
            </form>

            <!-- トップページへ -->
            <form action="index.jsp" method="get">
                <button type="submit">トップページへ</button>
            </form>
        </section>
    </main>
    
</body>
</html>





