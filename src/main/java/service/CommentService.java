package service;

import model.Comment;


public class CommentService {
    // 色に基づいてコメントを生成する
    public static Comment generateCommentForColor(String color) {
        String commentText = "";

        switch (color) {
            case "赤":
                commentText = "赤色の食べ物は健康に良いですね！";
                break;
            case "オレンジ":
                commentText = "オレンジ色の食べ物はビタミン豊富！";
                break;
            case "黄":
                commentText = "黄色い食べ物は元気をくれる！";
                break;
            case "緑":
                commentText = "緑色の食べ物は栄養満点です！";
                break;
            case "紫":
                commentText = "紫色の食べ物は抗酸化作用が高い！";
                break;
            case "白":
                commentText = "白い食べ物はヘルシーでおいしい！";
                break;
            default:
                commentText = "素晴らしい選択です！";
                break;
        }

        return new Comment(commentText, commentText, commentText); // コメントオブジェクトを生成して返す
    }
}


