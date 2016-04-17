package com.briup.ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.briup.ch08.bean.Customer;
import com.briup.ch08.common.util.ConnectionFactory;
/**
 *
 * save
 * find/query
 * update
 * delete
 * */
public class CustomerDao {

	/**
	 */
	public CustomerDao() {

	}

	/**
	 * @param customer
	 */
	public void save(Customer customer) {
				Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			try{
				//1.2 获取连接
				conn = ConnectionFactory.getConn();
				//3. �pstmt对象
				String sql = "insert into rj12_customer(name,password,age) "
						+ "values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, customer.getName());
				pstmt.setString(2, customer.getPassword());
				pstmt.setInt(3, customer.getAge());
				//4. 执行sql
				pstmt.executeUpdate();
				
			} finally {
				//6释放资源
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param id
	 */
	public void deleteById(long id) {

	}

	/**
	 * @param name
	 * @return com.briup.ch08.bean.Customer
	 */
	public Customer findByName(String name) {
		return null;
	}
}
