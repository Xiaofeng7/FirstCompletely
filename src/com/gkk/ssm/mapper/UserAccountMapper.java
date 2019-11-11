package com.gkk.ssm.mapper;

import java.util.List;

import com.gkk.ssm.po.Instrument;
import com.gkk.ssm.po.UserAccount;

public interface UserAccountMapper {

	List<UserAccount> findAccount(String username)throws Exception;
	
	UserAccount findAccountById(Integer id)throws Exception;
	
	Integer insertAccount(UserAccount account)throws Exception;
	
	Integer deleteAccount(Integer id)throws Exception;
	
	Integer updatePassword(Instrument instrument)throws Exception;

	
	
	
}