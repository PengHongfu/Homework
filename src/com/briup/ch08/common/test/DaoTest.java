package com.briup.ch08.common.test;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.dao.CustomerDao;

public class DaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		dao.save(new Customer("周捷",12, "123321"));
		System.out.println("success!");
	}
}
