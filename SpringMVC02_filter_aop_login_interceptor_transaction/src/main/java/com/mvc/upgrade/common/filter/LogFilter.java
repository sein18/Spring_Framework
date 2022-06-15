package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogFilter implements Filter{

	//logger 객체 생성
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	//결과를 다음에 있는 필터 dofilter로 넘겨줘야한다. 마지막 filter에서는 서블릿으로 넘겨준다.
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");
		String agent = req.getHeader("Uesr-Agent");
		
//		logger.info("remoteAddr: " + remoteAddr);
//		logger.info("uri: " + uri);
//		logger.info("url: " + url);
//		logger.info("queryString: " + queryString);
//		logger.info("referer: " + referer);
//		logger.info("agent: " + agent);
		
		String str = remoteAddr + "\n" + uri + "\n" + url + "\n" + queryString + "\n" + referer + "\n" + agent;
		logger.info("LOG FILTER\n" + str);
		
		chain.doFilter(req, response);
		
	}

	@Override
	public void destroy() {
		
	}

}
