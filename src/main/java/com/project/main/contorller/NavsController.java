package com.project.main.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.main.entity.Navs;
import com.project.main.repository.Nav;

@Controller
@RequestMapping("navs")
public class NavsController {
	
	@Autowired
	Nav nav;

	@RequestMapping("index")
	public String  index() throws Exception {
		
		return "index";
	}
	@RequestMapping("addNav")
	public String  addNav() throws Exception {
		
		return "page/addNav";
	}
	@RequestMapping("main")
	public String  main() throws Exception {
		
		return "page/main";
	}
	@RequestMapping("login")
	@ResponseBody
	public String login() throws Exception{
		Iterable<Navs> navs =  nav.findNavs();
		for (Navs n : navs) {
			System.out.println(n.getId());
		}
		return  "login";
	}
	@RequestMapping("icon")
	public String  icon() throws Exception {
		
		return "page/testicon";
	}
}
