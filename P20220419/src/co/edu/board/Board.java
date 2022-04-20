package co.edu.board;

public class Board {
	private int num;
	private String title;
	private String content;
	private String name;
	private String date;
	//생성자
	public Board(int num, String title, String content, String name, String date) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.date = date;
	}
	//생성자
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
//메서드
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", name=" + name + ", date=" + date
				+ "]";
	}
	
	
	
}
