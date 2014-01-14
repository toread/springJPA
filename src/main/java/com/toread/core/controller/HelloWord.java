package com.toread.core.controller;

import com.toread.core.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 14-1-12.
 */
@Controller
@RequestMapping("/")
public class HelloWord {
    @Autowired
    private StudentRepositories studentRepositories;
    @RequestMapping(method = RequestMethod.GET)
    public String helloWord(Model model){
        model.addAttribute("message","你没灭打打");
        return "helloWord";
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String text(){
        return"test";
    }
}
