package com.gkk.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.gkk.ssm.mapper.InformationForUserMapper;
import com.gkk.ssm.po.InformationForUser;

/**
* @title :instruction
* @author : GUO Kun-kun
* @createDate :2019年6月16日 下午12:15:18
*/
public class InformationForUserServiceImpl implements InformationForUserService {

	@Autowired
	private InformationForUserMapper informationForUserMapper;
	
	
	@Override
	public InformationForUser findByUserId(Integer accouId) throws Exception {
		// TODO Auto-generated method stub
		return informationForUserMapper.findByUserId(accouId);
	}

	@Override
	public Integer insertInformation(InformationForUser informationForUser) throws Exception {
		// TODO Auto-generated method stub
		return informationForUserMapper.insertInformation(informationForUser);
	}

	@Override
	public Integer updateInformation(InformationForUser informationForUser) throws Exception {
		// TODO Auto-generated method stub
		return informationForUserMapper.updateInformation(informationForUser);
	}

	@Override
	public Integer deleteInformation(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return informationForUserMapper.deleteInformation(id);
	}

	@Override
	public InformationForUser findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return informationForUserMapper.findById(id);
	}

}
