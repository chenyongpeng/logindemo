package com.thoughtworks;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> loginPost(HttpServletRequest request) {
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        Login login = new Login();
        return login.save(username, phone);
    }
}
