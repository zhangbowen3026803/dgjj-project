package io.renren.common.utils;

import java.util.UUID;

public class GlobalUtils {
	
	public static String getUUID32(){
	    String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
	    return uuid;
	}
}
