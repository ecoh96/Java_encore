package com.encore.post.view;
import java.util.Scanner;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {
	
	private	PostService		service	;
	private	PostRequestDTO	params	;
	
	public PostView() {
		
	}
	
	public PostView(PostService service, PostRequestDTO params) {
		this.service	= service	;
		this.params		= params	;
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		while(true) {	// break 없는 무한 루프.
			System.out.println(">>>> Hanhwa software camp Beyond 5th <<<<");
			System.out.println("1. login")		;
			System.out.println("2. join")		;
			System.out.println("3. post write")	;
			System.out.println("4. post delete");
			System.out.println("99. exit")		;
			System.out.print("input number : ")	; // println : 개행, print : 출력후 개행 X
			int number = scan.nextInt();
			
			if (number==99) {
				System.exit(0);
			}
			if (number==3) {
				requestSave();
			}
			if (number==4) {
				requestDelete();
			}
		}
	}
	
	public void requestSave() {
		System.out.println("debug >>>> client post view");
		Scanner	scan	= new Scanner(System.in);
		System.out.print("아이디\t: ")		;
		String	id		= scan.nextLine()	;
		System.out.print("제목\t: ")			;
		String	title	= scan.nextLine()	;
		System.out.print("내용\t: ")			;
		String	content	= scan.nextLine()	;
		System.out.print("조회수\t: ")		;
		int		cnt		= scan.nextInt()	;
		System.out.print("공개여부\t: ")		;
		boolean	isFlag	= scan.hasNext()	;
		
		
		// PostRequestDTO	request	= new PostRequestDTO(id, title, content, cnt, isFlag);
		params.setId(id)			;
		params.setTitle(title)		;
		params.setContent(content)	;
		params.setCnt(cnt)			;
		params.setFlag(isFlag)		;
		// PostService		service = new PostService();
		String			msg		= service.savePost(params);
		
		System.out.println("Result >>>> " + msg + "\n");
	}
	
	// requestDelete 추가
	// terminal 로부터 사용자의 아이디만 입력을 받아서
	// 해당 아이디를 DTO에 넣고
	// PostService 클래스에 정의(우리가 정의해야 함.)된 postDelete(PostRequestDTO params)
	// 메서드를 호출하여 삭제되었습니다. 메시지를 반환받아서 출력
	public void requestDelete() {
		System.out.println("debug >>>> client post delete view");
		Scanner	scan	= new Scanner(System.in);
		System.out.print("아이디\t: ")		;
		String	id		= scan.nextLine()	;
		
		// PostRequestDTO	request	= new PostRequestDTO(id);
		params.setId(id);
		// PostService		service = new PostService();
		String			msg		= service.deletePost(params);
		
		System.out.println("Result >>>> " + msg + "\n");
	}
}
