package com.wang.web.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/***
 * 
* 
* 描    述：MD5 加密方法
*
* 创 建 者： wangl
* 创建时间：  2017年10月29日下午10:12:31
* 创建描述：
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */

public class MD5 {

	public static String getMd5Str(String str) {
		 String value = new SimpleHash("MD5", str, null, 1024).toString();
         return value;
	}
}
