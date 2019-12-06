package com.nicekkong.bootservice.webservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public String main() {
        System.out.println("main handler~!!");
        return "main";
    }
}
