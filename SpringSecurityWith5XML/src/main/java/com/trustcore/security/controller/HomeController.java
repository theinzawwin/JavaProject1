package com.trustcore.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trustcore.security.dto.LoginUserDTO;

@Controller
@RequestMapping(value="/")
public class HomeController {
	@RequestMapping(value="/admin/index.htm", method=RequestMethod.GET)  
    public String home() {  
        return "home";  
    }
	@RequestMapping(value="/manager/manager.htm", method=RequestMethod.GET)  
    public String admin() {  
        return "admin";  
    }  
	@RequestMapping(value="/test")
	public String test(){
		
		return "test";
	}
	
	/* @RequestMapping(value = "/username", method = RequestMethod.GET)
	  @ResponseBody
	  public String currentUserName(Principal principal) {
	     return principal.getName();
	  }
	 @RequestMapping(value = "/photo", method = RequestMethod.GET)
	  @ResponseBody
	  public String getPhoto(Principal principal) {
	    // return principal.getName();
		 return "Photo";
	  }
	*/
}
