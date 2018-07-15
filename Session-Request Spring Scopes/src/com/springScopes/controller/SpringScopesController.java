package com.springScopes.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springScopes.Service.RequestScope;
import com.springScopes.Service.SessionScope;

@Controller
public class SpringScopesController {
	@Autowired
	RequestScope requestScope;
	@Autowired
	SessionScope sessionScope;

	@RequestMapping("/")
	public void ScopesController(HttpServletResponse response) throws IOException {

		response.getWriter().write("**********************  request scope  ********************** <br>");
		response.getWriter().write("Old number: " + requestScope.getNumber() + "<br>");
		requestScope.generateRandomNumber();
		response.getWriter().write("New Number: " + requestScope.getNumber() + "<br>");
		response.getWriter().write("Object reference: " + requestScope + "<br>");

		response.getWriter().write("**********************  session scope  ********************** <br>");
		response.getWriter().write("Old number: " + sessionScope.getNumber() + "<br>");
		sessionScope.generateRandomNumber();
		response.getWriter().write("New Number: " + sessionScope.getNumber() + "<br>");
		response.getWriter().write("Object reference: " + sessionScope + "<br>");

	}

}
