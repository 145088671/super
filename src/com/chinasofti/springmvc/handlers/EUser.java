/**
 * EUser.java
 * com.chinasofti.springmvc.handlers
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年12月22日 		admin
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/

package com.chinasofti.springmvc.handlers;
/**
 * ClassName:EUser
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   admin
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年12月22日		上午10:02:25
 *
 * @see 	 
 *  
 */
public class EUser {
	private String username;
	private String password;
	private IDcard idcard;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public IDcard getIdcard() {
		return idcard;
	}
	public void setIdcard(IDcard idcard) {
		this.idcard = idcard;
	}

}

