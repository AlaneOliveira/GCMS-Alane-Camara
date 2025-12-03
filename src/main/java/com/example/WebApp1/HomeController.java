/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WebApp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World! :)";
    }

    @RequestMapping("/Alane")
    public @ResponseBody String greetingFulano() {
        return "Hello, Alane!";
    }

    @RequestMapping("/Teste")
    public @ResponseBody String greetingTeste() {
        return "Olá, novo endpoint!";
    }
    @RequestMapping("/Original")
    public @ResponseBody String greetingOriginal() {
        return "testando no projeto original!";
    }

}
