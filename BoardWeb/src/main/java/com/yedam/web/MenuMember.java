package com.yedam.web;
//회원 관련 메뉴와 컨트롤 등록 팀장

import java.util.HashMap;
import java.util.Map;

import com.yedam.common.Control;
import com.yedam.control.AddFormControl;
import com.yedam.control.AddMemberControl;
import com.yedam.control.GetMemberControl;
import com.yedam.control.MemberListControl;
import com.yedam.control.ModFormControl;
import com.yedam.control.ModifyMemberControl;
import com.yedam.control.RemoveMemberControl;

public class MenuMember {
	private static MenuMember instance = new MenuMember();

	private MenuMember() {
	}

	public static MenuMember getInstance() {
		return instance;
	}

	public Map<String, Control> memuMap() {
		Map<String, Control> menu = new HashMap<>();
		// 기능등록
		menu.put("/addForm.do", new AddFormControl()); // 회원등록페이지
		menu.put("/addMember.do", new AddMemberControl()); // 회원등록처리
		menu.put("/memberList.do", new MemberListControl()); // 회원목록페이지
		menu.put("/getMember.do", new GetMemberControl()); // 회원아이디로 상세조회
		menu.put("/modifyForm.do", new ModFormControl()); // 수정화면 호출
		menu.put("/modifyMember.do", new ModifyMemberControl()); // 수정처리
		menu.put("/removeMember.do", new RemoveMemberControl()); // 삭제처리

		return menu;
	}
}
