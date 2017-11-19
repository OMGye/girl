package com.imooc.girl.service;

import com.imooc.girl.dao.GirlResp;
import com.imooc.girl.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlResp girlResp;

    public void insertTwo(){
        Girl girlOne = new Girl();
        girlOne.setCupSize("F");
        girlOne.setAge(15);
        girlResp.save(girlOne);

        Girl girlTwo = new Girl();
        girlTwo.setAge(16);
        girlTwo.setCupSize("BBB");
        girlResp.save(girlTwo);
    }
}
