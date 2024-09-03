package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;

public class RemoveMemberControl implements Control {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// id 파라미터를 받아서 db 삭제처리, 목록이동
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		
		MemberService svc = new MemberServiceImpl();
		
		if(svc.removeMember(id)) {
			response.sendRedirect("memberList.do");
		} else {
			request.setAttribute("message", "삭제중에 오류가 있습니다.");
			request.getRequestDispatcher("WEB-INF/html/modifyForm.jsp").forward(request, response);
		}

	}

}
