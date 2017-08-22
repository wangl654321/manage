package com.wang.web.shiro.core;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("/static/**", "anon");
		map.put("/bootstrap/login/**", "anon");
		map.put("/", "anon");
		map.put("/login/user/**", "anon");
		map.put("/login/user/loginOut", "logout");
		map.put("/**", "authc");
		
		return map;
	}
	
}
