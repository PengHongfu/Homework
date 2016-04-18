package com.briup.ch08.common.test;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.dao.CustomerDao;

public class DaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		dao.save(new Customer("hello",14, "123334"));
		System.out.println("success!");
	}
}
