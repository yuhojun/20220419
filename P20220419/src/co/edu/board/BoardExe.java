package co.edu.board;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardService service = new BoardApp();
		while (true) {
			System.out.println("1.등록 2.수정 3.삭제 4.상세조회 5.목록");
			System.out.println("선택>");
			int menu = sc.nextInt();

			if (menu == BoardService.A) {
				service.add();
			} else if (menu == BoardService.B) {
				service.mod();
			} else if (menu == BoardService.C) {
				service.del();
			} else if (menu == BoardService.D) {
				service.find();
			} else if (menu == BoardService.E) {
				service.list();
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
}
