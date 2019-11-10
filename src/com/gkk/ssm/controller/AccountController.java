package com.gkk.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gkk.ssm.annotation.SystemControllerLog;
import com.gkk.ssm.po.InformationForUser;
import com.gkk.ssm.po.Instrument;
import com.gkk.ssm.po.UserAccount;
import com.gkk.ssm.service.impl.InformationForUserService;
import com.gkk.ssm.service.impl.UserAccountService;


/** 
 * @ClassName: AccountController 
 * @Description: TODO
 * @author: gxf
 * @date: 2019年11月8日 下午6:29:01  
 */
@Controller
@RequestMapping("/myaccount")
public class AccountController {

	@Autowired
	private UserAccountService userAccountService;
	@Autowired
	private InformationForUserService informationForUserService;
	
	/**  
	* @Title: loginModelAndView  
	* @Description: TODO
	* @param @param request
	* @param @param username
	* @param @param passwd
	* @param @return
	* @param @throws Exception
	* @return String
	* @throws  
	*/ 
	@SystemControllerLog(actionType = "用户操作",description="用户用户登录")
	@RequestMapping("/login")
	public String loginModelAndView(HttpServletRequest request,String username,String passwd) throws Exception {
		
		List<UserAccount> accounts = userAccountService.findAccount(username);
		if (accounts !=null &accounts.size()>0) {
			String userName = accounts.get(0).getUsername();
			String passWd = accounts.get(0).getPasswd();
			Integer id = accounts.get(0).getId();
			if (userName.equals(username)&passWd.equals(passwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("accountId", id);
				session.setAttribute("username", userName);
				return "forward:information.action";
			}else {
				return "error";
			}
		}else {
			return "error";
		}
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request,UserAccount account,InformationForUser information)throws Exception{
		Integer isSuccess = userAccountService.insertAccount(account);
		if (isSuccess!=0) {
			Integer id = account.getId();
			information.setUserid(id);
			informationForUserService.insertInformation(information);
			HttpSession session = request.getSession();
			session.setAttribute("accountId", id);
			session.setAttribute("username", account.getUsername());
			return "forward:information.action";
		}
		
		
		return "forward:/jsp/register.jsp";
		
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		
		return model;
		
	}
	
	/**  
	* @Title: information  
	* @Description:展示用户信息
	* @param @param request
	* @param @return
	* @param @throws Exception
	* @return ModelAndView
	* @throws  
	*/  
	@SystemControllerLog(actionType = "用户操作",description="用户查看用户信息")
	@RequestMapping("/information")
	public ModelAndView information(HttpServletRequest request)throws Exception{
		HttpSession session = request.getSession();
		Integer id = (Integer) session.getAttribute("accountId");
		String username = (String) session.getAttribute("username");
		InformationForUser information = informationForUserService.findByUserId(id);
		Instrument instrument = new Instrument();
		instrument.setInformationForUser(information);
		instrument.setUsername(username);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("person",instrument);
		modelAndView.setViewName("information");
		return modelAndView;
		
	}
	
	/**  
	* @Title: goUpdateInformation  
	* @Description: 展示用户信息并提供修改
	* @param @param request
	* @param @return
	* @param @throws Exception
	* @return ModelAndView
	* @throws  
	*/  
	@RequestMapping("/goUpdateInformation")
	public ModelAndView goUpdateInformation(HttpServletRequest request)throws Exception{
		HttpSession session = request.getSession();
		Integer id = (Integer) session.getAttribute("accountId");
		String username = (String) session.getAttribute("username");
		InformationForUser information = informationForUserService.findByUserId(id);
		Instrument instrument = new Instrument();
		instrument.setInformationForUser(information);
		instrument.setUsername(username);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("person",instrument);
		modelAndView.setViewName("updateInformation");
		return modelAndView;
		
	}
	
	/**  
	* @Title: updateInformation  
	* @Description: 更新用户信息
	* @param @param request
	* @param @param information
	* @param @return
	* @param @throws Exception
	* @return String
	* @throws  
	*/  
	@SystemControllerLog(actionType = "用户操作",description="用户更新用户信息")
	@RequestMapping("/updateInformation")
	public String updateInformation(HttpServletRequest request,InformationForUser information)throws Exception{
		HttpSession session = request.getSession();
		Integer id = (Integer) session.getAttribute("accountId");
		String username = (String) session.getAttribute("username");
		
		InformationForUser information2 = informationForUserService.findByUserId(id);
		information2.setAddress(information.getAddress());
		if(information.getBirthday()!=null)
		information2.setBirthday(information.getBirthday());
		information2.setEmail(information.getEmail());
		information2.setNickname(information.getNickname());
		information2.setInstruction(information.getInstruction());
		information2.setTel(information.getTel());
		informationForUserService.updateInformation(information2);
		return "forward:information.action";
		
	}
	
	/**  
	* @Title: deleteAccount  
	* @Description:删除用户
	* @param @param inId
	* @param @return
	* @param @throws Exception
	* @return ModelAndView
	* @throws  
	*/  
	@SystemControllerLog(actionType = "管理员操作",description="管理员删除用户")
	@RequestMapping("/deleteAccount")
	public ModelAndView deleteAccount(Integer inId)throws Exception{
		InformationForUser information = informationForUserService.findById(inId);
		if(information!=null) {
			informationForUserService.deleteInformation(information.getId());
			userAccountService.deleteAccount(information.getUserid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
		
	}
}
