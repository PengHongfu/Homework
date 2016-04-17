package com.briup.ch08.common.test;

import com.briup.ch08.common.util.ConnectionFactory;

public class ConnTest {
	public static void main(String[] args) {
		try {
			System.out.println(ConnectionFactory.getConn());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
