package model;

import java.util.List;



public class SideDish {
    private String name;  // 副菜の名前
    private String description;
    private List<Comment> comments;


 // コンストラクタ
    public SideDish(String name, String description, List<Comment> comments) {
        this.name = name;
        this.description = description;
        this.comments = comments;
    }


    
    // ゲッター
    public String getName() {
        return name;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // コメント追加メソッド
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}




