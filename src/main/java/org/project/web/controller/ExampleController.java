package org.project.web.controller;

import java.util.Locale;
import org.project.web.bo.ExampleBO;
import org.project.web.model.ExampleModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExampleController {
  private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private ExampleBO exampleBO;

  @RequestMapping(value = "/example", method = RequestMethod.GET)
  public String exampleView(Locale locale, Model model) {

    ExampleModel exampleModel = exampleBO.getExample();
    model.addAttribute("user",  exampleModel.getUser());
    model.addAttribute("authenticationString", exampleModel.getAuthenticationString());

    return "exampleView";
  }

}
