package com.spean.shiro_cas.config.shiro;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import io.buji.pac4j.filter.CallbackFilter;

public class CustomCallbackFilter extends CallbackFilter {

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		super.doFilter(servletRequest, servletResponse, filterChain);
	}
	
}
