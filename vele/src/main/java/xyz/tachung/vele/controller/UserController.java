package xyz.tachung.vele.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user") // URL 요청 연결
    public String greeting(Model model) {
        model.addAttribute("username", "jemin");
        return "user"; // 브라우저로 전송!
    }

    @GetMapping("/vip")
    public String layout() {
        return "vip";
    }
}
