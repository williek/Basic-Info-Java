package com.example.basicinfojava;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("*")
  public Response response(HttpServletRequest request, @RequestHeader("User-Agent") String browser) {
    return new Response(request.getMethod(), request.getRequestURL().toString(), browser);
  }

}
