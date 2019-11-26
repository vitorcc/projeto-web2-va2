package com.provaweb2.projetofaculdade.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping("/index")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("index");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        mv.addObject("usuarioLogado",authentication.getName());
        return mv;
    }

}
