package com.gkk.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gkk.ssm.mapper.UserAccountMapper;
import com.gkk.ssm.po.Instrument;
import com.gkk.ssm.po.UserAccount;

/**
* @author : kkGuo
* @createDate :2019年4月6日 下午10:15:44
*/
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountMapper userAccountMapper;
	@Override
	public List<UserAccount> findAccount(String username) throws Exception {
		// TODO Auto-generated method stub
		return userAccountMapper.findAccount(username);
	}
	
	@Override
	public Integer insertAccount(UserAccount account) throws Exception {
		// TODO Auto-generated method stub
		return userAccountMapper.insertAccount(account);
	}

	@Override
	public UserAccount findAccountById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userAccountMapper.findAccountById(id);
	}

	@Override
	public Integer deleteAccount(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userAccountMapper.deleteAccount(id);
	}

	@Override
	public Integer updatePassword(Instrument instrument) throws Exception {
		// TODO Auto-generated method stub
		return userAccountMapper.updatePassword(instrument);
	}

}
