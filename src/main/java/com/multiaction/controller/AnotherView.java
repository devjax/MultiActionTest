package com.multiaction.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component("anotherView")
public class AnotherView implements View {

	public String getContentType() {
		return "text/html";
	}

	public void render(Map<String, ?> map, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		PrintWriter writer = httpServletResponse.getWriter();
		writer.println("This is my another custom dummy view.<br/>");
		writer.println("<h3>Model attributes</h3>");
	}

}
