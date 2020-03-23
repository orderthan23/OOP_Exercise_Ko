package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner scan = new Scanner(System.in);

	public MemberManager() {
	}

	public void insertMember() {
		String id, pwd, name, email;
		char gender;
		int age;
		for (int i = 0; i < m.length; i++) {
			System.out.print("아이디를 입력하시오 :");
			id = scan.next();
			System.out.print("패스워드를 입력하시오 :");
			pwd = scan.next();
			System.out.print("이름을 입력하시오 :");
			name = scan.next();
			System.out.print("나이를 입력하시오 :");
			age = scan.nextInt();
			System.out.print("성별을 입력하시오 :");
			gender = scan.next().charAt(0);
			System.out.print("이메일을 입력하시오 :");
			email = scan.next();

			m[i] = new Member(id, pwd, name, age, gender, email) {
			};
			ctn++;
		}
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다");

	}

	public void searchId() {
		System.out.print("입력할 아이디를 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserId().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void searchName() {
		System.out.print("찾을 이름를 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserName().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void searchEmail() {
		System.out.print("찾을 이메일을 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getEmail().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void printAllMember() {
		// TODO Auto-generated method stub

	}

	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.println("변경할 비밀번호를 입력해주세요");
				String newPw = scan.next();
				m[i].setUserPwd(newPw);
				System.out.println("패스워드 수정이 완료되었습니다 ");
				count++;
			}
			if (count == 0) {
				System.out.println("수정할 회원이 없습니다");
			}

		}

	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.println("변경할 이름을 입력해주세요");
				String newName = scan.next();
				m[i].setUserName(newName);
				System.out.println("이름 수정이 완료되었습니다 ");
				count++;
			}
			if (count == 0) {
				System.out.println("수정할 회원이 없습니다");
			}

		}

	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.println("변경할 이메일를 입력해주세요");
				String newEmail = scan.next();
				m[i].setUserPwd(newEmail);
				System.out.println("이메일 수정이 완료되었습니다 ");
				count++;
			}
			if (count == 0) {
				System.out.println("수정할 회원이 없습니다");
			}

		}

	}

	public  void deleteOne() {
		
		System.out.print("삭제할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getUserId().equals(str)) {
				
				for(int j=i; j<m.length; j++) {
				
					
				}
				System.out.println("이메일 수정이 완료되었습니다 ");
				count++;
			}
			if (count == 0) {
				System.out.println("수정할 회원이 없습니다");
			}

		}
		

	}

	public void printOne(Member m) {
		System.out.println("아이디 :" + m.getUserId());
		System.out.println("패스워드 :" + m.getUserPwd());
		System.out.println("이름 :" + m.getUserName());
		System.out.println("나이 :" + m.getAge());
		System.out.println("성별 :" + m.getGender());
		System.out.println("이메일 :" + m.getEmail());

	}

}
