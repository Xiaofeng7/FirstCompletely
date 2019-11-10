package com.gkk.ssm.service.impl;

import com.gkk.ssm.po.InformationForUser;



/** 
 * @ClassName: InformationForUserService 
 * @Description: TODO
 * @author: gxf
 * @date: 2019年11月9日 上午9:41:37  
 */
public interface InformationForUserService {

	public InformationForUser findByUserId(Integer accouId)throws Exception;
	public InformationForUser findById(Integer id)throws Exception;
	public Integer insertInformation(InformationForUser informationForUser)throws Exception;
	public Integer updateInformation(InformationForUser informationForUser)throws Exception;
	public Integer deleteInformation(Integer id)throws Exception;
	
}
