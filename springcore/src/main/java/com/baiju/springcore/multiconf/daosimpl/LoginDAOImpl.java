package com.baiju.springcore.multiconf.daosimpl;

import com.baiju.springcore.multiconf.daos.LoginDAO;

public class LoginDAOImpl implements LoginDAO{

	public void getLoginInfoFromDB() {
		System.out.println("getLoginInfoFromDB() called from LoginDAOImpl");	
	}
}
