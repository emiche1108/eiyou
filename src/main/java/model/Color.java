package model;

import java.util.ArrayList;
import java.util.List;


public class Color {
    private String colorName;
    private List<String> vegetables; 

    // コンストラクタ
    public Color(String colorName, List<String> vegetables) {
        this.colorName = colorName;
        this.vegetables = vegetables;
    }

    
    public Color() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public String getColorName() {
        return colorName;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    
    // 色ごとに野菜の提案。まずは野菜名だけ。メニューは他で処理させる。
    public static Color getColorInfo(String color) {
        List<String> vegetables = new ArrayList<>();
        switch (color) {
            case "オレンジ":
                vegetables.add("にんじん");
                vegetables.add("かぼちゃ");
                break;
            case "赤":
                vegetables.add("トマト");
                vegetables.add("赤パプリカ");
                vegetables.add("梅干し");
                break;
            case "黄":
                vegetables.add("とうもろこし");
                vegetables.add("さつまいも");
                vegetables.add("じゃがいも");
                break;
            case "緑":
                vegetables.add("ほうれん草");
                vegetables.add("ブロッコリー");
                vegetables.add("きゅうり");
                break;
            case "紫":
                vegetables.add("ブルーベリー");
                vegetables.add("ナス");
                break;
            case "白":
                vegetables.add("大根");
                vegetables.add("白ネギ");
                break;
            default:
                vegetables.add("選ばれた色に関連する情報がありません。");
                break;
        }
        return new Color(color, vegetables);
    }


	public void setId(int int1) {
		// TODO 自動生成されたメソッド・スタブ
		
	}


	public void setColorName(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

