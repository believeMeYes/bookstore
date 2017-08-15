package com.neusoft.bookstore.web.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.bookstore.model.dao.UserDao;

public class Register extends HttpServlet {
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
		 if(name==null||name.trim().isEmpty()){  
	            req.setAttribute("msg", "�ʺŲ���Ϊ��");  
	            req.getRequestDispatcher("page/register.jsp").forward(req, resp);  
	            return;  
	        }  
	        if(password==null||password.trim().isEmpty()){  
	            req.setAttribute("msg", "���벻��Ϊ��");  
	            req.getRequestDispatcher("page/register.jsp").forward(req, resp);  
	            return;  
	        }  
	       
		UserDao u = new UserDao(); 
		System.out.println("�û������ǣ�"+name+"�����ǣ�"+password);
        u.addUser(name, password);  
        System.out.println("�û������ǣ�"+name+"�����ǣ�"+password);
        resp.sendRedirect("page/login.jsp");
        resp.getWriter().write("�û������ǣ�"+name+"�����ǣ�"+password);
        
       
		
	}

}
