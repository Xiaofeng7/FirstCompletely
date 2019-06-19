package com.gkk.ssm.service.impl;

import java.util.List;

import com.gkk.ssm.po.Instrument;
import com.gkk.ssm.po.UserAccount;

/**
* @author : kkGuo
* @createDate :2019��4��6�� ����10:10:50
*/
public interface UserAccountService {

	List<UserAccount> findAccount(String username)throws Exception;//ͨ���û�������
	
	UserAccount findAccountById(Integer id)throws Exception;//ͨ��id����
	
	Integer insertAccount(UserAccount account)throws Exception;//�����û�,����ֵΪ�������ݿ������
	
	Integer deleteAccount(Integer id)throws Exception;//ͨ��idɾ���û�,����ֵΪɾ������������
	
	Integer updatePassword(Instrument instrument)throws Exception;//�޸����룬����useAffectedRows=true�󷵻�ֵΪ���µ�����

}
