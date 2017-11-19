package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = {"/say","speak"},method= RequestMethod.GET)
    @GetMapping(value={"say","speak"})
    public String say(@RequestParam(value="id",required=false,defaultValue = "0") Integer myId){

        return "id: "+myId;
    }
}
