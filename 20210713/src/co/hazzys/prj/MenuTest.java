package co.hazzys.prj;

import java.util.Scanner;

public class MenuTest {

	private Scanner sc = new Scanner(System.in);

	private void menuTitle() {
		System.out.println("◼◻◼◻◼◻◼◻◼◻◼◻◼");
		System.out.println("<< 학생관리시스템 >>");
		System.out.println(" 1.학생 목록 조회");
		System.out.println(" 2.학생 정보 조회");
		System.out.println(" 3.학생 정보 등록");
		System.out.println(" 4.학생 정보 수정");
		System.out.println(" 5.학생 정보 삭제");
		System.out.println("  6.시스템 종료");
		System.out.println("◼◻◼◻◼◻◼◻◼◻◼◻◼");
		System.out.println("원하는 메뉴 번호를 입력하세요.");
	}

	private void menuRun() {
		boolean b = true;
		int choice;
		do {
			menuTitle();
			switch (choice = sc.nextInt()) {
			case 1:
				studentList();
				break;
			case 2:
				studentSelect();
				break;
			case 3:
				studentInsert();
				break;
			case 4:
				studentUpdate();
				break;
			case 5:
				studentDelete();
				break;
			case 6:
				System.out.println("시스템 종료");
				b = false;
				break;
			}
		} while (b);
	}

	private void studentList() { // 학생 전제 목록 조회
		System.out.println("학생 전체 목록");
	}

	private void studentSelect() { // 학생 한명 정보 조회
		System.out.println("검색할 학생의 학번을 입력하세요.");
		String id = sc.next();
		System.out.println(id + "학생의 정보를 조회했습니다.");
	}

	private void studentInsert() { // 학생 정보 등록
		System.out.println("추가할 학생의 학번을 입력하세요.");
		String id = sc.next();sc.nextLine();
		System.out.println("추가할 학생의 이름을 입력하세요.");
		String name = sc.next();sc.nextLine();
		System.out.println("추가할 학생의 나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("학번 : " + id + "\t 이름 : " + name + "\t 나이 : " + age);
	}

	private void studentUpdate() { // 학생 정보 수정
		studentSelect();
		System.out.println("학생의 정보를 수정했습니다.");
	}

	private void studentDelete() { // 학생 정보 삭제
		System.out.println("추가할 학생의 학번을 입력하세요.");
		String id = sc.next();
		System.out.println(id + "학번의 정보를 삭제했습니다.");
	}

	public void run() {
		menuRun(); // 메뉴 시작
		sc.close();
	}
}
