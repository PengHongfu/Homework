package com.briup.ch08.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.service.ICustomerService;
import com.briup.ch08.service.impl.CustomerServiceImpl;

//http://localhost:8080/ch
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//关联service对象
    private ICustomerService  customerService;  
    
    public RegisterServlet() {
        super();
        customerService = new CustomerServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//获取参数
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		//调用service层代码完成注册
		//System.out.println(name);
		//System.out.println(password);验证提取
		//System.out.println(age);
		 Customer customer = new Customer(name,age,password);
		 customerService.register(customer);
	//页面跳转
		 
		// request.getRequestDispatcher("/success.jsp").forward(request, response);
	}
}
