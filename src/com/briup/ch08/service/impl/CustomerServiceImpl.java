package com.briup.ch08.service.impl;

import com.briup.ch08.service.ICustomerService;
import com.briup.ch08.common.exception.ServiceException;
import com.briup.ch08.dao.CustomerDao;
import com.briup.ch08.bean.Customer;
//逻辑层 多次调用Dao层完成增删改查
public class CustomerServiceImpl implements ICustomerService {
	private CustomerDao customerDao;

	/**
	 */
	public CustomerServiceImpl() {
		//实例化CustomerDao对象
        customerDao = new CustomerDao();
	}

	/**
	 * @param name
	 * @param password
	 * @return com.briup.ch08.bean.Customer
	 */
	public Customer login(String name, String password) throws ServiceException {
    Customer customer = null;
    Customer dbCustomer = customerDao.findByName(name);
    if(dbCustomer!= null){
    	if(dbCustomer.getPassword().equals(password)){
    		customer = dbCustomer;
    	}else{
    		throw new ServiceException("密码错误");
    	}
    	
    }else{
    	throw new ServiceException("该用户不存在");
    }
		return customer;
	}

	/**
	 * 注册
	 * 查询用户名是否被占用 find
	 * 注册用户信息 save
	 * 初始化用户信息（送金币）update
	 * @param customer
	 */
	public void register(Customer customer) {
		customerDao.save(customer);

	}
}
