package com.gkk.ssm.service.impl;

import java.util.List;

import com.gkk.ssm.po.Instrument;
import com.gkk.ssm.po.UserAccount;

/**
* @author : kkGuo
* @createDate :2019年4月6日 下午10:10:50
*/
public interface UserAccountService {

	List<UserAccount> findAccount(String username)throws Exception;//通过用户名查找
	
	UserAccount findAccountById(Integer id)throws Exception;//通过id查找
	
	Integer insertAccount(UserAccount account)throws Exception;//插入用户,返回值为插入数据库的条数
	
	Integer deleteAccount(Integer id)throws Exception;//通过id删除用户,返回值为删除的数据条数
	
	Integer updatePassword(Instrument instrument)throws Exception;//修改密码，配置useAffectedRows=true后返回值为更新的条数

}
