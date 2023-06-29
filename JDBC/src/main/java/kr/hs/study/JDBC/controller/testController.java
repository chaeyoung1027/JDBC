package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/write_form")
    public String write_form(){

        return "write_form";
    }
    @PostMapping("/write_form")
    public String write_form(@ModelAttribute myUserDTO dto){
        System.out.println("아이디 : "+dto.getId());
        System.out.println("이름 : "+dto.getName());

        return "write_form";
    }
}
