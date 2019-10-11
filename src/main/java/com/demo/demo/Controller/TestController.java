package com.demo.demo.Controller;

import com.demo.common.entity.ResponseBean;
import com.demo.demo.entity.Yonghu;
import com.demo.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aa")
public class TestController {

    @Autowired
    private TestServiceImpl testService;


    @PostMapping("/loginn")
    public String getUser(@RequestParam String username,@RequestParam String password){
        System.out.println(username+"     "+password);
        if("123".equals(username) && "123".equals(password)){
            return "bbb";
        }else{
            return "aaa";
        }
    }
    @RequestMapping("/page")
    public String tiao(){
        return "aaa";
    }

    @GetMapping("/yonghu")
    public ResponseBean getUser(){
        List<Yonghu> list = testService.getUser();
        return new ResponseBean(1, "操作成功",list);
    }
}
