package com.struts2.intercept;

import java.util.*;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {

		String output = "Pre-Processing";
		System.out.println(output);

		String result = invocation.invoke();

		output = "Post-Processing";
		System.out.println(output);

		System.out.println(result);
		
		return result;
	}
}