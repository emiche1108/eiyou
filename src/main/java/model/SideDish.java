package model;

import java.util.ArrayList;
import java.util.List;

public class SideDish {
    private String name;
    private List<String> ingredients; // 副菜に使う材料（野菜など）

    // コンストラクタ
    public SideDish(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public SideDish(String string, String string2, List<Comment> orangeComments) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    
    // 色に関連した副菜メニューを提案するメソッド
    public static List<SideDish> getSideDishesForColor(String color) {
        List<SideDish> sideDishes = new ArrayList<>();
        List<String> ingredients = new ArrayList<>();
        
        // 色に関連した野菜を取得する。ここで合体。
        Color colorInfo = Color.getColorInfo(color);
        ingredients.addAll(colorInfo.getVegetables());

        // 色ごとに副菜メニューを提案
        switch (color) {
            case "赤":
                sideDishes.add(new SideDish("トマトと赤パプリカのサラダ", ingredients));
                sideDishes.add(new SideDish("梅干しときゅうりの漬物", ingredients));
                break;
                
            case "オレンジ":
                sideDishes.add(new SideDish("にんじんのゴマ和え", ingredients));
                sideDishes.add(new SideDish("かぼちゃの煮物", ingredients));
                break;
                
            case "黄":
                sideDishes.add(new SideDish("とうもろこしとさつまいものグラタン", ingredients));
                break;
                
            // 他の色の場合の副菜提案
            default:
                sideDishes.add(new SideDish("選べる副菜がありません", ingredients));
                break;
        }
        return sideDishes;
    }
}



