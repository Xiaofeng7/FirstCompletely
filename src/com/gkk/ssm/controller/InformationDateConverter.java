package com.gkk.ssm.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**alt+shift+j
* @author : kkGuo
* @createDate :2019��4��7�� ����5:08:56
*/

/**
* @title :�Զ����ʱ������ת��������springmvc.xml������
* @author : GUO Kun-kun
* @createDate :2019��4��30�� ����9:08:44
*/
public class InformationDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (!source.equals("")) 
				return simpleDateFormat.parse(source);
			else
				return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
