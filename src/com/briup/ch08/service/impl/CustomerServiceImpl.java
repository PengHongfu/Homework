package com.briup.ch08.service.impl;

import com.briup.ch08.service.ICustomerService;
import com.briup.ch08.common.exception.ServiceException;
import com.briup.ch08.dao.CustomerDao;
import com.briup.ch08.bean.Customer;

public class CustomerServiceImpl implements ICustomerService {
	public CustomerDao theCustomerDao;

	/**
	 */
	public CustomerServiceImpl() {

	}

	/**
	 * @param name
	 * @param password
	 * @return com.briup.ch08.bean.Customer
	 */
	public Customer login(String name, String password) throws ServiceException {
		
		return null;
	}

	/**
	 * @param customer
	 */
	public void register(Customer customer) {

	}
}
