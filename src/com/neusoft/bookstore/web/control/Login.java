package com.neusoft.bookstore.web.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.bookstore.model.dao.UserDao;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		resp.setHeader("Content-type","text/html;charset=UTF-8");
		System.out.println("�û������ǣ�"+name+"�����ǣ�"+password);
		UserDao u=new UserDao();
		String pwd = u.findUsername(name,password);
		if (pwd!=null) {
			resp.sendRedirect("index.jsp");
		}
		System.out.println("�û������ǣ�"+name+"�����ǣ�"+password);
 
        System.out.println("�û������ǣ�"+name+"�����ǣ�"+pwd);  
        System.out.println("��½�ɹ�");
      
        
       
		
	}

}
