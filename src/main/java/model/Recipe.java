package model;

import java.util.ArrayList;
import java.util.List;


public class Recipe {
	    private String name;            // レシピ名
	    private String description;     // レシピの説明
	    private List<Comment> comments; // コメントのリスト

	    // コンストラクタ
	    public Recipe(String name, String description) {
	        this.name = name;
	        this.description = description;
	        this.comments = new ArrayList<>();
	    }

	    // レシピ名を取得する
	    public String getName() {
	        return name;
	    }

	    // レシピの説明を取得する
	    public String getDescription() {
	        return description;
	    }

	    // コメントを取得する
	    public List<Comment> getComments() {
	        return comments;
	    }

	    // コメントを追加する
	    public void addComment(Comment comment) {
	        comments.add(comment);
	    }

	    // コメントを削除する
	    public void removeComment(Comment comment) {
	        comments.remove(comment);
	    }

	    // レシピの詳細情報を表示する
	    public void displayRecipeInfo() {
	        System.out.println("Recipe Name: " + name);
	        System.out.println("Description: " + description);
	        System.out.println("Comments:");
	        for (Comment comment : comments) {
	            System.out.println(comment.getText());
	        }
	    }
	}
