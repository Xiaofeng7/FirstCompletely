package com.gkk.ssm.service.impl;

import com.gkk.ssm.po.InformationForUser;


/**
* @title :instruction
* @author : GUO Kun-kun
* @createDate :2019年6月16日 下午12:14:35
*/
public interface InformationForUserService {

	public InformationForUser findByUserId(Integer accouId)throws Exception;
	public InformationForUser findById(Integer id)throws Exception;
	public Integer insertInformation(InformationForUser informationForUser)throws Exception;
	public Integer updateInformation(InformationForUser informationForUser)throws Exception;
	public Integer deleteInformation(Integer id)throws Exception;
	
}
