package com.gkk.ssm.mapper;

import com.gkk.ssm.po.InformationForUser;

public interface InformationForUserMapper {
	public InformationForUser findByUserId(Integer accouId)throws Exception;
	public InformationForUser findById(Integer id)throws Exception;
	public Integer insertInformation(InformationForUser informationForUser)throws Exception;
	public Integer updateInformation(InformationForUser informationForUser)throws Exception;
	public Integer deleteInformation(Integer id)throws Exception;
}