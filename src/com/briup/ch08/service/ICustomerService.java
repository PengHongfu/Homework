package com.briup.ch08.service;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.common.exception.ServiceException;

public interface ICustomerService {

	/**
	 * @param name
	 * @param password
	 * @return com.briup.ch08.bean.Customer
	 * @throws com.briup.ch08.common.exception.ServiceException
	 */
	public Customer login(String name, String password) throws ServiceException;

	/**
	 * @param customer
	 */
	public void register(Customer customer);
}
