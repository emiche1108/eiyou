package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ColorDAO;
import dao.CommentDAO;
import dao.SideDishDAO;
import model.Color;
import model.Comment;


@WebServlet("/ColorSelect")
public class ColorSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // ユーザーが選択した色を取得
        String selectedColor = request.getParameter("color");
        
     // Colorクラスを使って、色に関連する野菜を取得
        Color colorInfo = Color.getColorInfo(selectedColor);
        
     // 副菜に関連するコメントをDAOから取得
        List<Comment> comments = comment.getCommentsBySideDish(selectedSideDish);

        // 野菜のリストをリクエストスコープにセット
        request.setAttribute("vegetables", colorInfo.getVegetables());
        
        // ここで、色リストや副菜データ、コメントデータをDAOから取得する処理を追加
        ColorDAO colorDAO = new ColorDAO();
        SideDishDAO sideDishDAO = new SideDishDAO();
        CommentDAO commentDAO = new CommentDAO();

     // 色リストや副菜、コメントをDAOから取得
        List<Color> colorList = colorDAO.getColorList();  // 例: ColorDAOから色リストを取得

        // 色に関連する副菜を取得
        List<String> sideDishes = sideDishDAO.getSideDishesForColor(selectedColor);  // 色に関連する副菜を取得

        // 副菜に基づくコメントを取得
        List<Comment> comments = commentDAO.getCommentsBySideDish(selectedSideDish);  // 副菜からコメントを取得

        
        // 取得したデータをリクエスト属性にセット
        request.setAttribute("colorList", colorList);
        request.setAttribute("sideDishes", sideDishes);
        request.setAttribute("comments", comments);

        // 結果ページにフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
    }
}
