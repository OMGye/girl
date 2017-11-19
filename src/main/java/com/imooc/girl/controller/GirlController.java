package com.imooc.girl.controller;

import com.imooc.girl.dao.GirlResp;
import com.imooc.girl.service.GirlService;
import com.imooc.girl.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlResp girlResp;

    @Autowired
    private GirlService girlService;

    @GetMapping(value={"list","girls"})
    public List<Girl> girlList(){

         return girlResp.findAll();
    }
    @PostMapping(value = "girls")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
       Girl girl = new Girl();
       girl.setAge(age);
       girl.setCupSize(cupSize);
       girl = girlResp.save(girl);
      return girl;
    }
    @PostMapping(value="/girl/two")
    public void girlTwo(){

        girlService.insertTwo();
    }
    @PostMapping(value="/girl/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age){

        List<Girl> girl = girlResp.findByAge(age);
        return girl;
    }
}
