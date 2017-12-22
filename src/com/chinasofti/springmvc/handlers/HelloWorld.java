/**
 * HelloWorld.java
 * com.chinasofti.springmvc.handlers
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月21日 		admin
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
 */

package com.chinasofti.springmvc.handlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

/**
 * ClassName:HelloWorld Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author admin
 * @version
 * @since Ver 1.1
 * @Date 2017年12月21日 下午3:43:13
 *
 * @see
 * 
 */

@Controller
public class HelloWorld {

	@RequestMapping("/helloword")
	public String hello(Map<String, Object> map,EUser user ) {
		System.out.println("user"+user.getUsername()+"-*---"+user.getPassword()+"--"+user.getIdcard().getMa());
		
		map.put("aaa", user.getUsername());
		return "success";
	}

}
