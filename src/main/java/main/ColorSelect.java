package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SideDish;


@WebServlet("/colorSelect")
public class ColorSelect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // ユーザーが選択した色を取得
        String selectedColor = request.getParameter("color");

        // 色に関連する副菜を取得
        List<SideDish> sideDishes = getSideDishesByColor(selectedColor);

        // コメントを追加
        String comment = "この色にぴったりの副菜をどうぞ！";

        // リクエストスコープにデータをセット
        request.setAttribute("selectedColor", selectedColor);
        request.setAttribute("sideDishes", sideDishes);
        request.setAttribute("comment", comment);

        // 結果ページへフォワード
        request.getRequestDispatcher("/WEB-INF/jsp/result.jsp").forward(request, response);
    }

    private List<SideDish> getSideDishesByColor(String selectedColor) {
        // 色に基づく副菜を取得するロジックを追加
        return null; // 実際にはデータベースやリストから副菜を取得する実装が必要
    }
}
