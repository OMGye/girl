package com.imooc.girl.dao;

import com.imooc.girl.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlResp extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}
