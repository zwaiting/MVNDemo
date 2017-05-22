package com.myfirst.Interceptor;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;

import java.util.Properties;

/**
 * Created by LT on 2017/5/12.
 */
public class PageInterceptor implements Interceptor{
	public Object intercept(Invocation invocation) throws Throwable {
		return null;
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target,this);
	}

	public void setProperties(Properties properties) {

	}
}
