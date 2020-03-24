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
			System.out.println((i+1)+"번째 회원");
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
			System.out.println("===============");
			System.out.println();

			m[i] = new Member(id, pwd, name, age, gender, email);
			
			ctn++;
		}
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다");

	}

	public void searchId() {
		System.out.print("입력할 아이디를 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserId().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void searchName() {
		System.out.print("찾을 이름를 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserName().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void searchEmail() {
		System.out.print("찾을 이메일을 입력하세요 :");
		String str = scan.next();
		for (int i = 0; i < ctn; i++) {
			if (m[i].getEmail().equals(str)) {

				printOne(m[i]);
			}

		}

	}

	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.print("변경할 비밀번호를 입력해주세요");
				String newPw = scan.next();
				m[i].setUserPwd(newPw);
				System.out.println("패스워드 수정이 완료되었습니다 ");
				count++;
			}
			
		}
		if (count == 0) {
			System.out.println("수정할 회원이 없습니다");
		}


	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.print("변경할 이름을 입력해주세요");
				String newName = scan.next();
				m[i].setUserName(newName);
				System.out.println("이름 수정이 완료되었습니다 ");
				count++;
			}
			

		}
		if (count == 0) {
			System.out.println("수정할 회원이 없습니다");
		}

	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.print("변경할 이메일를 입력해주세요");
				String newEmail = scan.next();
				m[i].setEmail(newEmail);
				System.out.println("이메일 수정이 완료되었습니다 ");
				count++;
			}
			
		}
		if (count == 0) {
			System.out.println("수정할 회원이 없습니다");
		}


	}

	public void deleteOne() {

		System.out.print("삭제할 회원의 아이디를 입력하세요 :");

		String str = scan.next();
		int count = 0;
		for (int i = 0; i < ctn; i++) {
			if (m[i].getUserId().equals(str)) {
				System.out.println(m[i].getUserId()+"님의 정보가 삭제 되었습니다");

				for (int j = i; j < ctn; j++) {
					
					if(m[j]!=m[ctn-1]) {
					m[j]=m[j+1];
					}
					
					
					

				}
				m[ctn-1]=null;
				ctn--;
				
				count++;
			}
			

		}
		if (count == 0) {
			System.out.println("삭제할 회원이 없습니다");
		}

	}
	
	public void deleteAll() {
		
		for(int i=0; i<ctn; i++) {
			
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender('\u0000');
			m[i].setEmail(null);
		}
		ctn=0;
	}

	public void printOne(Member m) {
		System.out.println("아이디 :" + m.getUserId());
		System.out.println("패스워드 :" + m.getUserPwd());
		System.out.println("이름 :" + m.getUserName());
		System.out.println("나이 :" + m.getAge());
		System.out.println("성별 :" + m.getGender());
		System.out.println("이메일 :" + m.getEmail());

	}

	public void printAllMember() {
		for (int i=0; i<ctn; i++) {
			System.out.println((i+1)+"번째 회원");
			System.out.println("아이디 :" + m[i].getUserId());
			System.out.println("패스워드 :" + m[i].getUserPwd());
			System.out.println("이름 :" + m[i].getUserName());
			System.out.println("나이 :" + m[i].getAge());
			System.out.println("성별 :" + m[i].getGender());
			System.out.println("이메일 :" + m[i].getEmail());
			System.out.println("=================");
			System.out.println();
		}

	}
}
