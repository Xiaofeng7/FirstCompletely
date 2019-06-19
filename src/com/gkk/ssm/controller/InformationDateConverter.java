package com.gkk.ssm.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**alt+shift+j
* @author : kkGuo
* @createDate :2019年4月7日 下午5:08:56
*/

/**
* @title :自定义的时间类型转换器，在springmvc.xml中配置
* @author : GUO Kun-kun
* @createDate :2019年4月30日 上午9:08:44
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
