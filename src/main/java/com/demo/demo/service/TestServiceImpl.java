package com.demo.demo.service;

import com.demo.demo.dao.TestDao;
import com.demo.demo.entity.Yonghu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl {
    @Resource
    private TestDao testDao;
    public List<Yonghu> getUser(){
        List<Yonghu> list = testDao.selectAllUsers();
        return list;
    }
}
