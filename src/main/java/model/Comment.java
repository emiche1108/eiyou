package model;


public class Comment {
    private String author;
    private String content;
    private String relatedColorOrDish; // 関連する色や副菜名

    // コンストラクタ
    public Comment(String author, String content, String relatedColorOrDish) {
        this.author = author;
        this.content = content;
        this.relatedColorOrDish = relatedColorOrDish;
    }

	public Comment() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// ゲッターとセッター
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRelatedColorOrDish() {
        return relatedColorOrDish;
    }

    public void setRelatedColorOrDish(String relatedColorOrDish) {
        this.relatedColorOrDish = relatedColorOrDish;
    }

	public void setId(int int1) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void setText(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void setColor(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public char[] getText() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}

