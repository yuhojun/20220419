package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;


public class BoardApp implements BoardService {
	Scanner sc = new Scanner(System.in);
	// 게시글번호 제목 내용 작성자 작성일시
	 ArrayList<Board> board = new ArrayList<Board>();
	@Override
	public void add() {
		System.out.println("게시글번호를 등록합니다.");
		int num = sc.nextInt();
		System.out.println("제목을 등록합니다");
		String title = sc.next();
		System.out.println("내용을 등록합니다");
		String content = sc.next();
		System.out.println("작성자를 등록합니다");
		String name = sc.next();
		System.out.println("작성일시를 등록합니다");
		String date = sc.next();
		
		board.add(new Board(num, title, content, name, date));
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board list() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
