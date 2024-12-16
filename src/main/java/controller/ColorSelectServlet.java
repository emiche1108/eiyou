package controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Color;
import model.Comment;
import model.Recipe;
import service.CommentService;
import service.SideDishAdvise; 



@WebServlet("/colorSelect")
public class ColorSelectServlet extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	// 文字エンコーディングの設定(文字化けを解消するために必要)
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        
        // 選ばれた色を取得
        String selectedColor = request.getParameter("color");
        
        // 色に関連する野菜を取得
        List<String> vegetables = getVegetablesByColor(selectedColor);


        // ランダムに野菜を選ぶ
        Random random = new Random();
        String selectedVegetable = vegetables.get(random.nextInt(vegetables.size()));

        // 野菜に関連するコメントを取得
        List<Comment> comments = getCommentsByVegetable(selectedVegetable);

        // リクエスト属性に設定
        request.setAttribute("selectedColor", selectedColor); 
        request.setAttribute("selectedVegetable", selectedVegetable);
        request.setAttribute("comments", comments);

        // JSPに遷移
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
    }
	
	
	
	@WebServlet("/SideDishServlet")
	public class SideDishServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        // ユーザーが選択した野菜
	        String selectedVegetable = request.getParameter("selectedVegetable");

	        // サービスからレシピリストを取得
	        List<Recipe> recipes = SideDishAdvise.getRecipesForSideDishAdvise(selectedVegetable);

	        // JSPにデータを渡す
	        request.setAttribute("recipes", recipes);
	        request.setAttribute("selectedVegetable", selectedVegetable);

	        // JSPへフォワード
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/sideDish.jsp");
	        dispatcher.forward(request, response);
	    }
	}
	
	
	
    // 色に関連する野菜を取得
    private List<String> getVegetablesByColor(String selectedColor) {
        Color colorInfo = Color.getColorInfo(selectedColor);
        return colorInfo != null ? colorInfo.getVegetables() : List.of();  // null チェックしておく
    }

    // 野菜に関連するコメントを取得
    private List<Comment> getCommentsByVegetable(String selectedVegetable) {
        return CommentService.getCommentsForVegetable(selectedVegetable);
    }
    
}
    




