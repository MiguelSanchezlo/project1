package com.adso.project2.controller;

import com.adso.project2.model.Registro;
import com.adso.project2.service.ServiceRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {
    @Autowired
    private ServiceRegistro serviceRegistro;

    @GetMapping("/")
    public String index(){
        return "pages/index";
    }
     /*  @GetMapping("/registro")
    public String registro(){
        return "pages/registro";
    }*/
    @GetMapping("/inicio")
    public String inicio(){
        return "pages/inicio";
    }

    @GetMapping("/register/new")
    public String formRegister(Model model){
        model.addAttribute("registro", new Registro());
        return "pages/registro";
    }

    @PostMapping("/registro")
    public String createRegister(@ModelAttribute Registro registro){
        serviceRegistro.saveRegister(registro);
        return "pages/dataSave";

    }

    @RequestMapping("/lista")
    public String listRegister(Model model){
        model.addAttribute("result", serviceRegistro.getAllRegistro());
        return "pages/lista";
    }


}
