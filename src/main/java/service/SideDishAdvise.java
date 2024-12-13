package service;

import java.util.ArrayList;
import java.util.List;

import model.Comment;
import model.SideDish;


public class SideDishAdvise {

    public static List<SideDish> getSideDishesForColor(String color) {
        // 仮のデータ。実際はDAOを使ってデータベースから取得する。
        List<SideDish> sideDishes = new ArrayList<>();
        
        // 色に基づいた副菜をリストに追加
        switch (color) { 
            case "オレンジ":
                List<Comment> orangeComments = new ArrayList<>();
                orangeComments.add(new Comment("美味しい"));
                orangeComments.add(new Comment("さっぱりしている"));
                sideDishes.add(new SideDish("オレンジサラダ", "オレンジを使った爽やかなサラダ", orangeComments));
                break;
            case "赤":
                List<Comment> redComments = new ArrayList<>();
                redComments.add(new Comment("ヘルシー"));
                redComments.add(new Comment("新鮮"));
                sideDishes.add(new SideDish("トマトサラダ", "新鮮なトマトを使ったヘルシーなサラダ", redComments));
                break;
            case "黄":
                List<Comment> yellowComments = new ArrayList<>();
                yellowComments.add(new Comment("甘い"));
                sideDishes.add(new SideDish("バナナサラダ", "バナナとフルーツを使ったサラダ", yellowComments));
                break;
            case "緑":
                List<Comment> greenComments = new ArrayList<>();
                greenComments.add(new Comment("シャキシャキ"));
                sideDishes.add(new SideDish("グリーンサラダ", "新鮮な野菜を使ったサラダ", greenComments));
                break;
            case "紫":
                List<Comment> purpleComments = new ArrayList<>(); // 変数名修正
                purpleComments.add(new Comment("なすび"));
                sideDishes.add(new SideDish("なすびサラダ", "新鮮ななすびを使ったサラダ", purpleComments)); // 説明を修正
                break;
            case "白":
                List<Comment> whiteComments = new ArrayList<>(); // 変数名修正
                whiteComments.add(new Comment("シャキシャキ"));
                sideDishes.add(new SideDish("大根サラダ", "新鮮な大根を使ったサラダ", whiteComments)); // 説明を修正
                break;
                
                
            default:
                sideDishes.add(new SideDish("選べる副菜", "詳細な選択肢がありません", new ArrayList<>()));
                break;
        }
        return sideDishes;
    }
}


