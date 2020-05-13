package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    /**
     * ログイン画面のGET用処理
     */
    @GetMapping("/login")
    public String getLogin(Model model) {

        // login/login.htmlに画面遷移
        return "login/login";
    }

    /**
     * ログイン画面のPOST用処理
     */
    @PostMapping("/login")
    public String postLogin(Model model) {

        // login/login.htmlに画面遷移
        return "login/login";
    }
}