package controller.command.impl.guest;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;

public class RegistrationPageCommand implements Command {


	public String execute(HttpServletRequest request) {

		return "/registration.jsp";
	}
}
